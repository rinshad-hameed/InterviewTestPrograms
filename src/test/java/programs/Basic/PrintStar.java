package programs.Basic;

import org.testng.annotations.Test;

public class PrintStar {

    @Test
    public  void printStar() {

        int row = 10; int column = 10;
        for (int i = 0; i < row; i++) {
            String star = "";
            for (int j = 0; j < column; j++) {
                star = star + "*";

            }
            System.out.println(star);
        }

    }
}
