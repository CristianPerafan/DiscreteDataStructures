package model;

public class Vertex<T> {
	
	//Attributes
	private T value;

	public Vertex(T value) {
		this.value = value;
	}
	
	//GETTERS AND SETTERS

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
	
	
	
}
