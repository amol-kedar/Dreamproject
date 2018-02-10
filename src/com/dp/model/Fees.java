package com.dp.model;

import java.io.Serializable;

public class Fees implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7557371899469022219L;
	private double sc;

	private double nt;

	private double obc;

	private double open;

	public double getSc() {
		return sc;
	}

	public void setSc(double sc) {
		this.sc = sc;
	}

	public double getNt() {
		return nt;
	}

	public void setNt(double nt) {
		this.nt = nt;
	}

	public double getObc() {
		return obc;
	}

	public void setObc(double obc) {
		this.obc = obc;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fees [sc=").append(sc).append(", nt=").append(nt).append(", obc=").append(obc).append(", open=")
				.append(open).append("]");
		return builder.toString();
	}

}
