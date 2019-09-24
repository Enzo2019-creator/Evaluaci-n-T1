package pe.edu.upn.hrsN00062649.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Countries")
public class Countries {
	@Id
	@Column(name = "COUNTRY_ID", length = 2)
	private String id;
	
	@Column(name = "COUNTRY_NAME", length = 40)
	private String countryName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "region_id")
	private Regions regions;
	
	@OneToMany(mappedBy = "countries", fetch = FetchType.LAZY)
	private List<Locations> locations;
	
	public Countries() {
		locations = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Regions getRegions() {
		return regions;
	}

	public void setRegions(Regions regions) {
		this.regions = regions;
	}

	public List<Locations> getLocations() {
		return locations;
	}

	public void setLocations(List<Locations> locations) {
		this.locations = locations;
	}
	
	
}