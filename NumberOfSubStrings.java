public class NumberOfSubStrings {

    public int numberOfSubstrings(String s) {
        int left = 0, right = 0, n = s.length();
        int[] count = new int[3];
        int answer = 0;
        while(right<n){
            count[s.charAt(right)-'a']++;
            while(count[0]>0 && count[1]>0 && count[2]>0){
                answer += (n-right);
                count[s.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return answer;
    }

}


