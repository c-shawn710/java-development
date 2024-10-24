package HotelAppExercise;

import java.util.Scanner;

public class HotelOperations {
    public static void main(String[] args) {

        Room room = new Room(3, 120.0, false, true);
        System.out.println("Number of beds in room 1: " + room.getNumOfBed());
        System.out.println("Price for one night for room 1: " + room.getPrice());
        System.out.println("Is room 1 occupied?: " + room.isOccupied());
        System.out.println("Is room 1 dirty?: " + room.isDirty());
        System.out.println("Is room 1 available?: " + room.isAvailable());
        System.out.println(room.checkIn());
        System.out.println(room.checkOut());
        System.out.println(room.cleanRoom());

        Reservation reservation = new Reservation("king", 3, true);
        System.out.println(reservation.getPrice());
        System.out.println(reservation.reservationTotal());

        Employee employee = new Employee("1001", "Shawn", "IT", 34.00, 45);
        System.out.println(employee.getHoursWorked());
        System.out.println(employee.getPayRate());
        System.out.println(employee.getOvertimeHours());
        System.out.println(employee.getTotalPay());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Punch in: ");
        double punchIn = scanner.nextDouble();
        System.out.println("Punch out: ");
        double punchOut = scanner.nextDouble();

        System.out.println("Hours worked this shift: " + employee.punchTimeCard(punchIn, punchOut));
    }
}
