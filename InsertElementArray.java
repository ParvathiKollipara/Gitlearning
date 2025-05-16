class InsertElementArray
{
     public static void main(String[] args)
     {
         int a[] = {10, 20, 30, 40, 50, 60};
         int index = 3;
         int value = 20;
         int newarr[] = new int[a.length+1];
         for(int x=0; x<index; x++)
         {
               newarr[x] = a[x];
         }
        newarr[index] = value;
        for(int x =index; x<a.length; x++)
        {
            newarr[x+1] = a[x];
        }
       System.out.println("Modified Array" +Arrays.toString(newarr)); 
    }
}       