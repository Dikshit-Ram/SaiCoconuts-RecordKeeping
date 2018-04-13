package org.saicoconuts.records.bo;

import org.saicoconuts.records.dao.CoconutsRepository;
import org.saicoconuts.records.entity.Coconut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CoconutBOImpl implements CoconutBO
{

	private CoconutsRepository coconutsRepository;

	@Autowired
	public CoconutBOImpl(CoconutsRepository coconutsRepository) {
		this.coconutsRepository = coconutsRepository;
	}

	@Override
	public List<Coconut> getAllCoconutRates()
	{
		return coconutsRepository.findAll();
	}

	@Override
	public float getCoconutRateByType(String type)
	{
		return coconutsRepository.getOne(type).getCost();
	}

	@Override
	public boolean setCoconutRates(Set<Coconut> coconuts)
	{
		return !coconutsRepository.saveAll(coconuts).isEmpty();
	}

}
