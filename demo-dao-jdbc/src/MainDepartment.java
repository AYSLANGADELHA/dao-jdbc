import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


import java.util.*;

public class MainDepartment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // crood DEPARTMENT
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

       // System.out.println("=== TEST 1: insert =====");
        //Department newDepartment = new Department(6, "Manutenção");
        //departmentDao.insert(newDepartment);
        //System.out.println("Inserted! New Department = " + newDepartment.getName());

        System.out.println("\n=== TEST 2: update =======");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Marketing");
        departmentDao.update(dep2);
        System.out.println("Update completed");


        System.out.println("\n=== TEST 3: findById =======");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 4: findAll =======");
        List<Department> list = departmentDao.findAll();
        Collections.sort(list, Comparator.comparing(Department::getId));
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n=== TEST 5: delete =======");
        System.out.println("Enter the id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deleted Department = " + id);


        sc.close();

    }
}