package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("Test 1 : find  by Id");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\nTest 2 : find  All");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\nTest 3 : Update ");
		Department newDep = new Department(4,"Food");
		departmentDao.update(newDep);

		/*System.out.println("\nTest 4 : Insert ");
		Department dep = new Department(null, "Chairs");
		departmentDao.insert(dep);
		System.out.println("Done!");*/
		
		/*System.out.println("\nTest 5 : Delete ");
		departmentDao.deleteById(8);
		System.out.println("Done!");*/
	}

}
