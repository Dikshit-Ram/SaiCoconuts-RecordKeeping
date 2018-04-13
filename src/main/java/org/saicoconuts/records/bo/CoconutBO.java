package org.saicoconuts.records.bo;

import org.saicoconuts.records.entity.Coconut;

import java.util.List;
import java.util.Set;

public interface CoconutBO {
	List<Coconut> getAllCoconutRates();
	
	float getCoconutRateByType(String type);
	
	boolean setCoconutRates(Set<Coconut> coconuts);
	
}
