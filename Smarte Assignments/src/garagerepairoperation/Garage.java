package garagerepairoperation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Garage {

    //main
    public static void main(String[] args) {

        int userInput = 0;

        do {
            try {

                Scanner scanner = new Scanner(System.in);

                System.out.println("\n>>WELCOME TO VEHICLE REPAIR SHOP<<");
                System.out.println("PRESS THE NUMBERS TO SELECT FROM THE REPAIR OPTIONS");
                System.out.println("1: Car\n2: Bike\n9: To Exit Garage");
                System.out.println("Exit : 9");

                userInput = scanner.nextInt();

                ScheduleRepair repair = new ScheduleRepair();
                if (userInput == 1) {
                    repair.repairVehicle(Vehicles.CAR);
                } else if (userInput == 2) {
                    repair.repairVehicle(Vehicles.BIKE);
                } else {
                    System.out.println("Sorry this operation is not available");
                }

            } catch (InputMismatchException e) {
                System.out.println("Sorry this operation is not available");
            }
        } while (userInput != 9);


        System.out.println(">>THANK YOU FOR USING THE GARAGE!<<\n-----See you soon-----");
        System.exit(9);
    }


}
