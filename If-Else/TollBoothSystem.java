public class TollBoothSystem{
    public static void main(String[] args) {
        int vehicleType = 2; // 1 for car, 2 for truck, 3 for motorcycle
        double tollFee;

        if (vehicleType == 1) {
            tollFee = 5.00;
        } else if (vehicleType == 2) {
            tollFee = 10.00; 
        } else if (vehicleType == 3) {
            tollFee = 3.00; 
        } else {
            tollFee = 0.00;
            System.out.println("Invalid vehicle type.");
        }

        System.out.println("The toll fee is: $" + tollFee);
    }
}