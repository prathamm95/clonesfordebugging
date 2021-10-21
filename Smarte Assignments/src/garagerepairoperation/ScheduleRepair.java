package garagerepairoperation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleRepair {

    public static Queue<Vehicles> myQueue = new LinkedList<Vehicles>();
    private static double accountBalance = 0;
    private static int carCount = 0;
    private static int bikeCount = 0;


    public void repairVehicle(Vehicles vehicle) {
        RepairVehicle.repairVehiclesInQueue();
        if (this.myQueue.size() < 2) {
            accountBalance = accountBalance + vehicle.getRepairCost();
            myQueue.add(vehicle);
            updateSummary(vehicle);
            System.out.println("No of currently repairing vehicles = " + this.myQueue.size());


            System.out.println("Account balance = " + accountBalance);
            System.out.println("Ongoing repairs = " + myQueue);
            System.out.println("Cars = " + carCount + " Car cost = " + carCount * Vehicles.CAR.getRepairCost());
            System.out.println("Bikes = " + bikeCount + " Bike cost = " + bikeCount * Vehicles.BIKE.getRepairCost());
        } else {
            System.out.println("\nGarage is full, please visit later\n");
        }


    }

    private void updateSummary(Vehicles vehicle) {
        if (Vehicles.CAR.equals(vehicle)) {
            carCount++;
        } else if (Vehicles.BIKE.equals(vehicle)) {
            bikeCount++;
        }
    }


}

