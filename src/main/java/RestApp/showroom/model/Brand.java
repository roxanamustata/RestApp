package RestApp.showroom.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Transient;

//@XmlRootElement
@Entity(name = "brands")
@Table(name = "brands")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brand_id")
	private int brandId;
	@Column(name = "brand_name")
	private String brandName;

	@Transient
	private List<Link> links;

	public Brand() {

	}

	public Brand(int brandId, String brandName) {
		this.brandId = brandId;
		this.brandName = brandName;
	}

	

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
