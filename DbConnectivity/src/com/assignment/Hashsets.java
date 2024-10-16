package com.assignment;

import java.util.HashSet;

import java.util.Iterator;

public class Hashsets {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("Pratham");

		set.add("Rahul");

		set.add("Harsh");

		set.add("Vikash");

		Iterator<String> it = set.iterator();

		while (it.hasNext())

			System.out.println(it.next());
	}
}
