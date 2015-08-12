package com.ganjie.designpatterns.creatType.Singleton;

import java.util.Vector;

public class SingletonTest {

	private static SingletonTest instance = null;
	@SuppressWarnings("rawtypes")
	private Vector properties = null;

	@SuppressWarnings("rawtypes")
	public Vector getProperties() {
		return properties;
	}

	private SingletonTest() {
	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new SingletonTest();
		}
	}

	public static SingletonTest getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}

	public void updateProperties() {
		SingletonTest shadow = new SingletonTest();
		properties = shadow.getProperties();
	}

}
