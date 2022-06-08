package Strings.UniqueCharacters;

import java.lang.reflect.Array;
import java.util.*;

// ascii based approach
// ascii represents 7 bits
// 2^7 = 128 unique character array needed
public class Approach2 {

    public static boolean UniqueCharacters(String str) {
        int MAX_CHAR = 128;
        if(str.length()>128){
            return false;
        }

        // hash kind of array
        boolean[] chars = new boolean[MAX_CHAR];

        // fill false by default in 128 length boolean array
        Arrays.fill(chars, false);
        for (int i = 0; i < str.length(); i++) {
            // get character ascii number and check its value from boolean array
            // if already true present then its repeated otherwise not repeated

            int index = (int)str.charAt(i);
                if(chars[index]){
                    return true;
                }
            chars[index] = true;
        }
        return false;
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
// time complexity is :: o(n) + o(1) which is o(n)