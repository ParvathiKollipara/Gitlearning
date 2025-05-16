class ArrayPrime
{
       public static void main(String[] args)
       {
          int a[][] ={{1,2,3}, {4,5,6,7}, {7,8}, {9,4,5,76}};
           for(int r=0; r<=a.length-1; r++)
           {
               System.out.println("Prime elements in each row " +r+ " : ");
               for(int c=0; c<=a[r].length-1; c++)
               {
                    if(isPrime(a[r][c]))
                    {
                        System.out.print(a[r][c]+" ");
                     }
                  }
            System.out.println();
          }
     }
        static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
     }
}