package com.dp.model.response;

import java.io.Serializable;
import java.util.List;

import com.dp.model.BasicJobDetails;

public class RetrieveJobsResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3961435082104166468L;

	private List<BasicJobDetails> basicJobDetails;

	public List<BasicJobDetails> getBasicJobDetails() {
		return basicJobDetails;
	}

	public void setBasicJobDetails(List<BasicJobDetails> basicJobDetails) {
		this.basicJobDetails = basicJobDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RetrieveJobsResponse [basicJobDetails=").append(basicJobDetails).append("]");
		return builder.toString();
	}

}
