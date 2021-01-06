package org.acme.graph.model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vividsolutions.jts.geom.Coordinate;

/**
 * 
 * Un sommet dans un graphe
 * 
 * @author MBorne
 *
 */
public class Vertex {

	
	/**
	 * Identifiant du sommet
	 */
	private String id;

	/**
	 * Position du sommet
	 */
	private Coordinate coordinate;

	
	@JsonIgnore
	private List<Edge> inEdges = new ArrayList<Edge>();
	
	@JsonIgnore
	private List<Edge> outEdges = new ArrayList<Edge>();

	public Vertex() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}


	@Override
	public String toString() {
		return id;
	}
	
	public Collection<Edge> getInEdges() {
		return inEdges;
	}
	
	public Collection<Edge> getOutEdges() {
		return outEdges;
	}

}
