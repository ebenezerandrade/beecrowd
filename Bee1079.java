import java.util.Scanner;
import java.io.IOException;

public class Bee1079 {

    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);

        int amountTestCase = input.nextInt();
        float value1, value2, value3, average;
        for(int count=0; count < amountTestCase; count++){
            value1 = input.nextFloat();
            value2 = input.nextFloat();
            value3 = input.nextFloat();
            average = ((value1*2) + (value2*3) + (value3*5))/10;
            System.out.println(String.format("%.1f", average));
        }

    }
}
