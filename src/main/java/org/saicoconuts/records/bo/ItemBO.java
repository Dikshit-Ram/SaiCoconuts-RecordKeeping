package org.saicoconuts.records.bo;

import org.saicoconuts.records.entity.Item;
import org.saicoconuts.records.entity.Type;

import java.util.List;
import java.util.Set;

public interface ItemBO {
	Item getItem(String name);
	List<Item> getAllItems();
	boolean createItems(Set<Item> items);
}
