package com.pluralsight;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    try {
        BufferedReader bufReader = new BufferedReader(new FileReader("employees.csv"));
        String input = bufReader.readLine();

        while ((input = bufReader.readLine()) != null) {

            String[] arraySplit = input.split("\\|");
            int employeeID = Integer.parseInt(arraySplit[0]);
            String employeeName = arraySplit[1];
            double employeeHours = Double.parseDouble(arraySplit[2]);
            double employeePayRate = Double.parseDouble(arraySplit[3]);

            Employee employee = new Employee(employeeID, employeeName, employeeHours, employeePayRate);

            System.out.printf("Id %d, Name %-20s, GrossPay $%.2f: \n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());

        }
        bufReader.close();
    }
    catch(IOException e) {
        System.out.println("Couldn't read the file, please try again!");
        e.printStackTrace();
    }

}
}