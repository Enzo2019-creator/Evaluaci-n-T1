package pe.edu.upn.hrsN00062649.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Locations")
public class Locations {
	@Id
	@Column(name = "LOCATION_ID", length = 4)
	private Integer id;
	
	@Column(name = "STREET_ADDRESS", length = 40)
	private String streetAddress;
	
	@Column(name = "POSTAL_CODE", length = 12)
	private String postalCode;
	
	@Column(name = "CITY", length = 30)
	private String city;
	
	@Column(name = "STATE_PROVINCE", length = 25)
	private String stateProvince;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	private Countries countries;
	
	
	
}
