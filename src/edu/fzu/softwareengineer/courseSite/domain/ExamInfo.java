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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="examInfo")
public class ExamInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EID")
	private Integer Eid;
	
	@Column(name="EexamTime")
	private String examTime;
	
	@Column(name="EexamAddr")
	private String examAddr;
	
	@Column(name="EcreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date eCreateDate;
	
	@ManyToOne(targetEntity = Teacher.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "TID", referencedColumnName = "TID", nullable = false)
	private Teacher teacher;

	public ExamInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEid() {
		return Eid;
	}

	public void setEid(Integer eid) {
		Eid = eid;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public String getExamAddr() {
		return examAddr;
	}

	public void setExamAddr(String examAddr) {
		this.examAddr = examAddr;
	}

	public Date geteCreateDate() {
		return eCreateDate;
	}

	public void seteCreateDate(Date eCreateDate) {
		this.eCreateDate = eCreateDate;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}
