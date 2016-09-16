package com.redhat.training;

import java.io.Serializable;

public class Order implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int id;
		private String description;
		private double value;
		private double tax;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getValue() {
			return value;
		}
		public void setValue(double value) {
			this.value = value;
		}
		public double getTax() {
			return tax;
		}
		public void setTax(double tax) {
			this.tax = tax;
		}
		
		
		

}
