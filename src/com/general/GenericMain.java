package com.general;

public class GenericMain {
    public static void main(String[] args) {
		Store store = new Store(10); //Integer Store
		store.setValue(20);
		store.setValue(30); //the instance members has a fixed type, so same kind of value need to be passed
		store.setValue(40);
		System.out.println("Store Value: " + store.getValue());
		//Generic Store Example
		GenericStore stringStore = new GenericStore("Hello");
		stringStore.setValue("World");
		stringStore.setValue(100);
		stringStore.setValue(new Person(1,"Roger","Chennai"));
		
		GenericStore<Integer> integerStore = new GenericStore<Integer>(100); //Integer Store
		integerStore.setValue(200);
		integerStore.setValue(300); //the instance members has a fixed type, so same kind of value need to be passed
		//integerStore.setValue("RAy");
		//String store
		GenericStore<String> stringGenericStore = new GenericStore<String>("Hello");
		stringGenericStore.setValue("World");
		stringGenericStore.setValue("Java");
		//sringGenericStore.setValue(113);
		
		//the instance members has a fixed type, so same kind of value need to be passe
	}
}
