import java.util.*;

/**
 * Created by kanov on 1/25/2017.
 */
public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();
        LinkedHashSet<String> search = new LinkedHashSet<>();
        String input = "";
        while (!"search".equals(input = scanner.nextLine())) {
            String[] inputString = input.split("-");
            phonebook.put(inputString[0], inputString[1]);
        }
        while (!"stop".equals(input = scanner.nextLine())) {
            search.add(input);
        }

        for (String name : search) {
            if (phonebook.containsKey(name)) {
                System.out.printf("%s -> %s\n", name, phonebook.get(name));
            } else {
                System.out.printf("Contact %s does not exist.\n",name);
            }
        }
    }
}
