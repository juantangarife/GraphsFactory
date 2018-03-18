package com.uniandes.jc_tangarife1927.graphs.factories;

import com.uniandes.jc_tangarife1927.graphs.edges.Edge;
import com.uniandes.jc_tangarife1927.graphs.edges.WeightedEdge;
import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public class WeightedEdgeFactory extends EdgeFactory{
	
	@Override
	public Edge createEdge(Node source, Node target, int weight) {
		return new WeightedEdge(source, target, weight);
	}

	@Override
	public Edge createEdge(Node source, Node targetht) {
		return null;
	}

}
