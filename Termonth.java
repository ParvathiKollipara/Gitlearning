class Termonth
{
    public static void main(String[] args)
    {
       int m = 8;
       String res=(m==1|| m==3||m==5|| m==7||m==8||m==10||m==12 ? "31 days" : m==4||m==6||m==9||m==11 ? "30 days" : m==2 ? "28/29 days" : "Invalid Input");
       System.out.println(res);
    }
}
   
      