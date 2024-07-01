import java.util.Locale;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args)  {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.CANADA);

        System.out.println("Type the first parameter:");
        int firstParameter = terminal.nextInt();
        System.out.println("Type the second parameter:");
        int secondParameter = terminal.nextInt();
        
        try {
            countOccurreces(firstParameter, secondParameter);

        } catch (InvalidParametersException e) {
            System.err.println(e.getMessage());
        }

        terminal.close();
    }

    static void countOccurreces(int param1, int param2) throws InvalidParametersException {

        if (param1 > param2)  {
            throw new InvalidParametersException("The second parameter must be greater than the first");

        } for(int count = param1; count <= param2; count++) {
            System.out.println("Occurrence: " + count);
        }
    }
}
