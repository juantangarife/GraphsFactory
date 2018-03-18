package com.uniandes.jc_tangarife1927.graphs;

import com.uniandes.jc_tangarife1927.graphs.edges.Edge;
import com.uniandes.jc_tangarife1927.graphs.factories.ISearchStrategy;
import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public class DirectedGraph extends Graph {
	public DirectedGraph(ISearchStrategy nSearchStrategy) {
		super(nSearchStrategy);
	}

	@Override
	public void addEdge(Node source, Node target) {
		/*
		Edge a = createEdgeStrategy.createEdge(source, target);
		Edge b = createEdgeStrategy.createEdge(target, source);
		edges.add(a);
		edges.add(b);
		*/
	}
}
