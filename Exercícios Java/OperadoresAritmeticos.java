/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoresaritmeticos;
import java.util.Scanner;
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        // Input
        try (Scanner scanner = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the total bill amount: ");
            double totalBill = scanner.nextDouble();
            
            System.out.print("Enter the number of installments: ");
            int installments = scanner.nextInt();
            
            System.out.print("Enter the discount percentage for early payment: ");
            double discountPercent = scanner.nextDouble();
            
            System.out.print("Enter the late fee percentage: ");
            double lateFeePercent = scanner.nextDouble();
            
            // Calculations
            double discountAmount = totalBill * (discountPercent / 100);
            double totalWithDiscount = totalBill - discountAmount;
            
            double lateFeeAmount = totalBill * (lateFeePercent / 100);
            double installmentWithLateFee = (totalBill + lateFeeAmount) / installments;
            
            // Output
            System.out.printf("Total with discount for early payment: %.2f%n", totalWithDiscount);
            System.out.printf("Each installment amount with late fee: %.2f%n", installmentWithLateFee);
        }
    }
}
