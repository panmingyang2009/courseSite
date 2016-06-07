package edu.fzu.softwareengineer.courseSite.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="reply")
public class Reply {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RID")
	private Integer Rid;	//id��������
	
	@Column(name="Rcontent")
	private String content;	//�ظ�����
	
	@Column(name="RcreateDate")
	private Date rCreateDate;	//�ظ�����
	
	//һ�������ж����ظ���һ���ظ�ֻ�����һ�����⡣
	@ManyToOne(targetEntity = Question.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "QID", referencedColumnName = "QID")
	private Question question;	//�ظ�����Ե�����
	
	//һ��ѧ�������ж����ظ���һ���ظ�ֻ����һ��ѧ��������ʦ���������Կ���Ϊnull
	@ManyToOne(targetEntity = Student.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "SID", referencedColumnName = "SID",nullable=true)
	private Student student;	//�ظ���ѧ��
	
	//һ����ʦ�����ж����ظ���һ���ظ�ֻ����һ��ѧ��������ʦ���������Կ���Ϊnull
	@ManyToOne(targetEntity = Teacher.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "TID", referencedColumnName = "TID",nullable=true)
	private Teacher teacher;	//�ظ�����ʦ

	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getRid() {
		return Rid;
	}

	public void setRid(Integer rid) {
		Rid = rid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getrCreateDate() {
		return rCreateDate;
	}

	public void setrCreateDate(Date rCreateDate) {
		this.rCreateDate = rCreateDate;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}
