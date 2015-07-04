package com.hackbulgaria.programming51.week3;

import java.util.ArrayList;

public class Travel {

	private String country = "";
	private String city = "";
	private int vat = 0;
	private ArrayList<TravelExpense> expenses = new ArrayList<>();
	
	public Travel(String country, String city, int vat) {
		this.country = country;
		this.city = city;
		this.vat = vat; 
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getCity() {
		return city;
	}
	
	public int getVat() {
		return vat;
	}
	
	public void addExpense(TravelExpense expense) {
		expenses.add(expense);
	}
	
	public double totalNetCost() {
		double result = 0.0;
		for (int i = 0; i < expenses.size(); i++) {
			result += expenses.get(i).getCost();
		}
		return result;
	}
	
	public double totalCost() {
		double result = totalNetCost();
		result = result + (result * (this.vat / 100.0));
		return result;
	}
	
	public Employee[] mostExpensesMadeBy() {
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Double> values = new ArrayList<>();
		
		for (int i = 0; i < expenses.size(); i++) {
			Employee employee = expenses.get(i).getEmployee();
			double value = expenses.get(i).getCost();
			boolean found = false;
			for (int j = 0; j < employees.size(); j++) {
				if (employees.get(j).getName().equals(employee.getName())) {
					values.set(j, values.get(j) + value);
					found = true;
				}
			}
			if (!found) {
				employees.add(employee);
				values.add(value);
			}
		}
		
		int largest = -1;
		for (int i = 0; i < values.size(); i++) {
			if (largest == -1 || values.get(i) > values.get(largest)) {
				largest = i;
			}
		}
		
		int secondLargest = -1;
		for (int i = 0; i < values.size(); i++) {
			if (i == largest) {
				continue;
			}
			if (secondLargest == -1 || values.get(i) > values.get(secondLargest)) {
				secondLargest = i;
			}
		}
		
		Employee[] result = new Employee[2];
		result[0] = employees.get(largest);
		result[1] = employees.get(secondLargest);
		return result;
	}
	
	
	public String toString() {
		String result = "";
		for (int i = 0; i < expenses.size(); i++) {
			result += expenses.get(i).toString() + "\n";
		}
		return result;
	}
}
