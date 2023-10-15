package programs.Generic;

import utilities.AgeException;
import org.testng.annotations.Test;

public class CustomExceptionTest {

    @Test
    public void exceptionTest()
    {
        int age  = 1;
        try{
                checkAge(age);

        }catch (AgeException e){
            System.out.println("Problem occured "+e);
        }
    }

    public void checkAge(int age) throws AgeException {

        if(age<18){
            throw new AgeException("You must be 18 or less than ");
        }

    }
}
