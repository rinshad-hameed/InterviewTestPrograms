package programs.Basic;

import org.testng.annotations.Test;

public class ASCIValue {
    @Test
    public void printAsciValue(){
        char a = 'a';

        char b = 'b' ;
        int valuea = a;
        int valueb = b;

        System.out.println("AsciValue of a is : "+valuea);
        System.out.println("AsciValue of b is : "+valueb);

    }
}
