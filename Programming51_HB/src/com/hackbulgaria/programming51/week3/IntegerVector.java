package com.hackbulgaria.programming51.week3;

public class IntegerVector {

	private int capacity = 8;
	private int size = 0;
	private int[] values = new int[capacity];
	
	public String toString() {
		String result = "";
		for (int i = 0; i < size; i++) {
			result += values[i];
			
			if (i != size - 1) {
				result += ", ";
			}
		}
		return result;
	}
	
	public int size() {
		return size;
	}
	
	public int get(int index) {
		return values[index];
	}
	
	public void add(int e) {
		resizeIfNecessary();
		
		values[size] = e;
		size++;	
	}
	
	public int sum() {
		int result = 0;
		
		for (int i = 0; i < size; i++) {
			result += values[i];
		}
		return result;
	}
	
	public void addAll(int[] array) {
		for (int i = 0; i < array.length; i++) {
			add(array[i]);
		}
	}
	
	private void resizeIfNecessary() {
		if (capacity <= size) {
			capacity = capacity * 2;
			int[] temp = new int[capacity];
			
			for (int i = 0; i < size; i++) {
				temp[i] = values[i];
			}
			values = temp;
		}
	}
	
	public void insert(int index, int data) {
		resizeIfNecessary();
		for (int i = size; i > index; i--) {
			values[i] = values[i - 1];
		}
			
		values[index] = data;
		size++;	
	}

	public void remove(int index) {
		for (int i = index; i + 1 < size; i++) {
			values[i] = values[i + 1];
		}
		size--;
	}
}
