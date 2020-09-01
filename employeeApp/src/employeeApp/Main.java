package employeeApp;

public class Main 
{
    private static void workWithData()
    {
        System.out.println("Welcome to Java!!!");

        Healthplan h1 = new Healthplan("My Health 1");
        Healthplan h2 = new Healthplan("My Health 2");

        Company c1 = new Company("Company A", 100); 
        Company c2 = new Company("Company B", 100);

        Employee emp1 = new Employee("John", "Doe", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("Jane", "Doe", 80000, true, c1.id, h2.getId());
        Employee emp3 = new Employee("George", "Doe", 80000, false, c2.id, h1.getId());

        System.out.println(c1);

        emp1.setSalary(emp1.getSalary() + 500);
        System.out.println(emp1.getFname() + " " + emp1.getSalary());

        System.out.println(c1.debt / 7);
        System.out.println(c1.debt % 7);
        System.out.println(c1.debt / 7.0);

        double result = 100 / (int) 3.14;
        System.out.println(result);
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}