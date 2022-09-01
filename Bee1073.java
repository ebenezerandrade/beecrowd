import java.util.Scanner;
import java.io.IOException;

public class Bee1073 {

    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);

        int value = input.nextInt();

        if(value>5 && value<2000) {
            for (int count = 1; count <= value; count++) {
                if (count % 2 != 1) {
                    System.out.println(count + "^2 = " + count * count);
                }
            }
        }
    }
}
