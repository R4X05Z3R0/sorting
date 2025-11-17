import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.text.Collator;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Zoe", "Asraf", "Mia",
                "Kevin", "Lina", "Alva",
                "Ahmed", "Muhammed", "Åge",
                "Øyvind", "Emil", "Sofie"
        ));

        Collator danishCollator = Collator.getInstance(Locale.forLanguageTag("da-DK"));


        Collections.sort(names, danishCollator);

//        for (String name: names){
//            System.out.println(name);
//        };

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Zoe", "Andersen"),
                new Student("Asraf", "Bakshi"),
                new Student("Mia", "Christensen"),
                new Student("Kevin","Dahl"),
                new Student("Lina","Eriksen"),
                new Student("Alva","Frederiksen"),
                new Student("Ahmed","Hansen"),
                new Student("Muhammed","Iversen"),
                new Student("Åge","Hansen"),
                new Student("Øyvind", "Johansen"),
                new Student("Emil", "Kristensen"),
                new Student("Sofie", "Larsen"),
                new Student("Åge", "Nielsen")
        ));

        Collections.sort(students);

        System.out.println("Last Name | First Name");
        for (Student student: students){
            System.out.println(student);
        }

    }
}
