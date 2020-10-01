package org.saicoconuts.records.bo;

import org.saicoconuts.records.entity.Consumer;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface ConsumerBO {
    List<Consumer> getAllConsumers();
    List<Consumer> getConsumersById(List<String> consumerIds);
    List<Consumer> getConsumersByName(List<String> consumerNames);
    boolean saveOrUpdateConsumer(Set<Consumer> consumers);
    boolean deleteConsumers(Set<Consumer> consumers);
}
