package test;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress_Test {


    public static void main(String[] args) {

        String[] emails = {"test.email+james@coding.com",
                "test.e.mail+toto.jane@coding.com", "testemail+tom@cod.ing.com"};

        System.out.println(numUniqueEmails(emails));
    }

    private static int numUniqueEmails(String[] emails) {

        //1
        Set<String> set = new HashSet<>();

        //2
        for (String email: emails){
            String localName = LocalName(email);
            String domainName = DomainName(email);

            set.add(localName + "@" + domainName);
        }

        return set.size();
    }

    private static String LocalName(String email){

        //1
        StringBuilder stringBuilder = new StringBuilder();

        //2
        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '.'){
                continue;
            }

            if (email.charAt(i) == '+' || email.charAt(i) == '@'){
                break;
            }

            stringBuilder.append(email.charAt(i));
        }

        return stringBuilder.toString();
    }

    private static String DomainName(String email){
        return email.substring(email.indexOf('@') + 1);
    }
}
