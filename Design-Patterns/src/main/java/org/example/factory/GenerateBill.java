package org.example.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan for which the bill will be generated: ");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String planName = br.readLine();

            System.out.print("Enter the number of units for bill will be calculated: ");

            int units = Integer.parseInt(br.readLine());

            Plan p = planFactory.getPlan(planName);

            if(p == null) {
                System.out.println();
                System.out.println("Exited Because of Null Pointer Exception");

                return;
            }

            System.out.print("Bill amount for " + planName + " of " + units + " units is: ");

            p.getRate();
            p.calculateBill(units);
        }
    }
}
