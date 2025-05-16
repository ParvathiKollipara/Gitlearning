class Number
{
  public static void main(String[] args)
  {
   int n1=20, n2=10;
   if(n1==n2)
   {
   System.out.println("Equal numbers");
   }
   else if(n1 > n2)
   {
    System.out.println(n1+ "number is greater");
   }
   else{
      System.out.println(n2+ "number is greater");
   }
   System.out.println( n1==n2 ? "Numbers are equal" : ("Greater number is: " + ((n1 > n2)? n1:n2) ) );
 }
}   