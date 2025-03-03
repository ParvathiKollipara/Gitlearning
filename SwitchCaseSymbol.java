class SwitchCaseSymbol
{
          public static void main(String[ ] args)
         {
            int num1 = 10, num2 = 0;
            char operator  = '%';
            int result;
            switch(operator){
                       case '+' : result = num1 + num2;
                       System.out.println(" Result is " + result);
                       break;
                       case '-' : result = num1 - num2;
                       System.out.println(" Result is " + result);
                       break;
                       case '*' : result = num1 * num2;
                       System.out.println(" Result is " + result);
                       break;
                       case '/' :
                       if(num2 != 0){ 
                               result = num1 / num2;
                               System.out.println(" Result is " + result);
                       }
                       else{
                              System.out.println(" It is not divisible");
                         }
                             break;
                       case '%' : 
                       if(num2 != 0){ 
                               result = num1 / num2;
                               System.out.println(" Result is " + result);
                       }
                       else{
                              System.out.println(" Modulus error");
                         }
                        break;

             default:
                     System.out.println("Invalid Operator");
              }
       }
}


          
          
       