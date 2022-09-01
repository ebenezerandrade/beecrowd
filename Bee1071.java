import java.io.IOException;
import java.util.Scanner;

public class Bee1071 {

    public static void main(String args[]) throws IOException{

        Scanner input = new Scanner(System.in);
        int sum = 0;

        int x = input.nextInt();
        int y = input.nextInt();

        if (x > y) {
            for (int auxCount = x-1; auxCount > y; auxCount--) {
                if (auxCount % 2 != 0) {
                    sum += auxCount;
                }
            }
        }else {
            for (int auxCount = y-1; auxCount > x; auxCount--) {
                if (auxCount % 2 != 0) {
                    sum += auxCount;
                }
            }
        }

        System.out.println(sum+"\n");
    }
}
