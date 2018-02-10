package com.dp.model;

import java.io.Serializable;

public class Reservation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6561339813369571558L;

	private int sc;

	private int nt;

	private int obc;

	private int open;

	public int getSc() {
		return sc;
	}

	public void setSc(int sc) {
		this.sc = sc;
	}

	public int getNt() {
		return nt;
	}

	public void setNt(int nt) {
		this.nt = nt;
	}

	public int getObc() {
		return obc;
	}

	public void setObc(int obc) {
		this.obc = obc;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reservation [sc=").append(sc).append(", nt=").append(nt).append(", obc=").append(obc)
				.append(", open=").append(open).append("]");
		return builder.toString();
	}

}