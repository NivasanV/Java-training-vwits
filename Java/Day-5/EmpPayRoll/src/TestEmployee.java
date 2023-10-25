import java.util.*;

import in.co.vwits.emppayroll.module.Employee;

public class TestEmplyee {
    public static void main(String[] args) throws Exception {
        List<Employee> emps = new ArrayList<>();

        Employee e1 = new Employee();
        e1.setId(20);
        e1.setName("Amit");

        Employee e2 = new Employee();
        e2.setId(10);
        e2.setName("Sachin");

        emps.add(e2);
        emps.add(e1);

        System.out.println(emps);
    }
}
