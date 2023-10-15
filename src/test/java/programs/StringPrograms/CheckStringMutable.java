package programs.StringPrograms;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class CheckStringMutable {
    @Test
    public void checkStringMutability(){


        String s = "Strings";
        String s2 = "Strings2";
        s=s2;

        s2="news2";

        System.out.println(s);

    }
}
