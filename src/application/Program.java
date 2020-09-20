package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department department = new Department(1, "bookss");
		
		Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.00, department);
		
		System.out.println(seller);

		
	}

}
