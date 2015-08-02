package com.hackbulgaria.programming51.week5;

public class Node<T> {
	public T value;
	public Node<T> next;
	
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
	
	public Node(T value) {
		this.value = value;
		this.next = null;
	}
	
	public T getData() {
		return value;
	}
	
	public void setData(T value) {
		this.value = value;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
}
