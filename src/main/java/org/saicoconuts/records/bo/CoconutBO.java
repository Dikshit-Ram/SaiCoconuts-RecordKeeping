package org.saicoconuts.records.bo;

import java.util.Set;

import org.saicoconuts.records.entity.Coconut;

public interface CoconutBO
{
	Set<Coconut> getAllCoconutRates();
	
	float getCoconutRateByType(String type);
	
	boolean setCoconutRates(Set<Coconut> coconuts);
	
}
