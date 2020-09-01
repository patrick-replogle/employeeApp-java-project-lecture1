package employeeApp;

public class Employee
{
    private static int maxId = 0;
    private int id;
    private String fname;
    private String lname;
    private double salary;
    private boolean has401K;
    private int companyId;
    private int healthPlanId;

    // constructor (no return and same name as class)
    public Employee(String fname, String lname, double salary, boolean has401K, int companyId, int healthPlanId)
    {
        maxId++;

        id = maxId;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401K = has401K;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    // getters
    public int getId()
    {
        return id;
    }

    public String getFname()
    {
        return fname;
    }

    public String getLname()
    {
        return lname;
    }

    public double getSalary()
    {
        return salary;
    }

    public boolean getHas401K() 
    {
        return has401K;
    }

    public int getCompanyId()
    {
        return companyId;
    }

    public int getHealthPlanId()
    {
        return healthPlanId;
    }

    // setters
    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setHas401K(boolean has401K)
    {
        this.has401K = has401K;
    }

    public void setCompanyId(int companyId)
    {
        this.companyId = companyId;
    }

    public void setHealthPlanId(int healthPlanId)
    {
        this.healthPlanId = healthPlanId;
    }

    // other methods
    public String empName()
    {
        return fname + " " + lname;
    }
 }