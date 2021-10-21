package garagerepairoperation;

public enum Vehicles {

    CAR("Car", 500),
    BIKE("Bike", 200);


    private String vehicleName;
    private int repairCost;


    private Vehicles(String vehicleName, int repairCost) {

        this.vehicleName = vehicleName;
        this.repairCost = repairCost;

    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getRepairCost() {
        return repairCost;
    }

}
