public class P027_ConcatenateNonZeroDigitsAndMulitplyBySumI {

    public long sumAndMultiply(int n) {

        if(n==0) return 0;
        String s = String.valueOf(n);

        int[] reverse = new int[s.length()];


        int reverseIndex = s.length()-1,temp = n;
        while(temp!=0){
            reverse[reverseIndex] = temp%10;
            reverseIndex--;
            temp=temp/10;
        }
        int sum = 0;
        String res = "";
        for(int num : reverse){
            if(num!=0)
                res += (char)(num+'0');

            sum+=num;

        }
        return (long)sum * Long.parseLong(res);
    }

}
