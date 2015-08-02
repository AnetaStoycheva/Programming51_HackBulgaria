package com.hackbulgaria.programming51.week5;

import java.util.Arrays;
import java.util.Scanner;

	
public class LinkedListMain {	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        int n;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            l.addLast(scanner.nextInt());
        }

        System.out.println(l);

        l.insert(3, scanner.nextInt());

        System.out.println(l);

        l.remove(2);
        System.out.println(l);


        l.addFirst(scanner.nextInt());
        System.out.println(l);

        int x = scanner.nextInt();

        System.out.println(l.contains(x));
        System.out.println(l.getFirst() + " " + l.getLast());
        System.out.println(l);
    }
	
	
//	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        LinkedList<Integer> list1 = new LinkedList<>();
//        LinkedList<Integer> list2 = new LinkedList<>();
//        Integer [] arr;
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            list1.addLast(scanner.nextInt());
//        }
//        n = scanner.nextInt();
//        arr = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        list2.addArray(arr);
//        list1.insertListBefore(0, list2);
//        list1.insertListAfter(0, list2);
//
//        System.out.println(list1);
//
//        Integer[] array = list1.toArray(new Integer[list1.size()]);
//
//		// print the array
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println("Array:" + array[i]);
//		}
//		
//		System.out.println(Arrays.toString(array));
//		System.out.println();
//	}
	
}
