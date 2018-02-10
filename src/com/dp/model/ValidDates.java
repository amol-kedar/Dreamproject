package com.dp.model;

import java.io.Serializable;
import java.util.Date;

public class ValidDates implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4321773382466772901L;
	private Date startDate;

	private Date endDate;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ValidDates [startDate=").append(startDate).append(", endDate=").append(endDate).append("]");
		return builder.toString();
	}

}
