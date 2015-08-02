package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void addLast(T value) {
		// Append an element to the end of the list

		Node<T> temp = new Node<>(value);

		if (head == null) {
			head = temp;
		} else {
			tail.next = temp;
		}

		tail = temp;
	}

	public T get(int index) {
		// Return the element at the index place
		return getElement(index).getData();
	}

	public void set(int index, T el) {
		getElement(index).setData(el);
	}

	private Node<T> getElement(int index) {
		int counter = 0;
		Node<T> temp = head;
		for (; counter < index && temp != null; counter++, temp = temp.next) {
		}
		return temp;
	}

	public T getFirst() {
		// Return the first element of the list
		return head.getData();
	}

	public T getLast() {
		// Return the last element of the list
		return tail.getData();
	}

	public void addFirst(T value) {
		// Insert an element at the beginning of the list
		head = new Node<>(value, head);
		if (tail == null) {
			tail = head;
		}
	}

	private void insertAfter(int index, T value) {
		Node<T> temp = new Node<>(value);
		Node<T> indexNode = getElement(index);

		temp.next = indexNode.next;
		indexNode.next = temp;
	}

	public void insert(int index, T value) {
		// Insert an element on the index place
		insertAfter(index - 1, value);
	}

	public void remove(int index) {
		// Remove an element form the index place
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> temp = getElement(index - 1);
			temp.next = temp.next.next;
		}
	}

	public boolean contains(T value) {
		// Return true if the list contains the element
		return getElementIndex(value) != -1;
	}

	private int findElementByData(T value) {
		Node<T> temp = head;
		int counter = 0;
		for (; temp != null && temp.getData() != value; temp = temp.getNext(), counter++) {
		}
		return temp == null ? -1 : counter;
		
//		if (temp == null) {
//			return -1;
//		} else {
//			return counter;
//		}
//		while (true) {
//			if (temp.getData() == value) {
//				return counter;
//			} else {
//				temp = temp.getNext();
//				counter++;
//				if (temp == null) {
//					return -1;
//				}
//			}
//		}
	}

	public int getElementIndex(T data) {
		// Return the index of the specified element, else -> -1
		return findElementByData(data);
	}

	public void removeAll() {
		// Remove all elements from the list
		head = null;
		tail = null; // allow garbage collector to do his job
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addAll(T[] values) {
		for (int i = 0; i < values.length; i++) {
			addLast(values[i]);
		}
	}

//	public T[] toArray() {
//		// Returns an array with all the elements in the list
//		T[] result = (T[]) new Object[size()];
//		Node<T> temp = head;
//		int index = 0;
//		while (temp != null) {
//			result[index] = temp.getData();
//			index++;
//			temp = temp.next;
//		}
//		return result;
//	}
	
	public T[] toArray(T[] arr) {
		Node<T> temp = head;
		for (int i= 0; temp != null; i++) {
			arr[i] = temp.value;
			temp = temp.next;
		}
		return arr;
	}
	
	public void addArray(T[] arr) {
		// Appends the array at the end of the list
//		T[] result = (T[]) new Object[size()];
		for (int i = 0; i < arr.length; i++) {
			addLast(arr[i]);
		}
	}
	
	private static <T> LinkedList<T> copy(LinkedList<T> l) {
    	LinkedList<T> newList = new LinkedList<T>();
    	if (l.head == null) {
    		return newList;
    	}
    	Node <T> temp = l.head;
    	while (temp.next != null) {
    		newList.addLast(temp.value);
    		temp = temp.next;
    	}
    	newList.addLast(temp.value);
    	return newList;	
    }

    public void insertListAfter(int index, LinkedList<T> l) {
        // Inserts all the elements of l after the index element
    	l = copy(l);
    	if (l.size() == 0) return;
    	if (size() - 1 == index) {
    		tail.next = l.head;
    		tail = l.tail;
    	} else {
    		Node <T> node = getElement(index); 
    		l.tail.next = node.next;
    		node.next = l.head;
    	}
    	int newsize = size();
    	newsize += l.size();
    }
    public void insertListBefore(int index, LinkedList<T> l){
        // Inserts all the elements of l before the index element
    	l = copy(l);
    	if (index == 0) {
    		l.tail.next = head;
    		head = l.head;
    		int newSize = size();
    		newSize += l.size();
    	} else {
    		insertListAfter(index - 1, l);
    	}
    }
    
	public int size() {
		int counter = 0;
		Node<T> temp = head;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}

	public String toString() {
		String str = "[";
		Node<T> temp = head;
		if (isEmpty()) {
			return "[]";
		}
		while (temp.next != null) {
			str += temp.value + ", ";
			temp = temp.next;
		}
		return str + temp.value + "]";
	}
	
}
