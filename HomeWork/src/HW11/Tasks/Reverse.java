package HW11.Tasks;
import java.util.Locale;
import java.util.Scanner;
public class Reverse {

    public void getReversedStr () throws LowercaseException {
        System.out.println("Enter some words or symbols:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String lowercase = str.toLowerCase();
        char[] strArr = str.toCharArray();
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.println(strArr[i]);
          if (strArr.equals(lowercase)) {
              System.err.println("You can not use lowercase");
              throw new LowercaseException();
          }
    }
    }
}
