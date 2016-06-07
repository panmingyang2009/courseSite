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
	private Integer Qid;	//问题id，自增长
	
	@Column(name="Qtitle")
	private String title;	//问题标题
	
	@Column(name="Qcontent")
	private String content;	//问题内容
	
	@Column(name="QcreateDate")
	private Date qCreateDate;	//提问时间
	
	// 一个学生可以提多个问题，一个问题只能被一个学生提出
	@ManyToOne(targetEntity = Student.class)
	@JoinColumn(name = "SID", referencedColumnName = "SID", nullable = false)
	private Student student;	//提问的学生
	
	//一个问题有多条回复，一条回复只能针对一个问题。
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
