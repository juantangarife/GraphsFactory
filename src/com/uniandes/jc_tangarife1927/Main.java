package com.uniandes.jc_tangarife1927;

import com.uniandes.jc_tangarife1927.graphs.Graph;
import com.uniandes.jc_tangarife1927.graphs.factories.BFSSearchStrategy;
import com.uniandes.jc_tangarife1927.graphs.factories.DFSSearchStrategy;
import com.uniandes.jc_tangarife1927.graphs.factories.DirectedGraphFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.EdgeFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.UndirectedGraphFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.UnweightedEdgeFactory;
import com.uniandes.jc_tangarife1927.graphs.factories.WeightedEdgeFactory;
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
	
	private void addEdge(String s, String t, int weight) throws Exception {
		Node source = graph.getNode(s);
		Node target = graph.getNode(t);
		if(weight > 0) {
			graph.addEdge(source, target, weight);
		}
		else {
			graph.addEdge(source, target);
		}
	}
	
	private void initialize() {
		// TODO Cargar las clases de un archivo de configuración
		graphFactory = new UndirectedGraphFactory();
		searchStrategy = new BFSSearchStrategy();
		edgeFactory = new WeightedEdgeFactory();
	}

	public static void main(String[] args) {
		Main program = new Main();
		
		program.addNode("a");
		program.addNode("b");
		program.addNode("c");
		program.addNode("d");
		program.addNode("e");
		program.addNode("f");
		program.addNode("g");
		program.addNode("h");
		program.addNode("i");
		
		try {
			program.addEdge("a", "b", 5);
			program.addEdge("a", "c", 5);
			program.addEdge("a", "d", 5);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(program.graph);
	}

}
