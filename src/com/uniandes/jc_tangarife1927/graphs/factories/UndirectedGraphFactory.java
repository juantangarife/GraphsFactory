package com.uniandes.jc_tangarife1927.graphs.factories;

import com.uniandes.jc_tangarife1927.graphs.DirectedGraph;
import com.uniandes.jc_tangarife1927.graphs.Graph;

public class UndirectedGraphFactory extends GraphFactory {

	@Override
	public Graph getGraph(ISearchStrategy nSearchStrategy) {
		return new DirectedGraph(nSearchStrategy);
	}
	
}
