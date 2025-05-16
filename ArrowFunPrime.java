<!Doctype html>
<html>
         <head>
               <title>Arrow Function Prime</title>
            
         </head>
         <body>
             <script>
                   let prime=(num)=>
                  {
                      var count =0;
                      for(start=1; start<=num; start++)
                     {
                          if(num%start==0)
                         {
                            count++;
                         }
                     }
                  console.log(count==2 ? "Prime" : "Not Prime");
                 }
                console.log(prime(7));
             </script>  
        </body>
</html>