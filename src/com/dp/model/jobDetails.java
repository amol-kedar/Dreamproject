package com.dp.model;

import java.io.Serializable;

public class jobDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1881359499091841458L;
	private String domain;

	private String jobTitle;

	private String jobDescription;

	private int vacancies;

	private String educationDetails;

	private String ageRange;

	private Physical physical;

	private ValidDates validDates;

	private TestDetails testDetails;

	private Reservation reservation;

	private Fees fees;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public int getVacancies() {
		return vacancies;
	}

	public void setVacancies(int vacancies) {
		this.vacancies = vacancies;
	}

	public String getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(String educationDetails) {
		this.educationDetails = educationDetails;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public Physical getPhysical() {
		return physical;
	}

	public void setPhysical(Physical physical) {
		this.physical = physical;
	}

	public ValidDates getValidDates() {
		return validDates;
	}

	public void setValidDates(ValidDates validDates) {
		this.validDates = validDates;
	}

	public TestDetails getTestDetails() {
		return testDetails;
	}

	public void setTestDetails(TestDetails testDetails) {
		this.testDetails = testDetails;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Fees getFees() {
		return fees;
	}

	public void setFees(Fees fees) {
		this.fees = fees;
	}

}
