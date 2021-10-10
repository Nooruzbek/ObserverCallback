package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Subject <T extends InfoType>{

	private List<Callback<T>> callbacks = new ArrayList<>();
	private Queue<T> newNews = new LinkedList<>();

	protected boolean observersUpdated = true;

	public Subject() {
		super();
	}

	public void notifyObservers() {
		if (!observersUpdated) {
			while (!newNews.isEmpty()) {
				T info = newNews.remove();
				for (Callback<T> cb : callbacks) {
					cb.call(info);
				}
			}
		}
		observersUpdated = true;
	}

	public void addCallback(Callback<T> cb) {
		if (!callbacks.contains(cb)) {
			callbacks.add(cb);
		}
	}

	public void addType(T t) {
		newNews.add(t);
		observersUpdated = false;
	}
}
