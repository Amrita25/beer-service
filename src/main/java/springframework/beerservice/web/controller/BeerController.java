package springframework.beerservice.web.controller;



import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springframework.beerservice.web.model.BeerDto;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {
	@GetMapping({"/{brID}"})
	public ResponseEntity<BeerDto> getBeerbyId(@PathVariable("brID") UUID beerID){
		System.out.println("inside get beer by id ");
		return new ResponseEntity<BeerDto>(new BeerDto.BeerDtoBuilder().build(),HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
		/*BeerDto brDto =beerService.saveNewBeer(beerDto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", brDto.getId().toString());*/
		
		return new ResponseEntity(HttpStatus.CREATED);
		
	}
	
	@PutMapping({"/{beerID}"})
	public ResponseEntity updateBeerById(@PathVariable("beerID") UUID beerID,@RequestBody BeerDto beerDto){
		//BeerDto brDto =beerService.updateBeer(beerID,beerDto);
		
		return new ResponseEntity( HttpStatus.NO_CONTENT);
		
	}
}
