package com.stackroute.matchzone.indexer.node;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class UserNode {
	
	 @Id @GeneratedValue
	   private String  profileId;
	  private String name;
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserNode(String profileId, String name) {
		super();
		this.profileId = profileId;
		this.name = name;
	}
	  

}
