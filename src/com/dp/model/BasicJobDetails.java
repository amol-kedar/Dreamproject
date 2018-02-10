package com.dp.model;

import java.io.Serializable;

import javax.ws.rs.core.Link;

public class BasicJobDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 781427860415288920L;
	
	private String domain;

	private String jobTitle;

	private String jobDescription;
	
	private Link link;

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

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BasicJobDetails [domain=").append(domain).append(", jobTitle=").append(jobTitle)
				.append(", jobDescription=").append(jobDescription).append(", link=").append(link).append("]");
		return builder.toString();
	}
	
	

}
