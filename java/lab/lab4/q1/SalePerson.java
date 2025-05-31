package q1;

public class SalePerson implements Comparable{
    
    private String firstName, lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }
    public String toString() {
        return firstName + ", " + lastName + " : " + String.valueOf(totalSales);
    }

    public int compareTo(Object o) {

        SalePerson otherPerson = (SalePerson)o;

        if (this.totalSales > otherPerson.getTotalSales())
            return 1;
        else if (this.totalSales < otherPerson.getTotalSales())
            return -1;

        return this.lastName.compareTo(otherPerson.getLastName());
    }
    
    public boolean equals(Object o) {
        SalePerson otherPerson = (SalePerson)o;
        return (this.firstName == otherPerson.getFirstName()) && (this.lastName == otherPerson.getLastName());
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getTotalSales() {return totalSales;}
}
