import java.util.HashSet;
import java.util.Set;

//LeetCode 3120
public class CountTheNoOfSpecialCharactersI {
    public static void main(String[] args) {
        String s = "AbBCab";
        int result = count(s);
        System.out.println("the count is "+result);
    }

    private static int count(String s) {
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }
        int count = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            if(set.contains(i) && set.contains(Character.toUpperCase(i))){
                count++;
            }
        }
        return count;
    }

}
