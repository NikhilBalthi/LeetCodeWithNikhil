public class P027_RemoveStarsFromAString {

    public String removeStars(String s) {
        // StringBuilder acts like a stack to build the final string efficiently
        StringBuilder sb = new StringBuilder();

        // Convert the input string into a character array and iterate through it
        for (char c : s.toCharArray()) {
            if (c != '*') {
                // If it is a normal letter, add it to the end of the builder
                sb.append(c);
            } else {
                // If it is a star, delete the most recently added letter (the last element)
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        // Convert the accumulated characters back into a standard String
        return sb.toString();
    }
}
