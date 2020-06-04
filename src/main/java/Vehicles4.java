// Chapter 4. Class Objects and Methods.
// declaration of Class, Object and Members and methods

public class Vehicles4 {
    int passengers;
    int fuelcap;
    int mpg;

    // create a method called range.
    void range() {
        System.out.println("range is: " + fuelcap * mpg);
    }

    // usage of return.
    void myMeth() {
        int i;

        for (i = 0; i == 10; i++) {
            if (i == 5) return;
            System.out.println();

        }
    }
}

// this class declares an object of type vehicle.
class VehicleDemo {
    public static void main(String[] args) {
        Vehicles4 minivan = new Vehicles4();
        Vehicles4 sportscar = new Vehicles4();
        int range1;
        int range2;

        //assign the values to fields in Minivan.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign the values of sportscar in fields.
        sportscar.passengers = 3;
        sportscar.mpg = 15;
        sportscar.fuelcap = 12;

        // Compute the range assuming full tank of gas.
        minivan.range();
        sportscar.range();

        System.out.println("minivan carries " + minivan.passengers);

        Vehicles4 car1 = new Vehicles4();
        Vehicles4 car2 = car1;
        Vehicles4 car3 = new Vehicles4();
        car2 = car3;

        car1.mpg = 26;
        System.out.println(car1.mpg);
        System.out.println(car2.mpg);
        System.out.println(car3.mpg);

    }


}

class chkNum{
    boolean isEvent(int x){
        if ((x%2) == 0) return true;
        else return false;
    }
}

class permDemo{
    public static void main(String[] args) {
        chkNum e = new chkNum();
        if (e.isEvent(10)) System.out.println(" 10 is even");
        if (e.isEvent(9)) System.out.println(" 10 is even");

    }
}

