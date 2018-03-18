package com.uniandes.jc_tangarife1927.graphs;

import com.uniandes.jc_tangarife1927.graphs.edges.Edge;
import com.uniandes.jc_tangarife1927.graphs.factories.EdgeFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.ISearchStrategy;
import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public class DirectedGraph extends Graph {
	public DirectedGraph(ISearchStrategy nSearchStrategy, EdgeFactory edgeFactory) {
		super(nSearchStrategy, edgeFactory);
	}

	@Override
	public void addEdge(Node source, Node target) {
		edges.add(edgeFactory.createEdge(source, target));
	}
}
