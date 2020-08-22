package springframework.beerservice.web.bootstrap;

import org.springframework.boot.CommandLineRunner;

import springframework.beerservice.web.domain.Beer;
import springframework.beerservice.web.repositories.BeerRepository;

//This class is going to run every time the spring context starts
public class BeerLoader implements CommandLineRunner {

	private BeerRepository repo;

	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub

	}
	private void loadBeerObjects(){
		if(repo.count()==0){
			Beer beer = new Beer();
			beer.setBeerName("beer 1");
			beer.setBeerStyle("beer style 1 ");
			beer.setQuantityToBrew(2);
			beer.setMinOnHand(10);
			repo.save(beer);

			Beer beer1 = new Beer();
			beer1.setBeerName("beer 2");
			beer1.setBeerStyle("beer style 2 ");
			beer1.setQuantityToBrew(200);
			beer1.setMinOnHand(20);
			repo.save(beer1);
		}
		System.out.println("Loaded beers count : "+repo.count());
	}


}
