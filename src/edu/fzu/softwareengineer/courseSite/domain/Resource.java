package edu.fzu.softwareengineer.courseSite.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "resource")
public class Resource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Rid;

	@Column(name = "Rname" , unique=true)
	private String name;

	@Column(name = "Rpath")
	private String path;

	@Column(name = "Rtype")
	private String type;

	@Column(name = "RdownloadTimes", nullable = true)
	private Integer downloadTimes;

	@Column(name = "RuploadDate", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date uploadDate;

	public Integer getRid() {
		return Rid;
	}

	public void setRid(Integer rid) {
		Rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getDownloadTimes() {
		return downloadTimes;
	}

	public void setDownloadTimes(Integer downloadTimes) {
		this.downloadTimes = downloadTimes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}

}
