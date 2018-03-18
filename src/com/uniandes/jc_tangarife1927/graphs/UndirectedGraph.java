package com.uniandes.jc_tangarife1927.graphs;

import com.uniandes.jc_tangarife1927.graphs.edges.Edge;
import com.uniandes.jc_tangarife1927.graphs.factories.EdgeFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.ISearchStrategy;
import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public class UndirectedGraph extends Graph {
	public UndirectedGraph(ISearchStrategy nSearchStrategy, EdgeFactory edgeFactory) {
		super(nSearchStrategy, edgeFactory);
	}

	@Override
	public void addEdge(Node source, Node target) {
		Edge a = edgeFactory.createEdge(source, target);
		Edge b = edgeFactory.createEdge(target, source);
		edges.add(a);
		edges.add(b);
	}
}
