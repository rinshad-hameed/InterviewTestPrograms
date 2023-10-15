package programs.Basic;

import org.testng.annotations.Test;

public class FactorialNumber {

    @Test
    public void printFactorialNumber(){
        int num = 5;

        int fact =1 ;

        for(int i=num;i>0;i--){
            fact = fact * i;
        }
        System.out.println("Factoriral is :"+fact);

    }
}
