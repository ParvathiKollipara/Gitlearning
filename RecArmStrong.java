class RecArmStrong
{
            public static void main(String[] args)
           {
               RecArmStrong r = new RecArmStrong();
               int count =  r.countCal();
               int sum =  r.sum();
               int armstrong = r.armstrong();
               System.out.println(count+" "+ sum+" "+ armstrong);
            }
          int countCal(int num, int count)
          {
                  if(num == 0)
                  {
                         return count;
                  }
                  else{
                         count++;
                         num = num/10;
                         countCal(num, count);
                  }
           }
           int sum(int num, int count, int sum)
           {
                 if(num == 0)
                 {
                        return sum;
                 }
                 else{
                       int rem = num%10;
                       int power = (int)Math.pow(rem, count);
                       sum = sum + power;
                       num = num/10;
                      sum(num, count, sum);
                }
           }
          void armstrong(int sum, int num)
          {
                if(sum == num)
                {
                     System.out.println("Armstrong Number");
                }
          }
}

 