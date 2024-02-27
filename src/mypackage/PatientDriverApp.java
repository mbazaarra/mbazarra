/* 

 * Class: CMSC203

 * Instructor: Grigoriy A. Grinberg

 * Assignment 2

 * Description: using OOP 

 * Due: 02/26/2024 

 * Platform/compiler: cmd, eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Montana Bazarragchaa
*/ 
package mypackage;

public class PatientDriverApp {
	public static void main(String[] args) {

        Patient patient = new Patient("Munkh", "Orgil", "Ibrai",
                "4r Khoroo", "Baynzurkh", "UB", "22222",
                "99196900", "Nurbol Irmuun", "99150805");

        Procedure procedure1 = new Procedure("Physical Exam", "07/20/2019", "Dr. Irvine", 3250.0 );
        Procedure procedure2 = new Procedure("X-ray", "07/20/2019", "Dr. Jamison", 5500.43);
        Procedure procedure3 = new Procedure("Blood Test", "07/20/2019", "Dr. Smith", 1400.75);

        displayPatient(patient);

        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        double total = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("Total Charges: $" + String.format("%.2f", total));
        System.out.println("\n" + "Student Name: Montana Bazarragchaa");
        System.out.println("MC#: M21160416");
        System.out.println("Due Date: 02/26/2024");
    }

    public static void displayPatient(Patient patient) {
        System.out.println("Patient Info:\n" + patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println("\n"+" 	Procedure Info:\n" + procedure);
    }

    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
    	return procedure1.getProCharges() + procedure2.getProCharges() + procedure3.getProCharges();
    }
    
}
