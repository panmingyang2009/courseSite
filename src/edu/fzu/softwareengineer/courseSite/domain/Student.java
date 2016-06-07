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
	private Integer Sid;// id,ѧ��

	@Column(name = "Spsw", nullable = false)
	private String psw;// ����

	@Column(name = "Sname", nullable = false)
	private String name;// ����

	@Column(name = "Ssex")
	private String sex;// �Ա�

	@Column(name = "Sguide")
	private String guide;// ����Ա����

	@Column(name = "Smajor")
	private String major;// רҵ

	@Column(name = "Sclass")
	private String s_class;// �༶

	@Column(name = "Sgrade")
	private Integer grade;// �꼶

	@Column(name = "Sphone")
	private String phone;// �绰����

	@Column(name = "Semail")
	private String email;// ����

	@Column(name = "ScreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date sCreateDate;// ����ʱ��

	// һ��ѧ���ľ�Ʒ�γ�ֻ����һ����ʦ�̣�һ����ʦ���Խ̶���ѧ��
	@ManyToOne(targetEntity = Teacher.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "TID", referencedColumnName = "TID", nullable = false)
	private Teacher teacher;// ��ʦ

	// һ��ѧ�������������⣬һ������ֻ�ܱ�һ��ѧ�����
	@OneToMany(targetEntity = Question.class, mappedBy = "student")
	private Set<Question> questions = new HashSet<Question>();// ������

	// һ��ѧ�������ж����ظ���һ���ظ�ֻ����һ��ѧ������ʦ����
	@OneToMany(targetEntity = Reply.class, mappedBy = "student")
	private Set<Reply> replies = new HashSet<Reply>();// ѧ������̳�����ظ�����

	// һ��ѧ���ж������͵ķ���
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
