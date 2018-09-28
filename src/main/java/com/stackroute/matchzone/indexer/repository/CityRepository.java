package com.stackroute.matchzone.indexer.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchzone.indexer.node.CityNode;




public interface CityRepository  extends Neo4jRepository<CityNode,Long> {
	
	@Query("")
	public String save();

}
