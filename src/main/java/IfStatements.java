import java.util.Scanner;

public class IfStatements {
    public static void main (String[] args ){
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Input now"); /* tells the user to input something from the terminal */
        /*Strings*/
        String input = reader.next();

        /*Conditional statements "if"*/
        if(input.equals("password"))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

