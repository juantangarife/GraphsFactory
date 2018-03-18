package com.uniandes.jc_tangarife1927.graphs.factories;

import com.uniandes.jc_tangarife1927.graphs.edges.Edge;
import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public abstract class EdgeFactory {
	public abstract Edge createEdge(Node source, Node target);
}
