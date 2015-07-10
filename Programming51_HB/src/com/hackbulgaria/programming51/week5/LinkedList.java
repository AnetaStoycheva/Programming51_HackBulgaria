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
		while (temp != null) {
			if (counter == index) {
				break;
			}
			temp = temp.next;
			counter++;
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
		Node<T> newNode = new Node<>(value);
		newNode.setNext(head);
		head = newNode;
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
		while (true) {
			if (temp.getData() == value) {
				return counter;
			} else {
				temp = temp.getNext();
				counter++;
				if (temp == null) {
					return -1;
				}
			}
		}
	}

	public int getElementIndex(T data) {
		// Return the index of the specified element, else -> -1
		return findElementByData(data);
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

	public void removeAll() {
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

	// public static void main(String[] args) {
	// LinkedList<Integer> l = new LinkedList<>();
	// for (int i = 10; i < 20; i++) {
	// l.addLast(i);
	// }
	// System.out.println(l);
	// l.insertAfter(2, 5);
	// System.out.println(l);
	// l.insert(1, 100);
	// System.out.println(l);
	// l.set(1, 200);
	// System.out.println(l);
	// l.remove(1);
	// System.out.println(l);
	// l.addFirst(8);
	// System.out.println(l);
	// System.out.println(l.size());
	// l.removeAll();
	// System.out.println(l);
	// }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<>();

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			l.addLast(scanner.nextInt());
		}
		l.insertAfter(3, scanner.nextInt());
		l.remove(2);
		l.addFirst(scanner.nextInt());

		int x = scanner.nextInt();

		System.out.println(l.contains(x));
		System.out.println(l.getFirst() + " " + l.getLast());
		System.out.println(l);
	}
}
