import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner stdIn = new Scanner(System.in);

                System.out.print("身長:");
                double height = stdIn.nextDouble();
                System.out.print("体重:");
                double weight = stdIn.nextDouble();

                double bmi = weight / (Math.pow(height, 2) * 100) * 100;

                System.out.println("BMI値は"+ (Math.floor(bmi * 100)) / 100);


		Scanner stdIn2 = new Scanner(System.in);
		System.out.print("身長:");
                double height2 = stdIn2.nextDouble();
                System.out.print("体重:");
                double weight2 = stdIn2.nextDouble();

                double bmi2 = weight2 / (Math.pow(height2, 2) * 100) * 100;

                System.out.println("BMI値は"+ (Math.floor(bmi2 * 100)) / 100);


        }
}

