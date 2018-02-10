package com.dp.model;

import java.io.Serializable;

public class Physical implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3179007171274824514L;
	private double weight;

	private double height;

	private String Description;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Physical [weight=").append(weight).append(", height=").append(height).append(", Description=")
				.append(Description).append("]");
		return builder.toString();
	}

}
