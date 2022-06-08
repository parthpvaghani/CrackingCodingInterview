package Strings.UniqueCharacters;
import java.util.*;

// ascii based approach
// ascii represents 7 bits
// 2^7 = 128 unique character array needed
public class Approach3 {

    public static boolean UniqueCharacters(String str) {
        HashSet<Character> char_set = new HashSet<>();
        for(int c  = 0; c< str.length();c++)
        {
            char_set.add(str.charAt(c));
        }
        if (char_set.size() == str.length()) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter String to Check it's unique characters");
        String str = sc.next();
        // now it's time to check its uniqueness
        boolean result =  UniqueCharacters(str);
        if(result){
            System.out.println("found repeated characters in string");
        } else {
            System.out.println(" did not find any repeated chars in given string");
        }
        sc.close();
    }
}
// time complexity is :: o(n)