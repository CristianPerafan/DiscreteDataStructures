package model;

public class Edge<T> {
	
	//Attributes
	private Vertex<T> node_1;
	private Vertex<T> node_2;
	private int weight;
	
	public Edge(Vertex<T> node_1, Vertex<T> node_2, int weight) {
		super();
		this.node_1 = node_1;
		this.node_2 = node_2;
		this.weight = weight;
	}
	
	//GETTERS AND SETTERS

	public Vertex<T> getNode_1() {
		return node_1;
	}

	public void setNode_1(Vertex<T> node_1) {
		this.node_1 = node_1;
	}

	public Vertex<T> getNode_2() {
		return node_2;
	}

	public void setNode_2(Vertex<T> node_2) {
		this.node_2 = node_2;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	
}
