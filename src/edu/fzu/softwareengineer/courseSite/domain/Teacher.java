package edu.fzu.softwareengineer.courseSite.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="teacher")
public class Teacher {
	@Id
	@GenericGenerator(name="assigned",strategy="assigned")
	@GeneratedValue(generator="assigned")
	@Column(name="TID")
	private Integer Tid;//id,����
	
	@Column(name = "Spsw", nullable = false)
	private String psw;//����
	
	@Column(name="Tname")
	private String name;//����
	
	@Column(name="Tsex")
	private String sex;//�Ա�
	
	@Column(name="Tcourse")
	private String course;//���̿γ�
	
	@Column(name="Tphone")
	private String phone;//�绰����
	
	@Column(name="Ttime")
	private String time;//�Ͽ�ʱ��
	
	@Column(name="Taddr")
	private String addr;//�Ͽεص�
	
	@Column(name="Tplan")
	private String plan;//�ڿμƻ�
	
	@Column(name="TcreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date tCreateDate;//����ʱ��
	
	// һ��ѧ���ľ�Ʒ�γ�ֻ����һ����ʦ�̣�һ����ʦ���Խ̶���ѧ��
	@OneToMany(targetEntity=Student.class,mappedBy="teacher")
	private Set<Student> students=new HashSet<Student>();//����ѧ��
	
	//һ����ʦ�����ж����ظ���һ���ظ�ֻ����һ����ʦ��ѧ������
	@OneToMany(targetEntity=Reply.class,mappedBy="teacher")
	private Set<Reply>replies;//�ظ���̳����

	@OneToMany(targetEntity = Notice.class, mappedBy = "teacher")
	private Set<Notice> notices;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTid() {
		return Tid;
	}

	public void setTid(Integer tid) {
		Tid = tid;
	}
	public Set<Notice> getNotices() {
		return notices;
	}

	public void setNotices(Set<Notice> notices) {
		this.notices = notices;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public Date gettCreateDate() {
		return tCreateDate;
	}

	public void settCreateDate(Date tCreateDate) {
		this.tCreateDate = tCreateDate;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Reply> getReplies() {
		return replies;
	}

	public void setReplies(Set<Reply> replies) {
		this.replies = replies;
	}
	
}
