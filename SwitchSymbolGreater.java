class SwitchSymbolGreater
{
         public static void main(String[ ] args)
         {
               int n1 = 5, n2 = 60;
               char res = (n1 > n2) ? '>' : '<' ;
               switch(res){
                        case '>' : System.out.println("The Greater Symbol is : > ");
                        break;
                        case '<' : System.out.println("The Greater Symbol is : < ");
                        break; 
                 default:
                       System.out.println("Invalid comparison symbol");
                       break;  
           }
      }
}            