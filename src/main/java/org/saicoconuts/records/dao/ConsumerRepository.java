package org.saicoconuts.records.dao;

import org.saicoconuts.records.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, UUID> {
    List<Consumer> getConsumersByNameIn(List<String> names);
}
