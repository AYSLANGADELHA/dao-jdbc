import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


import java.util.Locale;
import java.util.Scanner;

public class MainDepartment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // crood DEPARTMENT
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: insert =====");
        Department newDepartment = new Department(6, "Manutenção");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Department = " + newDepartment.getName());

        System.out.println("\n=== TEST 2: update =======");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Marketing");
        departmentDao.update(dep2);
        System.out.println("Update completed");


        System.out.println("\n=== TEST 3: findById =======");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);


    }
}