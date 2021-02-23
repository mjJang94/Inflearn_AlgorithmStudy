import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {


    public static void main(String[] args) {

        String[] emails = {"test.email+james@coding.com",
                "test.e.mail+toto.jane@coding.com", "testemail+tom@cod.ing.com"};

        System.out.println(numUniqueEmails(emails));
    }

    private static int numUniqueEmails(String[] emails) {

        //1
        Set<String> set = new HashSet<>();

        //2
        for (String email : emails) {
            String localName = makeLocalName(email); // testemail
            String domainName = makeDomainName(email); // coding.com , cod.ing.com

            set.add(localName + "@" + domainName);
        }

        return set.size();
    }

    private static String makeLocalName(String email) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {

            //1
            if (email.charAt(i) == '.') {
                continue;
            }

            if (email.charAt(i) == '+') {
                break;
            }

            if (email.charAt(i) == '@'){
                break;
            }

            //2
            String str = String.valueOf(email.charAt(i));
            stringBuilder.append(str);
        }

        return stringBuilder.toString();
    }

    private static String makeDomainName(String email){

        return email.substring(email.indexOf('@') + 1);
    }
}
