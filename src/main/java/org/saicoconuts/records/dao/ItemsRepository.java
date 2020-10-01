package org.saicoconuts.records.dao;

import org.saicoconuts.records.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<Item, String> {
}
