package springframework.beerservice.web.controller;



import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springframework.beerservice.web.model.BeerDto;
import springframework.beerservice.web.services.BeerService;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {
	
	@Autowired
	private BeerService beerService;
	
	@GetMapping({"/{brID}"})
	public ResponseEntity<BeerDto> getBeerbyId(@PathVariable("brID") UUID beerID){
		System.out.println("inside get beer by id ");
		BeerDto dto=beerService.getBeerById(beerID);
		return new ResponseEntity<BeerDto>(dto,HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDto beerDto){
		/*BeerDto brDto =beerService.saveNewBeer(beerDto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", brDto.getId().toString());*/
		System.out.println("inside save new beer");
		return new ResponseEntity<BeerDto>(beerService.saveNewBeer(beerDto),HttpStatus.CREATED);
		
	}
	
	@PutMapping({"/{beerID}"})
	public ResponseEntity updateBeerById(@PathVariable("beerID") UUID beerID,@RequestBody @Validated BeerDto beerDto){
		//BeerDto brDto =beerService.updateBeer(beerID,beerDto);
		
		return new ResponseEntity(beerService.updateBeerById(beerID, beerDto), HttpStatus.NO_CONTENT);
		
	}
}
