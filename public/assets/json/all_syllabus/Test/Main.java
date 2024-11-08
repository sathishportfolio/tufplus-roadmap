class Solution {
    public int lengthAfterTransformations(String s, int t) {

        String currString = s;

        int n = t;

        for (int t1 = 1; t1 <= 100; t1++) {
            String temp = "";
            for (int i = 0; i < currString.length(); i++) {
                if (currString.charAt(i) == 'z') {
                    temp = temp + "ab";
                } else {
                    temp = temp + (char) (currString.charAt(i) + 1);
                }
            }
            currString = temp;
            System.out.println("\n" + currString);
        }

        return currString.length();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int cnt = solution.lengthAfterTransformations("jqktcurgdvlibczdsvnsg", 7517);
        System.out.println("lengthAfterTransformations is: " + cnt);
    }
}
