package com.uniandes.jc_tangarife1927.graphs;

import com.uniandes.jc_tangarife1927.graphs.edges.Edge;
import com.uniandes.jc_tangarife1927.graphs.factories.EdgeFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.ISearchStrategy;
import com.uniandes.jc_tangarife1927.graphs.factories.UnweightedEdgeFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.WeightedEdgeFactory;
import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public class DirectedGraph extends Graph {
	public DirectedGraph(ISearchStrategy nSearchStrategy, EdgeFactory edgeFactory) {
		super(nSearchStrategy, edgeFactory);
	}

	@Override
	public void addEdge(Node source, Node target) throws Exception{
		if(edgeFactory instanceof UnweightedEdgeFactory) {
			edges.add(edgeFactory.createEdge(source, target));
		}
		else {
			throw new Exception("Edge factory needs weight!");
		}
		
	}
	
	@Override
	public void addEdge(Node source, Node target, int weight) throws Exception{
		if(edgeFactory instanceof WeightedEdgeFactory) {
			edges.add(edgeFactory.createEdge(source, target, weight));
		}
		else {
			throw new Exception("Edge factory does not accept weight!");
		}
		
	}
}
