package pe.edu.upn.hrsN00062649.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Regions")
public class Regions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REGION_ID")
	private Integer id;
	
	@Column(name = "REGION_NAME", length = 25)
	private String regionName;
	
	@OneToMany(mappedBy = "regions", fetch = FetchType.LAZY)
	private List<Countries> countries;
	
	public Regions() {
		countries = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public List<Countries> getCountries() {
		return countries;
	}

	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}
	
	
}
