class SwitchCaseNum
{
         public static void main(String[] args)
         {
                 int  n1 = -10;
                 String  res = (n1 > 0) ?  "Positive" : (n1 < 0 ) ?  "Negative" : "Zero";
                 switch(res) {
                             case "Positive": System.out.println(n1+ " is positive");
                             break;
                             case "Negative": System.out.println(n1+ " is Negative");
                             break;
                             case "Zero": System.out.println(n1+ " is Zero");
                             break;
                     }
          }
}