import java.text.Collator;
import java.util.Locale;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;

    private static Collator danishCollator = Collator.getInstance(Locale.forLanguageTag("da-DK"));
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

        //Sort after lastname using the Collator first
        int lastNameComparison = danishCollator.compare(this.lastName, other.getLastName());

        if(lastNameComparison != 0 ){
            return lastNameComparison;
        }
        //If the lastname are equal, compare first names
        return danishCollator.compare(this.getFirstName(), other.getFirstName());

    //    return this.getFullname().compareTo(other.getFullname());
    }

    private String getFullname(){
        return getLastName() + ", " + getFirstName();
    }

    @Override
    public String toString() {
        return getLastName() + ", " + getFirstName();
    }
}
