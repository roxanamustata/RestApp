package RestApp.showroom.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import RestApp.showroom.model.Product;
import RestApp.showroom.services.ProductsService;

@Path("/showroom/brands")
public class ProductsResource {

	ProductsService productsService = new ProductsService();

	@GET
	@Path("/{brandId}/products")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductsByBrand(@PathParam("brandId") int brandId,
			@QueryParam("category") String category,
			@QueryParam("start") int start,
			@QueryParam("end") int end) {
		
		List<Product> productsList;

		if (category!=null) {
			productsList = productsService.getProductsByBrandAndCategory(brandId, category);
			
		} else {
			productsList = productsService.getProductsByBrand(brandId);
			
		}
		if(end>0) {
			productsList=productsList.subList(start, end);
		}
		
		return productsList;
	}
}
