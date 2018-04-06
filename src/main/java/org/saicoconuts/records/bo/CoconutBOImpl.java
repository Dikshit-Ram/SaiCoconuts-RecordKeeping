package org.saicoconuts.records.bo;

import java.util.HashSet;
import java.util.Set;

import org.saicoconuts.records.dao.CoconutsRepository;
import org.saicoconuts.records.entity.Coconut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoconutBOImpl implements CoconutBO
{

	private CoconutsRepository coconutsRepository;

	@Autowired
	public CoconutBOImpl(CoconutsRepository coconutsRepository) {
		this.coconutsRepository = coconutsRepository;
	}

	@Override
	public Set<Coconut> getAllCoconutRates()
	{
		Set<Coconut> coconuts = new HashSet<>();
		coconuts.add(coconutsRepository.getCoconutByType("MEDIUM"));
		coconuts.add(coconutsRepository.getCoconutByType("QUALITY"));
		coconuts.add(coconutsRepository.getCoconutByType("NEW"));
		coconuts.add(coconutsRepository.getCoconutByType("OTHER"));

		return  coconuts;
	}

	@Override
	public float getCoconutRateByType(String type)
	{
		return coconutsRepository.getCoconutByType(type).getCost();
	}

	@Override
	public boolean setCoconutRates(Set<Coconut> coconuts)
	{
		return !coconutsRepository.saveAll(coconuts).isEmpty();
	}

}
