package org.saicoconuts.records.bo;

import org.saicoconuts.records.dao.ConsumerRepository;
import org.saicoconuts.records.entity.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
public class ConsumerBOImpl implements ConsumerBO {

    private ConsumerRepository consumerRepository;

    @Autowired
    public ConsumerBOImpl(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

    @Override
    public List<Consumer> getAllConsumers(){
        return consumerRepository.findAll();
    }

    @Override
    public List<Consumer> getConsumersById(List<UUID> consumerIds) {
        return consumerRepository.findAllById(consumerIds);
    }

    @Override
    public List<Consumer> getConsumersByName(List<String> consumerNames) {
        return consumerRepository.getConsumersByName(consumerNames);
    }

    @Override
    public boolean saveOrUpdateConsumer(final Set<Consumer> consumers) {
        return !consumerRepository.saveAll(consumers).isEmpty();
    }

    @Override
    public boolean deleteConsumers(final Set<Consumer> consumers) {
        consumerRepository.deleteAll(consumers);
        return true;
    }
}