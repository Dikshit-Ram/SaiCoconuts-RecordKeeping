package org.saicoconuts.records.dao;

import java.util.Set;

import org.saicoconuts.records.entity.Coconut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoconutsRepository extends JpaRepository<Coconut, String> {
	
	Coconut getCoconutByType(String type);
	
	//public boolean setCostForCoconutType(Coconut.Type type);
}
