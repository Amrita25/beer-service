package springframework.beerservice.web.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import springframework.beerservice.web.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
