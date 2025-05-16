class WhileCommonFactor
{
       public static void main(String[ ] args)
       {
            int n1 = 6, n2 = 12;
            int start = 1, largestfactor = 0, smallestfactor = 0;
            int min = (n1 < n2 ) ? n1 : n2 ;
            System.out.println("Common factors of  " +n1+ " and " +n2+ " are ");
            while(start <= min)
            {
               if(n1%start == 0 && n2 % start == 0)
               {
                 if(start != min)
                 {
                  largestfactor = start;
                  }
                 if(start>1 && smallestfactor == 0)
                {
                   smallestfactor = start;
                 }
                  System.out.println(start);
                }
                start++;
            }
         System.out.println("Largest common factor is " +largestfactor);
         System.out.println("Smallest common factor is " +smallestfactor);

       }
}
                   
                  