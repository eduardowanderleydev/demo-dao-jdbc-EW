package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj);

	void update(Seller obj);

	void deleteById(Integer id);

	Department findById(Integer id);

	List<Department> findAll();
}
