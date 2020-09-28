package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao(); /* chamando a fabrica de dao para instanciar o SellerDao,
		 dessa forma, o programa principal não tem acesso a implementação do meu Dao.*/
		
		System.out.println("=== TEST 1: Seller find by id");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		System.out.println("\n=== TEST 2: Seller find by department");
		Department department= new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Seller find all");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 4: add a Seller");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000d, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted ! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller Update");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed");
	}

}
