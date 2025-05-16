class Evennestedifelse
{
    public static void main(String[] args)
    {
      int num = 45;
      if(num%2==0)
      {
            double sqrt=Math.sqrt(num);
            if(sqrt*sqrt==num)
           {
                System.out.println(num+ " is even & a Perfect square");
           }
           else
           {
                System.out.println(num+ " is even & not a Perfect square"); 
           }
       }
      else{
            int lastdigit=num%10;
            if(lastdigit%5==0)
           {
                System.out.println("Last digit is divible by 5");
            }
            else
            {
                 System.out.println("Last digit is not divisible by 5");
            }
       }
           System.out.println((num%2==0 ) ?( (sqrt*sqrt==num) ? num+ " is even & a Perfect square" :  num+ " is even & not a Perfect square" ) ) :  ( (lastdigit%5==0) ? "Last digit is divible by 5" : "Last digit is not divisible by 5") );
   }
}
   
   