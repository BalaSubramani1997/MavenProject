import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.next();
        HashMap<Character, Integer> CharCountMap = new HashMap<>();
        char[] chArray = input.toCharArray();
        for (char c : chArray) {
            if (CharCountMap.containsKey(c)) {
                CharCountMap.put(c, CharCountMap.get(c) + 1);
            } else {
                CharCountMap.put(c, 1);
            }
        }
        System.out.println("Final char count :" + CharCountMap);
        int maxi = 0;
        char ch ='a';
        for (Map.Entry<Character, Integer> pair : CharCountMap.entrySet()) {
            int val = pair.getValue();
            if (val > maxi) {
                maxi = val;
                ch = pair.getKey();
            }
        }
        System.out.println("Max occurence letter : "+ch+" ->  "+maxi+" times");

    }
}
