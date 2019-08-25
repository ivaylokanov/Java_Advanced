import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by kanov on 1/26/2017.
 */
public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> contacts = new LinkedHashMap<>();
        String name = "";
        String email = "";
        while (!"stop".equals(name = scanner.nextLine())) {
            email = scanner.nextLine();
            if (!(email.substring(email.lastIndexOf('.')+1).equals("us") || email.substring(email.lastIndexOf('.')+1).equals("uk") ||
                    email.substring(email.lastIndexOf('.')+1).equals("com"))) {

                contacts.put(name, email);
            }
        }
        System.out.println(contacts.keySet().iterator().next());
        for (String s : contacts.keySet()) {
            System.out.printf("%s -> %s\n",s,contacts.get(s));
        }
    }
}
