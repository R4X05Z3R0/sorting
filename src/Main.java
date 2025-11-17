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

        for (String name: names){
            System.out.println(name);
        };
    }
}
