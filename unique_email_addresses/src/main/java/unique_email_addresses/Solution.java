package unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        int counter = 0;
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] split = email.split("@");
            String cleanLocalName = localNameCleanup(split[0]);
            if (set.add(cleanLocalName + "@" + split[1]))
                counter++;
        }
        return counter;
    }

    private String localNameCleanup(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.') continue;
            if (c == '+') break;
            sb.append(c);
        }
        return sb.toString();
    }
}