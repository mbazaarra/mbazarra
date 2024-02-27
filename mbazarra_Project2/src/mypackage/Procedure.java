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

public class Procedure {
	private String proName;
    private String proDate;
    private String pracName;
    private double proCharge;

    public double getProCharges() {
        return proCharge;
    }

    public Procedure(String proName, String proDate, String pracName, double proCharge) {
        this.proName = proName;
        this.proDate = proDate;
        this.pracName = pracName;
        this.proCharge = proCharge;
    }

    public String toString() {
        return  " 	Procedure: " + proName + "\n" +
                " 	ProcedureDate=" + proDate + "\n" +
                " 	Practitioner=" + pracName + "\n" +
                " 	Charges=" + String.format("%.2f", proCharge)+"\n";
    }
}

