package com.stackroute.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchzone.indexer.node.CityNode;
import com.stackroute.matchzone.indexer.node.UserNode;

@RelationshipEntity(type="LIVESIN")
public class LivesIn {
	
	private String name;
	@StartNode
	UserNode user;
	
	@EndNode
	CityNode city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LivesIn(String name) {
		super();
		this.name = name;
	}

	
	
}
