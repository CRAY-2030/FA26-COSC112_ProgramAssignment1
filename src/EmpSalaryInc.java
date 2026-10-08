/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// import libraries

/**
 *
 * @author CPAL-Admin_mobile
 */
// import libraries
import java.io.*;
import java.util.*;
import javax.swing.*;
public class EmpSalaryInc {


    public static void main(String[] args)throws FileNotFoundException {
        String filepath = "C:\\Users\\carps\\FA26-COSC112_ProgramAssignment1\\src\\EmpData.txt";
        Scanner fin = new Scanner(new FileReader(filepath));

        PrintWriter fout = new PrintWriter( "EmpDataOutput.out");
        // Constant
        final double PERCENT_DIVISOR = 100.0;

        // Input variables
        String lastName, firstName, percentText;
        double currentSalary;

        // Scratch variables
        double percentIncrease, raiseAmount;

        // Output variable
        double newSalary;


        // Process every employee in the file
        while (fin.hasNext()) {

            // Input
            lastName = fin.next();
            firstName = fin.next();
            currentSalary = fin.nextDouble();
            percentText = fin.next();

            // Process
            percentIncrease = Double.parseDouble(percentText);
            raiseAmount = currentSalary * percentIncrease / PERCENT_DIVISOR;
            newSalary = currentSalary + raiseAmount;

            // mirror output to console

            System.out.println("Employee name: " + lastName + ", " + firstName);
            System.out.printf("Current salary: $%.2f\n", currentSalary);
            System.out.println("% pay rise: " + percentText + "%");
            System.out.println();
            System.out.printf("==== New salary amount: $%.2f\n\n", newSalary);

            // mirror to JOptionPane
            JOptionPane.showMessageDialog(null,
                    "Employee name: " + lastName + ", " + firstName + "\n"
                            + "Current salary: $" + String.format("%.2f", currentSalary) + "\n"
                            + "% pay rise: " + percentText + "%\n"
                            + "\n"
                            + "==== New salary amount: $" + String.format("%.2f", newSalary),
                    "Employee Pay Increase", JOptionPane.INFORMATION_MESSAGE);

            // mirror to output file
            fout.println("Employee name: " + lastName + ", " + firstName);
            fout.printf("Current salary: $%.2f\n", currentSalary);
            fout.println("% pay rise: " + percentText + "%");
            fout.println();
            fout.printf("==== New salary amount: $%.2f\n\n", newSalary);
        }

        // Close the files
        fin.close();
        fout.close();

        System.exit(0);
    }
}
