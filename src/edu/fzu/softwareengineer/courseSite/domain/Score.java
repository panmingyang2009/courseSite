package edu.fzu.softwareengineer.courseSite.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="score")
public class Score {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SCID")
	private Integer SCid;	//id,自增长
	
	@Column(name="SCtype")
	private String Type;	//分数的类型
	
	@Column(name="SscoreNum")
	private double scoreNum;	//分数值
	
	@Column(name="SCcreateDate")
	private Date scCreateDate;	//创建日期
	
	// 一个学生有多种类型的分数
	@ManyToOne(targetEntity = Student.class)
	@JoinColumn(name="SID",referencedColumnName="SID")
	private Student student;

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSCid() {
		return SCid;
	}

	public void setSCID(Integer sCid) {
		SCid = sCid;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public double getScoreNum() {
		return scoreNum;
	}

	public void setScoreNum(double scoreNum) {
		this.scoreNum = scoreNum;
	}

	public Date getScCreateDate() {
		return scCreateDate;
	}

	public void setScCreateDate(Date scCreateDate) {
		this.scCreateDate = scCreateDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
}
