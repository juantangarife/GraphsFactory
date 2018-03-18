package com.uniandes.jc_tangarife1927.graphs;

import java.util.ArrayList;

import com.uniandes.jc_tangarife1927.graphs.edges.Edge;
import com.uniandes.jc_tangarife1927.graphs.factories.ISearchStrategy;
import com.uniandes.jc_tangarife1927.graphs.nodes.Node;

public abstract class Graph {
	
	protected ArrayList<Node> nodes;
	protected ArrayList<Edge> edges;
	protected ISearchStrategy searchStrategy;
	
	public Graph(ISearchStrategy nSearchStrategy) {
		nodes = new ArrayList<Node>();
		edges = new ArrayList<Edge>();
		searchStrategy = nSearchStrategy;
	}
	
	public ArrayList<Node> getNodes() {
		return nodes;
	}
	
	public ArrayList<Edge> getEdges(){
		return edges;
	}
	
	public void addNode(String n) {
		nodes.add(new Node(n));
	}
	
	public abstract void addEdge(Node source, Node target);
	
	public void search(Node a) throws Exception{
		if(searchStrategy != null) {
			searchStrategy.search(a);
		}
		else {
			throw new Exception("Search feature was not configured");
		}
	}
	
}
