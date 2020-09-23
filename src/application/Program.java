package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao(); /* chamando a fabrica de dao para instanciar o SellerDao,
		 dessa forma, o programa principal não tem acesso a implementação do meu Dao.*/
		
		System.out.println("=== TEST 1: Seller find by id");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("=== TEST 2: ");
		

		
	}

}
