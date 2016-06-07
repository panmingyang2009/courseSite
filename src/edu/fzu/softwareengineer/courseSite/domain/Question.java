package edu.fzu.softwareengineer.courseSite.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="question")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QID")
	private Integer Qid;	//����id��������
	
	@Column(name="Qtitle")
	private String title;	//�������
	
	@Column(name="Qcontent")
	private String content;	//��������
	
	@Column(name="QcreateDate")
	private Date qCreateDate;	//����ʱ��
	
	// һ��ѧ�������������⣬һ������ֻ�ܱ�һ��ѧ�����
	@ManyToOne(targetEntity = Student.class)
	@JoinColumn(name = "SID", referencedColumnName = "SID", nullable = false)
	private Student student;	//���ʵ�ѧ��
	
	//һ�������ж����ظ���һ���ظ�ֻ�����һ�����⡣
	@OneToMany(targetEntity=Reply.class,mappedBy="question")
	private Set<Reply> replies;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getQid() {
		return Qid;
	}

	public void setQid(Integer qid) {
		Qid = qid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getqCreateDate() {
		return qCreateDate;
	}

	public void setqCreateDate(Date qCreateDate) {
		this.qCreateDate = qCreateDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Set<Reply> getReplies() {
		return replies;
	}

	public void setReplies(Set<Reply> replies) {
		this.replies = replies;
	}

}
