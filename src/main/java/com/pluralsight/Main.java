package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Full name: ");
        String fullName = input.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = input.nextLine();

        System.out.print("Billing City: ");
        String billingCity = input.nextLine();

        System.out.print("Billing State: ");
        String billingState = input.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = input.nextLine();

        System.out.print("Shipping Street: ");
        String shippingStreet = input.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = input.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = input.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = input.nextLine();

        StringBuilder addressBuilder = new StringBuilder();

        addressBuilder.append(fullName).append("\n\n");

        addressBuilder.append("Billing Address:\n");
        addressBuilder.append(billingStreet).append("\n");
        addressBuilder.append(billingCity).append(", ");
        addressBuilder.append(billingState).append(" ");
        addressBuilder.append(billingZip).append("\n\n");

        addressBuilder.append("Shipping Address:\n");
        addressBuilder.append(shippingStreet).append("\n");
        addressBuilder.append(shippingCity).append(", ");
        addressBuilder.append(shippingState).append(" ");
        addressBuilder.append(shippingZip).append("\n");

        String addressBuilderString = addressBuilder.toString();
        System.out.println("\n Customer Information");
        System.out.println(addressBuilderString);

        input.close();
    }
}
