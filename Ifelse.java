import java.util.Scanner;
public class Ifelse {
 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the energy generated in kWh: ");
    double energy = sc.nextDouble();
    if (energy >= 10) {
        System.out.println("Good energy generation.");
    } else {
        System.out.println("Low energy generation.");
    }
    sc.close();
 }
    
}
