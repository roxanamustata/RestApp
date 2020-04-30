package RestApp.showroom.services;

import java.util.List;

import RestApp.showroom.DAO.ProductsDAO;
import RestApp.showroom.model.Product;

public class ProductsService {
	ProductsDAO dao= new ProductsDAO();
	
	public List<Product> getProductsByBrand(int brandId) {
		List<Product> productslist = dao.getProductsByBrand(brandId);
		return productslist;
	}

	public List<Product> getProductsByBrandAndCategory(int brandId, String category) {
		List<Product> productsList = dao.getProductsByBrandAndCategory(brandId, category);
		return productsList;
	}

}
