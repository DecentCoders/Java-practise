import java.util.Scanner;

public class Vehicle {
    private int speed;
    private int volume; // vehicle size
    private boolean isSpeedSet = false;

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
            isSpeedSet = true;
            System.out.println("Speed updated to " + speed + " km/h.");
        } else {
            System.out.println("Error: Speed cannot be negative. Speed not set.");
        }
    }

    public void setVolume(int volume) {
        if (volume > 0) {
            this.volume = volume;
            System.out.println("Vehicle volume set to " + volume + " cubic meters.");
        } else {
            System.out.println("Error: Volume must be positive.");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getVolume() {
        return volume;
    }

    public void move() {
        if (!isSpeedSet) {
            System.out.println("Error: Set the vehicle's speed first (Option 1).");
            return;
        }
        System.out.println("Vehicle is moving at " + speed + " km/h!");
    }

    public void speedUp() {
        if (!isSpeedSet) {
            System.out.println("Error: Set the vehicle's speed first (Option 1).");
            return;
        }
        speed += 10;
        System.out.println("Accelerated! New speed: " + speed + " km/h.");
    }

    public void speedDown() {
        if (!isSpeedSet) {
            System.out.println("Error: Set the vehicle's speed first (Option 1).");
            return;
        }
        speed = Math.max(speed - 10, 0);
        System.out.println("Decelerated! New speed: " + speed + " km/h.");
    }

    public void showDetails() {
        System.out.println("\n--- Current Vehicle Details ---");
        System.out.println("Volume: " + volume + " cubic meters");
        System.out.println("Speed: " + (isSpeedSet ? speed + " km/h" : "Not set"));
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle myVehicle = new Vehicle();

        System.out.println("=== Welcome to the Vehicle Controller ===");
        System.out.print("Please enter the vehicle's volume (cubic meters): ");
        int vol = scanner.nextInt();
        myVehicle.setVolume(vol);
        while (true) {
            System.out.println("\n--- Menu Options ---");
            System.out.println("1. Set initial speed (km/h)");
            System.out.println("2. Accelerate (increase speed by 10 km/h)");
            System.out.println("3. Decelerate (decrease speed by 10 km/h)");
            System.out.println("4. Move vehicle");
            System.out.println("5. Show vehicle details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1–6): ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input! Please enter a number (1–6).");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter new speed (km/h): ");
                    int newSpeed = scanner.nextInt();
                    myVehicle.setSpeed(newSpeed);
                    break;
                case 2:
                    myVehicle.speedUp();
                    break;
                case 3:
                    myVehicle.speedDown();
                    break;
                case 4:
                    myVehicle.move();
                    break;
                case 5:
                    myVehicle.showDetails();
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }
}
