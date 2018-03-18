package com.uniandes.jc_tangarife1927;

import com.uniandes.jc_tangarife1927.graphs.Graph;
import com.uniandes.jc_tangarife1927.graphs.factories.BFSSearchStrategy;
import com.uniandes.jc_tangarife1927.graphs.factories.DFSSearchStrategy;
import com.uniandes.jc_tangarife1927.graphs.factories.DirectedGraphFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.EdgeFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.UndirectedGraphFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.UnweightedEdgeFactory;
import com.uniandes.jc_tangarife1927.graphs.nodes.Node;
import com.uniandes.jc_tangarife1927.graphs.factories.GraphFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.ISearchStrategy;

public class Main {
	
	private GraphFactory graphFactory;
	private ISearchStrategy searchStrategy;
	private EdgeFactory edgeFactory;
	
	private Graph graph;
	
	public Main() {
		initialize();
		graph = graphFactory.getGraph(searchStrategy, edgeFactory);
	}
	
	private void addNode(String n) {
		graph.addNode(n);
	}
	
	private void addEdge(Node source, Node target) {
		graph.addEdge(source, target);
	}
	
	private void initialize() {
		// TODO Cargar las clases de un archivo de configuración
		graphFactory = new DirectedGraphFactory();
		searchStrategy = new BFSSearchStrategy();
		edgeFactory = new UnweightedEdgeFactory();
	}

	public static void main(String[] args) {
		Main program = new Main();
	}

}
