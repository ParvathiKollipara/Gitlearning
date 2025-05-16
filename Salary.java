class Salary
{
    public static void main(String[] args)
    {
       int basicsalary=50000;
       int d_allowance = 40*basicsalary/100;
       int h_rent_allowance = 20*basicsalary/100;
       int gross_salary = basicsalary + d_allowance + h_rent_allowance;
       System.out.println(d_allowance);
       System.out.println(h_rent_allowance);
       System.out.println(gross_salary);
     }
} 