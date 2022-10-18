package com.training.galaxe.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.training.galaxe.config.HibernateUtil;
import com.training.galaxe.model.Product;

public class ProductDAOImpl implements ProductDAO {
	public ProductDAOImpl() {
	}

	@Override
	public void saveProduct(Product product) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Override
	public void updateProduct(Product product) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(product);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Override
	public void deleteProduct(int productId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Product product = new Product();
		product.setProductId(productId);
		session.delete(product);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

	@Override
	public Product getProduct(int productId) {		//1
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Product product = new Product();
		product.setPrice(1);

		product = session.get(Product.class, productId);
		product.setPrice(2);

		transaction.commit();
		session.close();
		product.setPrice(3);

		sessionFactory.close();
		return product;

	}

	@Override
	public List<Product> getProduct() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Product> products = new ArrayList<Product>();

		// products = session.createQuery("from Product").list();
		Query query = session.createQuery("from Product");
		products = query.list();

		transaction.commit();
		session.close();
		sessionFactory.close();
		return products;
	}
	
	@Override
	public List<Product> getProduct(String productName) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Product> products = new ArrayList<Product>();

		Query query = session.createQuery("from Product where productName = '"+productName + "'");
		//select * from product where productName = 'Watch'
		products = query.list();

		transaction.commit();
		session.close();
		sessionFactory.close();
		return products;
	}
	@Override
	public List<Product> searchProductByName(String productName) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Product.class);		
		List<Product > products1 = criteria.list();		//select * from products;

		//select * from product where productName = 'Watch'
		criteria.add(Restrictions.like("productName", productName));
		List<Product > products2 = criteria.list();	

		
		criteria.add(Restrictions.gt("price",500));
		List<Product > products3 = criteria.list();	
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		return products2;
	}
	@Override
	public List<Product> getProduct(int min, int max) {  //200, 400
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Product.class);		

		criteria.add(Restrictions.between("price", min,max));
		List<Product > products2 = criteria.list();
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		return products2;
	}
	
	@Override
	public String checkProductInventory(int productId, int quantityRequired) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isProductExists(int productId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Product product = new Product();

		product = session.get(Product.class, productId);

		transaction.commit();
		session.close();
		sessionFactory.close();
		if (product == null)
			return false;
		else
			return true;
	}

	

}
