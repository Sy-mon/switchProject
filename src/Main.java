import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter your name: ");
String name = scan.nextLine();


switch (name){
    case "Simon Muyomba":
        System.out.println("Welcome back, "+ name);
        break;
    case "Philip Sebyala":
        System.out.println("See class monitor");
        break;
    default:
        System.out.println("Access denied 👊");
}





    }
}