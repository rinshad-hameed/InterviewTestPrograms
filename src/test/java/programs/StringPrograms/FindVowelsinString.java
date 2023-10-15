package programs.StringPrograms;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class FindVowelsinString {

    @Test
    public void findvowelsinString(){

        String names = "rinshad";

        ArrayList<Character> vowels= new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

         int counter = 0;

        for(int i=0;i<names.length();i++){

            if(vowels.contains(names.charAt(i))){

                counter = counter +1;
            }

        }
        System.out.println("Number of vowels : "+counter);
    }


}
