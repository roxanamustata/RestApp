package RestApp.showroom.services;

import java.util.List;

import RestApp.showroom.DAO.BrandsDAO;
import RestApp.showroom.model.Brand;


public class BrandsService {
	
	BrandsDAO DAO = new BrandsDAO();

	public List<Brand> getBrands() {
		List<Brand> list= DAO.getBrands();
		return list;
	}

	public void addBrand(Brand brand) {
		DAO.addBrand (brand);
		
		
	}

	public void updateBrand(Brand updatedBrand) {
		DAO.updateBrand(updatedBrand);
		
	}

	public void deleteBrand(int brandId) {
		DAO.deleteBrand(brandId);
		
	}

	public Brand getBrand(int brandId) {
		return DAO.getBrand(brandId);
		
	}

}
