package GitHub_Work.FarenheightToCelcius;
import java.util.Scanner;

public class FarenheightToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        input.close();
    }
}    