package programs.StringPrograms;

import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateWordInSentence {

    @Test
    public void getDuplicateWords(){


            String word = "I am on the way to the market on the table";
            String[] wordSplit = word.split(" ");
            ArrayList<String> stringArray = new ArrayList<String>();

            for(int i = 0;i<wordSplit.length;i++){

                for(int j = i+1;j<wordSplit.length;j++){

                    if(wordSplit[i].equals(wordSplit[j])) {
                        if (!stringArray.contains(wordSplit[j]))
                            stringArray.add(wordSplit[j]);
                    }
                    }

            }
            System.out.println(stringArray.toString());
        }

    @Test
    public void getDuplicateWordsCount(){


        String word = "aaabbtttpppp";
        int counter = 0;
        char[] wordSplit = word.toCharArray();
        String newWord = "";
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        counter = 1;
        for(int i = 0;i<wordSplit.length;i++){

            if(!hashMap.containsValue(wordSplit[i])){

                hashMap.put(counter,Character.toString(wordSplit[i]));
            }else{
                hashMap.put(counter++,Character.toString(wordSplit[i]));
            }

        }
        System.out.println(hashMap.toString());
    }
    }

