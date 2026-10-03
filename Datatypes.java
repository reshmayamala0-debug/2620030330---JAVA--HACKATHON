import java.util.Scanner;
  public class Datatypes {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

         int panelId = sc.nextInt();
         System.out.println("Panel ID: " + panelId);
        
        float energyGenerated = sc.nextFloat();
        System.out.println("Energy Generated: " + energyGenerated);

        int numberofSolarPanels = sc.nextInt();
        System.out.println("Number of Solar Panels: " + numberofSolarPanels);

        char systemStatus = sc.next().charAt(0);
        System.out.println("System Status: " + systemStatus);
        
        sc.close();

    }
  }