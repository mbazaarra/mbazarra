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

public class Patient {
	
	private String fName;
    private String mName;
    private String lName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String number;
    private String emName;
    private String emPhone;

    public Patient() {
    }

    public Patient(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    public Patient(String fName, String mName, String lName,
                   String address, String city, String state, String zip,
                   String number, String emName, String emPhone) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.number = number;
        this.emName = emName;
        this.emPhone = emPhone;
    }

   
    public String fullName() {
        return fName + " " + mName + " " + lName;
    }

    public String fullAddress() {
        return address + " " + city + " " + state + " " + zip;
    }

    public String fullEmContact() {
        return emName + " " + emPhone;
    }

    public String toString() {
        return " Name: " + fullName() + "\n" +
                " Address: " + fullAddress() + "\n" +
                " Phone Number: " + number + "\n" +
                " EmergencyContact: " + fullEmContact();
    }

}
