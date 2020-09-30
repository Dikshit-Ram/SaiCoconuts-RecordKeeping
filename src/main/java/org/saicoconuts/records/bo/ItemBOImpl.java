package org.saicoconuts.records.bo;

import org.saicoconuts.records.dao.ItemsRepository;
import org.saicoconuts.records.entity.Item;
import org.saicoconuts.records.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ItemBOImpl implements ItemBO
{
	private ItemsRepository itemsRepository;

	@Autowired
	public ItemBOImpl(ItemsRepository itemsRepository) {
		this.itemsRepository = itemsRepository;
	}

	@Override
	public Item getItem(String name) {
		return itemsRepository.getOne(name);
	}

	@Override
	public List<Item> getAllItems() {
		return itemsRepository.findAll();
	}

	@Override
	public boolean createItems(Set<Item> items) {
		return !itemsRepository.saveAll(items).isEmpty();
	}
}
