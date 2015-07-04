package com.hackbulgaria.programming51.week3;

public class IntegerVectorStaticMain {

	public static void main(String[] args) {
		{
			int[] a = {1, 2, 3, 4, 5};
			IntegerVector v = new IntegerVector();
			v.addAll(a);
			System.out.println(IntegerVectorStatic.toString(v));
		}
		{
			int[] a = {3, 1, -40, 200, 5};
			IntegerVector v = new IntegerVector();
			v.addAll(a);
			IntegerVectorStatic.sort(v);
			System.out.println(IntegerVectorStatic.toString(v));
		}
		{
			int[] a = {3, 1, -40, 200, 5};
			IntegerVector v = new IntegerVector();
			v.addAll(a);
			IntegerVector temp = IntegerVectorStatic.reverse(v);
			System.out.println(IntegerVectorStatic.toString(temp));
		}
		{
			int[] a = {3, 1, -40, 200, 5};
			IntegerVector v = new IntegerVector();
			v.addAll(a);
			System.out.println(IntegerVectorStatic.join(v, ": "));
			System.out.println(IntegerVectorStatic.join(v, "->"));
		}
		{
			int[] a = {1, 2, 3, 4, 5};
			IntegerVector v = new IntegerVector();
			v.addAll(a);
			System.out.println(IntegerVectorStatic.sum(v));
		}
		{
			IntegerVector v = new IntegerVector();
			v = IntegerVectorStatic.range(10, 20);
			System.out.println(IntegerVectorStatic.toString(v));
		}
		{
			int[] a = {2, 3, 4, 8, 9, 11, 13, 15};
			IntegerVector v = new IntegerVector();
			v.addAll(a);
			IntegerVector temp = IntegerVectorStatic.filterOdd(v);
			System.out.println(temp);
		}
	}
}
