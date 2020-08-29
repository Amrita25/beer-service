package springframework.beerservice.web.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springframework.beerservice.web.mapper.BeerMapper;
import springframework.beerservice.web.model.BeerDto;
import springframework.beerservice.web.repositories.BeerRepository;

@Service
public class BeerServiceImpl implements BeerService {
	
	@Autowired
	BeerRepository repo;
	@Autowired
	BeerMapper mapper;

	public BeerDto getBeerById(UUID beerID) {
		// TODO Auto-generated method stub
		return mapper.mapBeerToBeerDto(repo.findById(beerID).orElseThrow(null()->new Exception()));
	}

	public BeerDto saveNewBeer(BeerDto beerDto) {
		// TODO Auto-generated method stub
		return mapper.mapBeerToBeerDto(repo.save(mapper.mapBeerDtoToBeer(beerDto)));
	}

	public BeerDto updateBeerById(UUID beerID, BeerDto beerDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
