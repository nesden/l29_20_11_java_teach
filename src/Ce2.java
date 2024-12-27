import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ce2 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 5) + 1;
        System.out.println("num1 is: " + num1);
        int num2 = (int) (Math.random() * 5) + 1;
        System.out.println("num2 is: " + num2);

        if (num1 == num2) {
            System.out.println("Both numbers are equal to the value " + num1);
        } else {
            System.out.println("The numbers are not equal, the value of the first number is "
                    + num1 + " and the value of the second number is " + num2);
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.println("Current date and time: " + formattedDateTime);


//      optional
        LocalDateTime presentationDateTime = LocalDateTime.of(2022, 2, 26, 18, 0, 33);
        String formattedPresentationDateTime = presentationDateTime.format(formatter);

        System.out.println("Presentation date and time: " + formattedPresentationDateTime);
    }
}
