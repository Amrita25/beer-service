package springframework.beerservice.web.services;

import java.util.UUID;

import org.springframework.http.ResponseEntity;

import springframework.beerservice.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerID);

	BeerDto saveNewBeer(BeerDto beerDto);
	
	BeerDto updateBeerById(UUID beerID,BeerDto beerDto);


}
