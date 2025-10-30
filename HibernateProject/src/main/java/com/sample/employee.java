package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class employee {
	private String eName;
	private double eSal;
	@Id
	private int id;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(String eName, double eSal, int id) {
		super();
		this.eName = eName;
		this.eSal = eSal;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
