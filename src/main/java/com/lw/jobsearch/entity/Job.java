package com.lw.jobsearch.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String companyName;
	
	@Column
	private String jobTitle;
	
	@Column
	private LocalDate dateApplied;
	
	@Column
	private boolean interview;
	
	@Column
	private boolean offerMade;
	
	@Column
	private String status;

	public Job() {
		super();
	}	

	public Job(String companyName, String jobTitle, LocalDate dateApplied, boolean interview, boolean offerMade,
			String status) {
		super();
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.dateApplied = dateApplied;
		this.interview = interview;
		this.offerMade = offerMade;
		this.status = status;
	}

	public Job(long id, String companyName, String jobTitle, LocalDate dateApplied, boolean interview,
			boolean offerMade, String status) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.dateApplied = dateApplied;
		this.interview = interview;
		this.offerMade = offerMade;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public LocalDate getDateApplied() {
		return dateApplied;
	}

	public void setDateApplied(LocalDate dateApplied) {
		this.dateApplied = dateApplied;
	}

	public boolean isInterview() {
		return interview;
	}

	public void setInterview(boolean interview) {
		this.interview = interview;
	}

	public boolean isOfferMade() {
		return offerMade;
	}

	public void setOfferMade(boolean offerMade) {
		this.offerMade = offerMade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", companyName=" + companyName + ", jobTitle=" + jobTitle + ", dateApplied="
				+ dateApplied + ", interview=" + interview + ", offerMade=" + offerMade + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(companyName, dateApplied, id, interview, jobTitle, offerMade, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		return Objects.equals(companyName, other.companyName) && Objects.equals(dateApplied, other.dateApplied)
				&& id == other.id && interview == other.interview && Objects.equals(jobTitle, other.jobTitle)
				&& offerMade == other.offerMade && Objects.equals(status, other.status);
	}
	
	
	

}
