package garagerepairoperation;

import java.util.Timer;
import java.util.TimerTask;

class Helper extends TimerTask {
    public void run() {
        Vehicles vehicle = ScheduleRepair.myQueue.poll();
        if (vehicle == null) {
            RepairVehicle.timer.cancel();
        } else {
            System.out.println("Repaired" + vehicle.getVehicleName());
        }
    }
}

public class RepairVehicle {
    public static Timer timer;

    public static void repairVehiclesInQueue() {
        timer = new Timer();
        TimerTask task = new Helper();
        timer.schedule(task, 30000);
    }
}
