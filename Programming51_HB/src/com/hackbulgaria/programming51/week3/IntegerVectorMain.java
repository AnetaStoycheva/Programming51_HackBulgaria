package com.hackbulgaria.programming51.week3;

public class IntegerVectorMain {

	public static void main(String[] args) {
	    IntegerVector v = new IntegerVector();
//	    for (int i = 0; i < 20; i++) {
//	        v.add(i);
//	    }
//	    v.add(50);
//	    System.out.println(v.size());
//	    
//	    v = new IntegerVector();
//	    for (int i = 0; i < 20; i++) {
//	        v.add(i);
//	    }
//	    System.out.println(v.sum());
//	    
//	    v = new IntegerVector();
//	    for (int i = 0; i < 20; i++) {
//	        v.add(i);
//	    }
//
//	    System.out.println(v.get(3));
//	    System.out.println(v.get(9));
//	    
//	    v = new IntegerVector();
//	    for (int i = 0; i < 20; i++) {
//	        v.add(i);
//	    }
//
//	    int [] b = new int[10];
//	    for (int i = 0; i < 10; i++) {
//	        b[i] = i;
//	    }
//	    v.addAll(b);
//	    System.out.println(v);
//	    
//	    v = new IntegerVector();
//	    for (int i = 0; i < 10; i++) {
//	        v.add(i);
//	    }
//	    System.out.println(v);
//	    v.insert(3,10);
//	    System.out.println(v);
	    
	    v = new IntegerVector();
	    for (int i = 0; i < 10; i++) {
	        v.add(i);
	    }
	    System.out.println(v);
	    v.remove(3);
	    System.out.println(v);
	}
}
