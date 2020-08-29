package springframework.beerservice.web.mapper;

import springframework.beerservice.web.domain.Beer;
import springframework.beerservice.web.model.BeerDto;
import springframework.beerservice.web.model.BeerStyleEnum;

public class BeerMapper {
	
	public Beer mapBeerDtoToBeer(BeerDto dto){
		Beer beer = new Beer();
		beer.setBeerName(dto.getBeerName());
		beer.setBeerStyle(dto.getBeerStyle().toString());
		beer.setId(dto.getId());
		beer.setPrice(dto.getPrice());
		return beer;
	}
	
	public BeerDto mapBeerToBeerDto(Beer dto){
		BeerDto beer = new BeerDto();
		beer.setBeerName(dto.getBeerName());
		beer.setBeerStyle(BeerStyleEnum.LAGER);
		beer.setId(dto.getId());
		beer.setPrice(dto.getPrice());
		return beer;
		
	}

}
