package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ValidPalindrome {
    public static void main(String[] args) {
        //String s = " A man, a plan, a canal: Panamad ";
        String s = "0P";
        System.out.println("the result is "+validPalindrome(s));
    }

    private static boolean validPalindrome(String s) {
        List<Character> chars = new ArrayList<>();
        for(char c : s.toCharArray())
            if(Character.isAlphabetic(c) || Character.isDigit(c)) chars.add(c);

        int l = 0;
        int r = chars.size()-1;

        while(l<r){
            if( chars.get(l) != chars.get(r)) return false;
        }
        return true;
    }
}
