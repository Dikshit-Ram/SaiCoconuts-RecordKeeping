package org.saicoconuts.records.dao;

import org.saicoconuts.records.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, String> {
    List<Consumer> getConsumersByName(List<String> consumerNames);
}
