# Vehicle Insurance Calculator

This Java application calculates insurance payments based on vehicle types and tariff periods. It allows users to input their vehicle type and the desired term for insurance calculation, providing the corresponding payment amount based on predefined tariff rates.

## Features

- **Vehicle Types Supported**: Car, Truck, Bus, Motorcycle
- **Tariff Periods**:
  - June 2023
  - December 2023
- **Payment Rates** (Based on Term):
  - **June 2023**:
    - Car: $2000
    - Truck: $3000
    - Bus Type 1 (18-30 seats): $4000
    - Bus Type 2 (31+ seats): $5000
    - Motorcycle: $1500
  - **December 2023**:
    - Car: $2500
    - Truck: $3500
    - Bus Type 1 (18-30 seats): $4500
    - Bus Type 2 (31+ seats): $5500
    - Motorcycle: $1750
- **User Interaction**: Provides a menu-driven interface for users to input their choices and view insurance payment details.

## Usage

To use this calculator:
1. Compile the Java files (`VehicleInsuranceCalculation.java`, `Vehicle.java`, `Main.java`).
2. Run the `Main.java` file to start the application.
3. Follow the on-screen prompts to input the desired term and vehicle type for payment calculation.
4. View the calculated insurance payment and choose to restart or quit.

## Note

- Ensure valid input for vehicle types and term selections.
- Incorrect data entry prompts a warning message and allows the user to restart the calculation.
