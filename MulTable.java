class MulTable
{
       public static void main(String[ ] args)
        {
              int start = 10, end = 1, table = 8;
              while(start>=end) 
              {
                  int product = table*start; 
                  int num = start;
                  int square = (int)(Math.sqrt(product));  
                  if(square*square == product) 
                  {
                  System.out.println(table+ " x " +start+ " = " +product);  
                  }
                  start--;
              }
      }
}