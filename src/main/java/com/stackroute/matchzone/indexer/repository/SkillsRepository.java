package com.stackroute.matchzone.indexer.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchzone.indexer.node.SkillNode;


public interface SkillsRepository extends Neo4jRepository<SkillNode,Long> {
	
	@Query("")
	public String save();

}
