import java.util.Scanner;

public class VehicleInsuranceCalculation {

    /*
Project: Auto Insurance Payment Calculator
Vehicle types: car, truck, bus, motorcycle
              -bus: 18-30 seats or 31 and above seats
Tariff period: December 2023, June 2023
1st term: June 2023                     2nd term: December 2023
  cars: 2000                            cars: 2500
  truck: 3000                           truck: 3500
  bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
  motorcycle: 1500                      motorcycle: 1750
In case of incorrect entry, the calculation failed warning should be given to the user and the menu should be shown again.
To be able to let user restart we should present option to restart
*/


    public static void startCalculation(){

        boolean isFailed;
        Scanner input = new Scanner(System.in);

        do {
            isFailed = false;
            System.out.println("-------Welcome to Insurance Calculator Pro V999-------");
            System.out.println("Choose a term for Insurance Calculation:");
            System.out.println(" Press 1 for June 2023");
            System.out.println(" Press 2 for December 2023");
            int term = input.nextInt();

            if (term == 1 || term == 2){

                Vehicle objVehicle = new Vehicle();
                System.out.println("Enter the type of vehicle for payment calculation: ");
                System.out.println("Car, Truck, Bus, Motorcycle ");
                objVehicle.type = input.next().toUpperCase();

                objVehicle.countPayment(term);

                // check the payment is equal to 0 or not. Give answer for both.
                String termName = term == 1 ? "June 2023" : "December 2023";
                int select;
                if (objVehicle.payment>0){
                    System.out.println("Calculation is done successfully!!");
                    System.out.println("Vehicle type: " + objVehicle.type);
                    System.out.println("Term: " + termName);
                    System.out.println("Total payment:  " + objVehicle.payment);


                    System.out.println("To Restart press 1");
                    System.out.println("To Quit press 2");
                    select = input.nextInt();

                    if (select == 1){
                        isFailed = true;
                    } else {
                        isFailed = false;}

                } else {
                    System.out.println("Incorrect data entry");
                    System.out.println("To Restart press 1");
                    System.out.println("To Quit press 2");
                    select = input.nextInt();

                    if (select == 1){
                        isFailed = true;
                    } else {
                        isFailed = false;
                    }
                }

            } else {
                System.out.println("Incorrect data entrance");
                isFailed = true;
            }


        } while (isFailed);

    }

}
