package springframework.beerservice.web.controller;


import java.math.BigDecimal;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import springframework.beerservice.web.model.BeerDto;
import springframework.beerservice.web.model.BeerStyleEnum;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(BeerController.class)
public class BeerControllerTest {
	@Autowired
	MockMvc mockMvc;
	
	@Autowired
	ObjectMapper mapper;

	@Test
	void getBeerbyId() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/beer/"+UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	void saveNewBeer() throws Exception{
		BeerDto beerDto = new BeerDto();
		beerDto.setBeerName("my beer");
		beerDto.setBeerStyle(BeerStyleEnum.LAGER);
		beerDto.setUpc(100);
		beerDto.setPrice(new BigDecimal(500));
		String beetDtoAsJson = mapper.writeValueAsString(beerDto);
		System.out.println("beetDtoAsJson "+beetDtoAsJson);
		mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/beer/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(beetDtoAsJson))
				.andExpect(MockMvcResultMatchers.status().isCreated());

	}
	@Test
	void updateBeerById() throws Exception{
		BeerDto beerDto = new BeerDto();
		beerDto.setBeerName("my updated beer");
		beerDto.setBeerStyle(BeerStyleEnum.LAGER);
		beerDto.setUpc(100);
		beerDto.setPrice(new BigDecimal(500));
		String beetDtoAsJson = mapper.writeValueAsString(beerDto);
		mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/beer/"+UUID.randomUUID())
				.contentType(MediaType.APPLICATION_JSON)
				.content(beetDtoAsJson))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}
}
