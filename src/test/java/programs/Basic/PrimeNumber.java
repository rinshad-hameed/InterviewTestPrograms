package programs.Basic;

import org.testng.annotations.Test;

public class PrimeNumber
{
        @Test
        public  void isPrimeNumber()
        {
           int number  = 4;

            for(int i=2;i< number;i++){
               if(number%i==0)
               {
                   System.out.println("Number is not prime");
                   return;
               }else{

               }
            }
            System.out.println("Number is prime");
            //  return revText;
        }
}
