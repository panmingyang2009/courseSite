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
@Table(name="assignment")
public class Assignment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AID")
	private Integer Aid;
	
	@Column(name="Atitle")
	private String title;
	
	@Column(name="Arequire")
	private String require;
	
	@Column(name="AcreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date aCreateDate;
	
	@ManyToOne(targetEntity = Teacher.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "TID", referencedColumnName = "TID", nullable = false)
	private Teacher teacher;

	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAid() {
		return Aid;
	}

	public void setAid(Integer aid) {
		Aid = aid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRequire() {
		return require;
	}

	public void setRequire(String require) {
		this.require = require;
	}

	public Date getaCreateDate() {
		return aCreateDate;
	}

	public void setaCreateDate(Date aCreateDate) {
		this.aCreateDate = aCreateDate;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}
