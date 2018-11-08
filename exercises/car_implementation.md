# Class Implementation

## Car Simulation

Write `Car` class. 
A car is defined by:

How much petrol the car can hold:
- `int maxFuel`

How much petrol is left:
- `int fuelLeft`

How much petrol is used per kilometer:
- `int fuelPerKilometer`


A car is constructed with how much fuel it can hold and how much fuelPerKilometer it uses:
- `Car(int maxFuel, int fuelPerKilometer)`

A car can be refueled. The method accepts how much to refuel and returns how much more fuel is needed until the tank is full.
It returns a negative number if the tank overflows.
The fuel goes into the tank, but the tank can not become more full than maxFuel.
- `int refuel(int liters)`

Driving uses fuel from the tank. How much fuel is used is defined by fuelPerKilometer. 
The tank must never become more than empty `< 0`
- `void drive(int kilometers)`

To check how much fuel is left the following method needs to be implemented:
- `int getFuelLeft()`

-----
Use the following main class to check your code:

```Java
import org.redischool.introjava.Car;

public class Main {

    public static void main(String[] args) {
        int tankSize = 10;

        Car car = new Car(tankSize, 1);
        int left = car.refuel(3);
        left = car.refuel(left);
        if (left != 0) {
            System.out.println("ERROR: refuel method is wrong.");
            System.out.printf("|- Expected: %d, Got: %d\n", 0, left);
            return;
        }

        car.drive(4);
        car.drive(2);

        left = car.getFuelLeft();
        if (left != 4) {
            System.out.println("ERROR: drive org getFuelLeft method is wrong.");
            System.out.printf("|- Expected: %d, Got: %d\n", 4, car.getFuelLeft());
            return;
        }

        left = car.refuel(100);
        if (left != -94) {
            System.out.println("ERROR: refuel method is wrong.");
            System.out.printf("|- Expected: %d, Got: %d\n", -94, left);
            return;
        }

        left = car.getFuelLeft();
        if (left != tankSize) {
            System.out.println("ERROR: refuel or getFuelLeft method is wrong.");
            System.out.printf("|- Expected: %d, Got: %d\n", tankSize, left);
            return;
        }

        car.drive(100);
        left = car.getFuelLeft();
        if (left != 0) {
            System.out.println("ERROR: drive or getFuelLeft method is wrong.");
            System.out.printf("|- Expected: %d, Got: %d\n", 0, left);
            return;
        }

    }
}

```
