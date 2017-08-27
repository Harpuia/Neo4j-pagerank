package org.neo4j.server.plugins.NeoPageRank;
import org.neo4j.graphdb.Label;


public class RankLabel implements Label {

	private String name;
	private double rank;
	
	public RankLabel(String name, double rank) {
		this.name = name;
		this.rank = rank;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public double rank() {
		return rank;
	}

}
