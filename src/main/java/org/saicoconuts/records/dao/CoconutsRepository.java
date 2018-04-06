package org.saicoconuts.records.dao;

import org.saicoconuts.records.entity.Coconut;
import org.saicoconuts.records.entity.Coconut.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoconutsRepository extends JpaRepository<Coconut, Type>{
}
