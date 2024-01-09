import java.util.Scanner;

public class Vehicle {

    /*
    1st term: June 2022                      2nd term: December 2023
      cars: 2000                               cars: 2500
      truck: 3000                              truck: 3500
      bus: type1: 4000 type2: 5000             bus: type1: 4500 type2: 5500
      motorcycle: 1500                         motorcycle: 1750
     */

    String type;

    int payment;

    public int countPayment(int term){

        if (term == 1){

            switch (type){
                case "CAR":
                    payment = 2000;
                    break;
                case "TRUCK":
                    payment = 3000;
                    break;
                case "BUS":
                    countBusPayment(term);
                    break;
                case "MOTORCYCLE":
                    payment = 1500;
                    break;
                default:
                    System.out.println("Please enter a valid vehicle type.");
                    payment = 0;

            }
        } else if (term == 2){

            switch (type) {
                case "CAR":
                    payment = 2500;
                    break;
                case "TRUCK":
                    payment = 3500;
                    break;
                case "BUS":
                    countBusPayment(term);
                    break;
                case "MOTORCYCLE":
                    payment = 1750;
                    break;
                default:
                    System.out.println("Please enter a valid vehicle type.");
                    payment = 0;
            }

        } else {
            System.out.println("Calculation failed.");
            payment = 0;
        }
        return payment;
    }

    public int countBusPayment(int term){

        Scanner input = new Scanner(System.in);
        System.out.println("Choose the type of bus: ");
        System.out.println("Bus Type 1: 18-30 seats");
        System.out.println("Bus Type 2: 31 and above seats");

        int busType = input.nextInt();

        switch (busType){
            case 1:
                if (term == 1){
                    payment = 4000;
                } else {
                    payment = 4500;
                }
                break;
            case 2:
                if (term == 1){
                    payment = 5000;
                } else {
                    payment = 5500;
                }
                break;
            default:
                System.out.println("Incorrect Data Entry!");



        }
        return payment;
    }

}
