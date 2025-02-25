class Checking_Age
{
    public static void main(String[] args)
    {
     int age = 125;
     if(age<0)
       System.out.println("Invalid Age");
     else if(age<10)
       System.out.println("Kid");
     else if(age<18)
       System.out.println("Minor");
     else if(age<60)
       System.out.println("Major");
     else if(age<100)
       System.out.println("Senior Citizen");
     else
       System.out.println("Invalid");
    }
}