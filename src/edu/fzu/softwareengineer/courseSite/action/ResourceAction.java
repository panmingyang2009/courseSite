package edu.fzu.softwareengineer.courseSite.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.fzu.softwareengineer.courseSite.domain.Resource;
import edu.fzu.softwareengineer.courseSite.service.StudentService;
import edu.fzu.softwareengineer.courseSite.service.TeacherService;

public class ResourceAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<File> upload;
	private List<String> uploadContentType;
	private List<String> uploadFileName;
	private long maximumSize;
	private String allowedTypes;
	private Integer coursewareId;

	private final String COURSEWARE = "courseware";
	private final String HOMEWORK = "homework";

	private Resource resource;
	private TeacherService teacherService;
	private StudentService studentService;

	// 下载的文件名
	private String fileName;
	// 输入流
	private InputStream inputStream;

	// 老师上传课件
	public String uploadCourseware() throws Exception {
		// TODO Auto-generated method stub
		uploadFile("D:\\temp\\", "teacher");
		return "success";
	}

	// 学生上传作业
	public String uploadHomework() {
		ActionContext.getContext().getSession().put("user", "student");
		uploadFile("D:\\homework\\", "student");
		return SUCCESS;
	}

	// 学生得到课件的列表
	public String getCourseware() {
		List<Resource> list = studentService.getCourseware();
		// System.out.println("list:" + list.size() + "--" + list.toString());
		Map coursewareMap = (Map) ActionContext.getContext().get("request");
		coursewareMap.put("CoursewareList", list);
		return "showCoursewareList";
	}

	// 得到作业的列表
	public String getHomework() {
		List<Resource> list = teacherService.getHomeworks();
		// System.out.println("list:" + list.size() + "--" + list.toString());
		Map coursewareMap = (Map) ActionContext.getContext().get("request");
		coursewareMap.put("HomeworkList", list);
		return "showHomeworkList";
	}

	// 删除课件
	public String deleteCourseware() {
		teacherService.deleteCourseware(coursewareId);
		return getCourseware();
	}

	// 得到流,给用户下载
	public InputStream getInputStream() {
		try {
			System.out.println("role=="+ActionContext.getContext().getSession().get("user").toString());
			if ((ActionContext.getContext().getSession().get("user").toString()).equals("student"))
				inputStream = new FileInputStream("D:\\temp\\" + fileName);
			if ((ActionContext.getContext().getSession().get("user").toString()).equals("teacher"))
				inputStream = new FileInputStream("D:\\homework\\" + fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("文件没有找到");
		}

		if (fileName != null) {
			try {
				fileName = URLEncoder.encode(fileName, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				System.out.println("转码失败！！！");
				e.printStackTrace();
			}
		}
		if (inputStream == null) {
			System.out.println("getResource error!");
		}
		System.out.println("FileName : " + fileName);
		return inputStream;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("fileName==" + fileName);
		return SUCCESS;
	}

	// 上传文件公共代码
	public void uploadFile(String path, String user) {
		for (int i = 0; i < upload.size(); i++) {
			String savePath = path + uploadFileName.get(i);
			FileOutputStream fos = null;
			FileInputStream fis = null;
			try {
				fos = new FileOutputStream(savePath);
				fis = new FileInputStream(upload.get(i));
				byte[] buffer = new byte[1024];
				int len = 0;
				while ((len = fis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					fos.close();
					fis.close();
					upload.get(i).delete();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			resource = new Resource();
			resource.setName(uploadFileName.get(i));
			resource.setPath(savePath);
			resource.setUploadDate(new Date());
			resource.setDownloadTimes(0);
			if (user.equals("teacher")) {
				resource.setType(COURSEWARE);
				teacherService.uploadCourseware(resource);
			} else if (user.equals("student")) {
				resource.setType(HOMEWORK);
				studentService.uploadHomework(resource);
			}
		}
	}

	public long getMaximumSize() {
		return maximumSize;
	}

	public void setMaximumSize(long maximumSize) {
		this.maximumSize = maximumSize;
	}

	public String getAllowedTypes() {
		return allowedTypes;
	}

	public void setAllowedTypes(String allowedTypes) {
		this.allowedTypes = allowedTypes;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public List<File> getUpload() {
		return upload;
	}

	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

	public List<String> getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public List<String> getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public Integer getCoursewareId() {
		return coursewareId;
	}

	public void setCoursewareId(Integer coursewareId) {
		this.coursewareId = coursewareId;
	}

}
