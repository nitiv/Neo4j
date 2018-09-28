package com.stackroute.matchzone.indexer.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchzone.indexer.node.UserNode;

public interface UserRepository extends Neo4jRepository<UserNode,String>{
	
	@Query("")
	public String save();

}
