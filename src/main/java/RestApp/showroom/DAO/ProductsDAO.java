package RestApp.showroom.DAO;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import RestApp.showroom.model.Brand;
import RestApp.showroom.model.Product;

public class ProductsDAO {

	SessionFactory factory = (SessionFactory)new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Product.class)
			.addAnnotatedClass(Brand.class)
			.buildSessionFactory();

	public List<Product> getProductsByBrand(int brandId) {
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		List<Product> productsList;
		String hql = "from products where brand_id = '"+brandId+"'";
		productsList = session.createQuery(hql).getResultList();
		return productsList;
	}

	public List<Product> getProductsByBrandAndCategory(int brandId, String category) {
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		List<Product> productsList;
		String hql = "from products where brand_id = '"+brandId+"' and category='"+category+"'";
		productsList = session.createQuery(hql).getResultList();
		return productsList;
	}
}
