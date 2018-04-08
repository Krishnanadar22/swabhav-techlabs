package com.techlabs.adapt;

import java.util.Iterator;
import java.util.LinkedList;

public class SwabhavQ<T> implements Iterable<T> {

	private LinkedList<T> list;

	public SwabhavQ() {
		list = new LinkedList<T>();
	}

	public void enqueue(T obj) {
		list.addLast(obj);
	}

	public T dequeue() {
		return (list.removeFirst());
	}

	public int size() {
		return list.size();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}

}
