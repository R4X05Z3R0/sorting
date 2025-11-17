public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public int compareTo(Student other){
        /*
        //Sort after lastname
        int lastNameComparison = this.lastName.compareTo(other.getLastName());

        if(lastNameComparison != 0 ){
            return lastNameComparison;
        }
        //If the lastname are equal, compare first names
        return this.firstName.compareTo(other.firstName);
        */
        return this.getFullname().compareTo(other.getFullname());
    }

    private String getFullname(){
        return getLastName() + ", " + getFirstName();
    }

    @Override
    public String toString() {
        return getLastName() + ", " + getFirstName();
    }
}
