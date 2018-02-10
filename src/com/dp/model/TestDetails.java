package com.dp.model;

import java.io.Serializable;

public class TestDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4686185046997202973L;
	private String physical;

	public String getPhysical() {
		return this.physical;
	}

	public void setPhysical(String physical) {
		this.physical = physical;
	}

	private String written;

	public String getWritten() {
		return this.written;
	}

	public void setWritten(String written) {
		this.written = written;
	}
}