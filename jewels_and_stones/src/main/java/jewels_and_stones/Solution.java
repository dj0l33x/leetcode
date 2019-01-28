package jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < J.length(); i++)
            characters.add(J.charAt(i));
        int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            if (characters.contains(S.charAt(i)))
                counter++;
        }
        return counter;
    }
}