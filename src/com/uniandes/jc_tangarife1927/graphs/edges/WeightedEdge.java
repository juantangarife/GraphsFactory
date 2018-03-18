package com.uniandes.jc_tangarife1927.graphs.edges;

import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public class WeightedEdge extends Edge {
	private int weight;
	
	public WeightedEdge(Node nSource, Node nTarget) {
		super(nSource, nTarget);
		weight = 0;
	}
	
	public void setWeight(int nWeight) {
		weight = nWeight;
	}
	
	public int getWeight() {
		return weight;
	}

}
