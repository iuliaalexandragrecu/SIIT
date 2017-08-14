package ro.sci.carrental.Domain.domain.car;

/**
 * Created by iulia grecu on 5/21/2017.
 */
public class Car{

        private String make;
        private String model;
        private String registration;
        private String color;
        private int seats;
        private int doors;
        private float size;
        private boolean ac=false;
        private boolean gps=false;
        private GearboxType gearboxType;
        private FuelType fuelType;
        private VehicleCategory vehicleCategory;
        private boolean onLoan = false;

    public Car() {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
    }

    public String getMake() {return make;}
        public void setMake(String make) {this.make= make;}

        public String getModel() {return model;}
        public void setModel(String model) {this.model = model; }

        public String getRegistration() {return registration; }
        public void setRegistration(String registration){this.registration =registration;}

        public String getColor () {return color;}
        public void setColor (String color) {this.color = color;}

        public int getSeats() {return seats;}
        public void setSeats (int seats) {this.seats = seats;}

        public int getDoors() {return doors;}
        public void setDoors (int doors) {this.doors = doors;}

        public float getSize (float size) {return size;}
        public void setSize (float size) {this.size = size;}

        public boolean hasAc (boolean ac) {return ac;}
        public void setAc (boolean ac) {this.ac = ac;}

        public boolean hasGps (boolean gps) {return gps;}
        public void setGps (boolean gps) {this.gps = gps;}

        public GearboxType getGearboxType() {return gearboxType;}
        public void setGearboxType (GearboxType getGearboxType) {this.gearboxType= getGearboxType;}

        public FuelType getFuelType() {return fuelType;}
        public void setFuelType(FuelType fuelType) {this.fuelType = fuelType; }

        public VehicleCategory getVehicleCategory() {return vehicleCategory;}
        public void setVehicleCategory (VehicleCategory vehicleCategory) {this.vehicleCategory = vehicleCategory;}

        public boolean isOnLoan(boolean b) {return onLoan;}
        public void setOnLoan (boolean onLoan) {this.onLoan = onLoan;}
    }



