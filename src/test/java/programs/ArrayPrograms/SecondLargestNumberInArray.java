package programs.ArrayPrograms;

import org.testng.annotations.Test;

public class SecondLargestNumberInArray {

    @Test
    public void findLargestNumberinAarray()
    {
        int a[]={1,2,5,6,3,2};
        int total = a.length;
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest: "+a[total-2]);
    }

}

