package com.uniandes.jc_tangarife1927.graphs.factories;

import com.uniandes.jc_tangarife1927.graphs.Graph;

public abstract class GraphFactory {
	public abstract Graph getGraph(ISearchStrategy nSearchStrategy); 
}
