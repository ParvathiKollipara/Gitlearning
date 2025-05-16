class Insurance
{
     public static void main(String[ ] args)
     {
            String health = "poor";
            int age = 28;
            String gender = "male";
            String location= "Village";
            int premium = 0;
            int policyamount = 0;
            boolean isInsured = true;

       if(health == "excellent" && age >= 25 && age <= 35 &&( location == "city" || location == "Vijayawada"))
       {  
            
            if(gender == "male")
            {
               premium = 4;
               policyamount = 200000;
            }
            else
            {
                premium=3;
                policyamount = 100000;
             }
           isInsured=true;
        }
        else if(health == "poor" && age >= 25 && age <= 35 && location=="Village" && gender == "male")
        {
           premium=6;
           policyamount=10000;
           isInsured=true;
         }
        if(isInsured)
        {
           System.out.println("The person is eligible for insurance");
           System.out.println("Premium rate is  " +  premium + "  per thousand");
           System.out.println("Maximum amount is " + policyamount);
        }
        else{
             System.out.println("The person is not eligible for insurance");
          
         }
           System.out.println("____________________________________");
     }
}
        

            
             


           
           


              
           
          
         