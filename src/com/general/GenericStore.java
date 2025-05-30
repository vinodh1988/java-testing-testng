package com.general;

public class GenericStore<T> {
	private T value;

	public GenericStore(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	

}
