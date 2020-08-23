package springframework.beerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

public class BeerDto {
	@Null
	private UUID id ;
	@Null
	private Integer version;
	@Null
	private OffsetDateTime createdDateTime;
	@Null
	private OffsetDateTime lastModifiedDate;
	@NotBlank
	private String beerName;
	@NotNull
	private BeerStyleEnum beerStyle;
	
	@Positive
	@NotNull
	private long upc;
	private BigDecimal price;
	private Integer quantityOnHand;
	
	public BeerDto(){
		
	}
	public BeerDto(BeerDtoBuilder builder){
		this.beerName=builder.beerName;
		this.beerStyle=builder.beerStyle;
		this.createdDateTime=builder.createdDateTime;
		this.lastModifiedDate=builder.lastModifiedDate;
		this.price=builder.price;
		this.quantityOnHand=builder.quantityOnHand;
		this.upc=builder.upc;
		this.version=builder.version;
	}
	
	
	public BeerDto(UUID id, Integer version, OffsetDateTime createdDateTime,
			OffsetDateTime lastModifiedDate, String beerName,
			BeerStyleEnum beerStyle, long upc, BigDecimal price,
			Integer quantityOnHand) {
		super();
		this.id = id;
		this.version = version;
		this.createdDateTime = createdDateTime;
		this.lastModifiedDate = lastModifiedDate;
		this.beerName = beerName;
		this.beerStyle = beerStyle;
		this.upc = upc;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public OffsetDateTime getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(OffsetDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public OffsetDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getBeerName() {
		return beerName;
	}
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	public BeerStyleEnum getBeerStyle() {
		return beerStyle;
	}
	public void setBeerStyle(BeerStyleEnum beerStyle) {
		this.beerStyle = beerStyle;
	}
	public long getUpc() {
		return upc;
	}
	public void setUpc(long upc) {
		this.upc = upc;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(Integer quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	
	public static class BeerDtoBuilder{
		private UUID id ;
		private Integer version;
		private OffsetDateTime createdDateTime;
		private OffsetDateTime lastModifiedDate;
		private String beerName;
		private BeerStyleEnum beerStyle;
		private long upc;
		private BigDecimal price;
		private Integer quantityOnHand;
		
		public BeerDtoBuilder withVersion(Integer version){
			this.version=version;
			return this;
		}

		public BeerDtoBuilder withCreatedDateTime(OffsetDateTime createdDateTime){
			this.createdDateTime=createdDateTime;
			return this;
		}
		public BeerDtoBuilder withLastModifiedDate(OffsetDateTime lastModifiedDate){
			this.lastModifiedDate=lastModifiedDate;
			return this;
		}
		
		public BeerDtoBuilder withBeerName(String beerName){
			this.beerName=beerName;
			return this;
		}
		public BeerDtoBuilder withBeerStyle(BeerStyleEnum beerStyle){
			this.beerStyle=beerStyle;
			return this;
		}
		public BeerDtoBuilder withUPC(long upc){
			this.upc=upc;
			return this;
		}
		public BeerDtoBuilder withPrice(BigDecimal price){
			this.price=price;
			return this;
		}
		public BeerDtoBuilder withQuantity(Integer quantityOnHand){
			this.quantityOnHand=quantityOnHand;
			return this;
		}
		
		public BeerDto build(){
			return new BeerDto(this);
		}
	}

}
