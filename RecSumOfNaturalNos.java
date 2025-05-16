class RecSumOfNaturalNos
{
     public static void main(String[] args)
     {
         RecSumOfNaturalNos r = new RecSumOfNaturalNos();
         r.sumOfNaturalNos(5,0, 0);
      
     }
    void sumOfNaturalNos(int n, int x, int sum)
    {
       if(x>n)
       {
           System.out.println(sum);
       }
       else
       {
           sum = sum+x;
           sumOfNaturalNos(n, x+1, sum);
       }
    }
}