package edu.fzu.softwareengineer.courseSite.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Punmy on 16/6/5.
 */
@Entity
@Table(name="notice")
public class Notice {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="NID")
    private Integer id;

    @Column(name="NTitle")
    private String title;

    @Column(name="NContent")
    private String content;

    @Column(name="NcreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @ManyToOne(targetEntity = Teacher.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "TID", referencedColumnName = "TID", nullable = false)
    private Teacher teacher;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

    
}
