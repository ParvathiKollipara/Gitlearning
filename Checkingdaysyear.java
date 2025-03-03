class Checkingdaysyear
{
       public static void main(String[] args)
       {
          int days =500; 
          int years = days/365;
          int remainingdays = days % 365;
          int months = remainingdays/30;
          int daysleft = remainingdays % 30;
          System.out.println(days + " days is approximately " + years + " years, "  + months + " months, and " + daysleft + " days.");
     }
}
         
          