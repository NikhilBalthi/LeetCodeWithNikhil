import java.util.ArrayList;
import java.util.List;

public class P031_SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> result = new ArrayList<>();
        String digits = "123456789";

        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        for(int length = lowLen; length <= highLen ; length++){
            for(int i = 0; i<= digits.length()-length; i++ ){
                String s = digits.substring(i, i+length);
                int num = Integer.parseInt(s);

                if(num>=low && num<=high)
                    result.add(num);
            }
        }
        return result;
    }
}
