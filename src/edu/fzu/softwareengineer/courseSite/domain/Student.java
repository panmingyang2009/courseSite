package edu.fzu.softwareengineer.courseSite.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GenericGenerator(name="assigned",strategy="assigned")
	@GeneratedValue(generator="assigned")
	@Column(name = "SID")
	private Integer Sid;// id,学号

	@Column(name = "Spsw", nullable = false)
	private String psw;// 密码

	@Column(name = "Sname", nullable = false)
	private String name;// 姓名

	@Column(name = "Ssex")
	private String sex;// 性别

	@Column(name = "Sguide")
	private String guide;// 辅导员姓名

	@Column(name = "Smajor")
	private String major;// 专业

	@Column(name = "Sclass")
	private String s_class;// 班级

	@Column(name = "Sgrade")
	private Integer grade;// 年级

	@Column(name = "Sphone")
	private String phone;// 电话号码

	@Column(name = "Semail")
	private String email;// 邮箱

	@Column(name = "ScreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date sCreateDate;// 创建时间

	// 一个学生的精品课程只能由一个老师教，一个老师可以教多名学生
	@ManyToOne(targetEntity = Teacher.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "TID", referencedColumnName = "TID", nullable = false)
	private Teacher teacher;// 老师

	// 一个学生可以提多个问题，一个问题只能被一个学生提出
	@OneToMany(targetEntity = Question.class, mappedBy = "student")
	private Set<Question> questions = new HashSet<Question>();// 提问题

	// 一个学生可以有多条回复，一条回复只能由一个学生或老师产生
	@OneToMany(targetEntity = Reply.class, mappedBy = "student")
	private Set<Reply> replies = new HashSet<Reply>();// 学生在论坛中所回复问题

	// 一个学生有多种类型的分数
	@OneToMany(targetEntity = Score.class,mappedBy="student")
	 private Set<Score> scores=new HashSet<Score>();

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSid() {
		return Sid;
	}

	public void setSid(Integer sid) {
		Sid = sid;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getGuide() {
		return guide;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getS_class() {
		return s_class;
	}

	public void setS_class(String s_class) {
		this.s_class = s_class;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getsCreateDate() {
		return sCreateDate;
	}

	public void setsCreateDate(Date sCreateDate) {
		this.sCreateDate = sCreateDate;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	public Set<Reply> getReplies() {
		return replies;
	}

	public void setReplies(Set<Reply> replies) {
		this.replies = replies;
	}
	
	public Set<Score> getScores() {
		return scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

	
}
