import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Email> emails = new ArrayList<>();

        emails.add(new Email(1, "Alvan", "abc", "abcd", LocalDate.now(), false));
        emails.add(new Email(2, "Alvin", "xyz", "testes", LocalDate.now().minusDays(2), true));
        emails.add(new Email(3, "Gibran", "wasd", "wasdwasdwa", LocalDate.now().minusWeeks(1), false));

        System.out.println("\n** All Emails:");
        Iterator<Email> iterator = emails.iterator();
        while (iterator.hasNext()) {
          Email email = iterator.next();
          email.display();
          System.out.println("------");
        }

        System.out.println("\n** Starred Emails:");
        for (Email email : emails) {
          if (email.isStarred()) {
           email.display();
           System.out.println("------");
          }
        }
    }
}
    