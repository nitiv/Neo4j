package com.stackroute.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;


import com.stackroute.matchzone.indexer.node.SkillNode;
import com.stackroute.matchzone.indexer.node.UserNode;

@RelationshipEntity(type="KNOWS")
public class Knows {

	private String name;
	@StartNode
	UserNode user;
	@EndNode
	SkillNode skill;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Knows() {
		super();
	}

	

}
