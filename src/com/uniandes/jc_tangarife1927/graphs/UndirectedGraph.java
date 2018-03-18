package com.uniandes.jc_tangarife1927.graphs;

import com.uniandes.jc_tangarife1927.graphs.factories.ISearchStrategy;
import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public class UndirectedGraph extends Graph {
	public UndirectedGraph(ISearchStrategy nSearchStrategy) {
		super(nSearchStrategy);
	}

	@Override
	public void addEdge(Node source, Node target) {

	}
}
