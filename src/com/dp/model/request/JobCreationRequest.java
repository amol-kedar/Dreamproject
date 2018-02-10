package com.dp.model.request;

import java.io.Serializable;

import com.dp.model.jobDetails;

public class JobCreationRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2620929080656367295L;

	private jobDetails jobDetails;

	public jobDetails getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(jobDetails jobDetails) {
		this.jobDetails = jobDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JobCreationRequest [jobDetails=").append(jobDetails).append("]");
		return builder.toString();
	}

}
