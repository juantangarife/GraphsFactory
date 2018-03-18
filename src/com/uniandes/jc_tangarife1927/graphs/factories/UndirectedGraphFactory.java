package com.uniandes.jc_tangarife1927.graphs.factories;

import com.uniandes.jc_tangarife1927.graphs.UndirectedGraph;
import com.uniandes.jc_tangarife1927.graphs.Graph;

public class UndirectedGraphFactory extends GraphFactory {

	@Override
	public Graph getGraph(ISearchStrategy nSearchStrategy, EdgeFactory edgeFactory) {
		return new UndirectedGraph(nSearchStrategy, edgeFactory);
	}
	
}
