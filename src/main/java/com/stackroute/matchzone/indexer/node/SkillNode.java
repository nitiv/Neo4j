package com.stackroute.matchzone.indexer.node;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class SkillNode {
	

	 @Id @GeneratedValue
	   private Long id;
	   
	 private String name;
	 private String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public SkillNode(Long id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	

}
