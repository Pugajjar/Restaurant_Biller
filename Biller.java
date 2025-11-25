import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);

    String item_name;
    double price;
    int quantity;

        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to the billing section of XYZ restaurent");
        System.out.println("-------------------------------------------------------");

        System.out.print("->Enter the item you want to buy :");
        item_name= scanner.nextLine();
        System.out.println("You have selected :"+item_name);

        System.out.print("->Enter the price written on menu card :");
        price= scanner.nextDouble();
        System.out.println("You have selected :"+price);

        System.out.print("->Enter the quantity you want to buy :");
        quantity= scanner.nextInt();
        System.out.println("You have selected :"+quantity);

        System.out.println("========================================================================");
        double total= quantity*price;

        System.out.println("The total is :"+total);

        System.out.println("========================================================================");
    scanner.close();
    }
}