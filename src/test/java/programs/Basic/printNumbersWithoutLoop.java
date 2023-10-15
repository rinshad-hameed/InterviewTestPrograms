package programs.Basic;

import org.testng.annotations.Test;

class printNumbersWithoutLoop
{
    @Test
    public static void printNos(int initial, int last)
    {
        if (initial <= last) {
            System.out.print(initial + " ");
            printNos(initial + 1, last);
        }
    }
}