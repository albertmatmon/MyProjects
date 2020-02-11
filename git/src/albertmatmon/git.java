// @author albertmatmon
//4-2-2020
//pedir DNI y decir la letra
package albertmatmon;


import java.util.Scanner;

public class git {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        keyboard.useDelimiter("\n");
        char letter;
        int dni;
        System.out.print("Write numbers of your DNI ");
        dni = keyboard.nextInt();
        letter = DNIletter(dni);
        System.out.println("Your DNI is: "+dni+""+letter);

    }

    private static char DNIletter(int dni) {
        char letter = 'A';
        int let;
        char letra[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; ;
        let=dni%23;
        letter =letra[let];

        return letter;
    }

}
