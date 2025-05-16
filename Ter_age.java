class  Ter_age
{
        public static void main(String[ ] args)
        {
               int age = 80;
               if(age >= 60)
               {
                    String gender = "female";
                    if(gender == "female")
                    {
                         System.out.println(" Retirement amount is 30000 per year because you are a female Senior citizen");
                     }
                    else
                    {
                         System.out.println(" Retirement amount is 35000 per year because you are a male Senior citizen");
                     }
             }
               else if(age >= 18)
                {
                       String qualification= "UG";
                       if(qualification== "UG")
                       {
                             System.out.println("Scholarship is 30000 per year");
                       }
                       else if(qualification== "PG")
                       { 
                             System.out.println("Scholarship is 40000 per year");
                       }
                       else
                       {
                              System.out.println("Scholarship is 20000 per year");
                        }
		}
               else
		{
                         System.out.println("You are not eligible for retirement and scholarship");
                      }
           String gender = "female";
	String qualification= "UG";
               System.out.println( age >= 60 ? (gender == "female" ? " Retirement amount is 30000 per year because you are a female Senior citizen" : " Retirement amount is 35000 per year because you are a male Senior citizen") :  age >= 18 ? qualification== "UG"  ? "Scholarship is 30000 per year" : qualification== "PG" ? "Scholarship is 40000 per year" : "Scholarship is 20000 per year" :  "You are not eligible for retirement and scholarship") ;
}s
}
 
                        