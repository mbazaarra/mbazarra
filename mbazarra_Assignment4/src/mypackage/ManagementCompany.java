/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: using arrays
 * Due: 04/01/24
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Montana Bazarragchaa
*/

package mypackage;

public class ManagementCompany {
    private String name;
    private String taxId;
    private double mgmFeePer;
    static final int MAX_PROPERTY = 5;
    private static final int MGMT_WIDTH = 10;
    private static final int MGMT_DEPTH = 10;
    private Property[] properties;
    private Plot plot;
    private int numberOfProperties;

    public ManagementCompany(String name, String taxId, double mgmFeePer) {
        this.name = name;
        this.taxId = taxId;
        this.mgmFeePer = mgmFeePer;
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
        this.numberOfProperties = 0;
    }

    public int addProperty(Property property) {
        if (numberOfProperties >= MAX_PROPERTY) {
            return -1;
        }
        if (property == null) {
            return -2;
        }
        if (!plot.encompasses(property.getPlot())) {
            return -3;
        }
        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i].getPlot().overlaps(property.getPlot())) {
                return -4;
            }
        }
        properties[numberOfProperties] = property;
        numberOfProperties++;
        return numberOfProperties - 1;
    }

    public double getTotalRent() {
        double totalRent = 0.0;
        for (int i = 0; i < numberOfProperties; i++) {
            totalRent += properties[i].getRentAmount();
        }
        return totalRent;
    }

    private int maxRentPropertyIndex() {
        if (numberOfProperties == 0) {
            return -1;
        }
        int maxIndex = 0;
        double maxRent = properties[0].getRentAmount();
        for (int i = 1; i < numberOfProperties; i++) {
            if (properties[i].getRentAmount() > maxRent) {
                maxIndex = i;
                maxRent = properties[i].getRentAmount();
            }
        }
        return maxIndex;
    }
    public Property[] getProperties() {
        return properties;
    }

    public void removeLastProperty() {
        if (numberOfProperties > 0) {
            properties[--numberOfProperties] = null;
        }
    }

    public boolean isPropertiesFull() {
        return numberOfProperties >= MAX_PROPERTY;
    }

    public int getPropertiesCount() {
        return numberOfProperties;
    }

    public boolean isMangementFeeValid(double mgmFeePer) {
        return mgmFeePer >= 0 && mgmFeePer <= 100;
    }
    
    public Property getHighestRentProperty() {
        int index = maxRentPropertyIndex();
        if (index == -1) {
            return null;
        }
        return properties[index];
    }
    

    
    public String getName() {
        return name;
    }

    public Plot getPlot() {
        return plot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("List of the properties for ").append(name).append(", taxID: ").append(taxId).append("\n")
                .append("______________________________________________________\n");
        for (int i = 0; i < numberOfProperties; i++) {
            sb.append(properties[i].toString()).append("\n");
        }
        sb.append("______________________________________________________\n\n");
        sb.append(" total management Fee: ").append(String.format("%.2f", getTotalRent() * (mgmFeePer / 100.0)));
        return sb.toString();
    }


}
