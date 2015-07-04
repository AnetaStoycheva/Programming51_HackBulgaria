package com.hackbulgaria.programming51.week4;

//Generic Vector<T>

public class GenericVector<T> {
	private T[] data;
	private int size = 0;
	private int capacity = 10;

	public GenericVector() {
		data = (T[]) new Object[capacity];
	}

	public T get(int index) {
		return data[index];
	}

	public void set(int index, T el) {
		data[index] = el;
	}

	public int size() {
		return size;
	}

	public void add(T el) {
		if (size == capacity) {
			resize();
		}
		data[size] = el;
		size++;
	}

	public void insert(int index, T el) {
		if (size == capacity) {
			resize();
		}
		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
			
		data[index] = el;
		size++;	
	}

	public void remove(int index) {
		for (int i = index; i + 1 < size; i++) {
			data[i] = data[i + 1];
		}
		size--;
	}

	private void resize() {
		capacity = capacity * 2 + 1;
		T[] temp = (T[]) new Object[capacity];
		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < size; i++) {
			result += data[i];

//			if (i != size - 1) {
//				result += ", ";
//			}
		}
		return result;
	}

	public boolean contains(T el) {
		for (int i = 0; i < size; i++) {
			if (data[i].equals(el)) {
				return true;
			}
		}
		return false;
	}
}