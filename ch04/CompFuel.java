/*
 * Add a parameterized method that computes the
 * fuel required for a given distance.
 */

class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // Display the range.
    int range() {
        return mpg * fuelcap;
    }

    // Computes fuel needed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;
 
        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles minivan needs" +
<<<<<<< HEAD
                gallons + " gallons of fuel.");
=======
                gallons + " gallons of fuel");
>>>>>>> f44c2c69a3d98c51e8764a782557bd4c3636e4b0
        
        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs " +
<<<<<<< HEAD
                gallons + " gallons of fuel.");
=======
                gallons + " gallons of fuel");
>>>>>>> f44c2c69a3d98c51e8764a782557bd4c3636e4b0
        }
}
