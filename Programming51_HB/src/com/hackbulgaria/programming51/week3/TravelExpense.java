package com.hackbulgaria.programming51.week3;

public class TravelExpense {
	
	private String type = "";
	private Employee employee;
	private double cost = 0.0;
	
	public TravelExpense(String type, Employee employee, double cost) {
		this.type = type;
		this.employee = employee;
		this.cost = cost;
	}
	
	public String getType() {
		return type;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public double getCost() {
		return cost;
	}
	
	public String toString() {
		return "Type: " + type + " Employee: " + employee + " netCost: " + cost;
	}
}
