class Checking_Grades
{
   public static void main(String[] args)
   {
    int s1=80, s2=80, s3=50, s4=65, s5=96, s6=100;	 
    double max=600;
    int total_marks = s1+s2+s3+s4+s5+s6;
    double percentage =total_marks/max*100;
    if(percentage > 100)
      System.out.println("Invalid");
    else if(percentage >= 90)
      System.out.println("A+ Grade");
    else if(percentage >= 80)
      System.out.println("A Grade");
    else if(percentage >= 70)
      System.out.println("B Grade");
    else if(percentage >= 55)
      System.out.println("C Grade");
    else if(percentage >= 50)
      System.out.println("D Grade");
    else if(percentage >= 35)
      System.out.println("E Grade");
    else 
      System.out.println("Fail");
  }
}