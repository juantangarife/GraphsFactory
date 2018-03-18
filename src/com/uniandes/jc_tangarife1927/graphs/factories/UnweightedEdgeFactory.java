package com.uniandes.jc_tangarife1927.graphs.factories;

import com.uniandes.jc_tangarife1927.graphs.edges.Edge;
import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public class UnweightedEdgeFactory extends EdgeFactory{
	
	@Override
	public Edge createEdge(Node source, Node target) {
		return new Edge(source, target);
	}

}
