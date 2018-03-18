package com.uniandes.jc_tangarife1927.graphs.edges;

import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public class Edge {
	protected Node source;
	protected Node target;
	
	public Edge(Node nSource, Node nTarget) {
		source = nSource;
		target = nTarget;
	}
	
	public Node getSource() {
		return source;
	}
	
	public Node getTarget() {
		return target;
	}
}
