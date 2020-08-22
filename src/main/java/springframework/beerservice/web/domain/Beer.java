package springframework.beerservice.web.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import springframework.beerservice.web.model.BeerStyleEnum;

@Entity
public class Beer {
	
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
	@Column(length=36,columnDefinition="varchar",updatable=false,nullable=false)
	private UUID id ;
	private Integer version;
	
	@CreationTimestamp
	private Timestamp createdDate;
	
	@UpdateTimestamp
	private Timestamp lastModifiedDate;
	private String beerName;
	private String beerStyle;
	
	@Column(unique=true)
	private long upc;
	
	private BigDecimal price;
	private Integer minOnHand;
	private Integer quantityToBrew;
	
	public Beer() {

	}
	public Beer(UUID id, Integer version, Timestamp createdDate,
			Timestamp lastModifiedDate, String beerName, String beerStyle,
			long upc, BigDecimal price, Integer minOnHand,
			Integer quantityToBrew) {
		this.id = id;
		this.version = version;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.beerName = beerName;
		this.beerStyle = beerStyle;
		this.upc = upc;
		this.price = price;
		this.minOnHand = minOnHand;
		this.quantityToBrew = quantityToBrew;
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
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getBeerName() {
		return beerName;
	}
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	public String getBeerStyle() {
		return beerStyle;
	}
	public void setBeerStyle(String beerStyle) {
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
	public Integer getMinOnHand() {
		return minOnHand;
	}
	public void setMinOnHand(Integer minOnHand) {
		this.minOnHand = minOnHand;
	}
	public Integer getQuantityToBrew() {
		return quantityToBrew;
	}
	public void setQuantityToBrew(Integer quantityToBrew) {
		this.quantityToBrew = quantityToBrew;
	}
	
	

}
