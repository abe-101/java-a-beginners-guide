// Try This 7-1.
//
// Build a subclass of Vehicle for trucks.

class Vehicle {
    private int passengers; // number of passengers
    private int fuelcap;    // fuel capacity in gallons
    private int mpg;        // fuel consumption in miles per gallon

    // This is a constructor for vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range.
    int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Accessor methods for instances variables.
    int getPassengers() { return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }

}

// Extend Vehicle to create a Truck specialization.
class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds

    // This is a constructer for Truck.
    Truck(int p, int f, int m, int c) {
        /* Initialise Vehicle members using
         * Vehicle's constructer. */
        super(p, f, m);

        cargocap = c;
    }

    // Accessor methods  for cargocap.
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}

class TruckDemo {
    public static void main(String args[]) {

        // construct some trucks
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 3000);
        double gallons;
        int dist = 252;       

        gallons = semi.fuelneeded(dist);

        System.out.println("Semi can carrry " + semi.getCargo() +
                            " pounds.");
        System.out.println("To go " + dist + " miles semi needs " +
                            gallons + " gallons of fuel.\n");

        
        gallons = pickup.fuelneeded(dist);

        System.out.println("Pickup can carrry " + pickup.getCargo() +
                            " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " +
                gallons + " gallons of fuel.");
    }
}
