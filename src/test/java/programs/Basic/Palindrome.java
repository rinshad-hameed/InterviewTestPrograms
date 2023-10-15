package programs.Basic;

import org.testng.annotations.Test;

public class Palindrome {


    @Test
    public  void isPanlidrome()
    {
        String input = "Whereareyougoing";
        String revText = "";

        for(int i=input.length()-1;i>=0;i--){
            revText= revText+input.charAt(i);
        }

        System.out.println(revText);
      //  return revText;
    }
}
