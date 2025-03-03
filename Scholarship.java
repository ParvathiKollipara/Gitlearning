class Scholarship
{
    public static void main(String[] args)
    {
        int fee=50000;
        int scholarship=0;
        String gender="Male";
        if(gender=="Male")
        {
          scholarship=15000;
          fee = fee-scholarship;
          System.out.println("Your total fee is " +fee + " because your gender is " +gender);
        }
        else
        {
          scholarship=20000;
          fee = fee-scholarship;
          System.out.println("Your total fee is " +fee + " because your gender is " +gender);
        }
     }
}