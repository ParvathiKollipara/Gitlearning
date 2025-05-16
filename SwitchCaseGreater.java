class SwitchCaseGreater
{
       public static void main(String[] args)
       { 
             int n1 = 55, n2 = 40;
             String res = ((n1 > n2) ? n1+ " is greater (>)" : n2+ " is greater(>)");
             switch(res){
                       case '>' : System.out.println( n1+ " is greater (>)");
                       break;
                       case '<' : System.out.println(n2+ " is greater(>)");
                       break;
                   default :
                        System.out.println("Invalid comparison symbol");
                        break;
            }
      }
}