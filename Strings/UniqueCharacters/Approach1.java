package Strings.UniqueCharacters;

import java.util.*;

// sorting based approach
public class Approach1 {

    public static boolean UniqueCharacters(String str) {

        char[] charArray = str.toCharArray();

        // sorted array using binary sort java this method uses internally binary sort
        // time copmlexity for sorting is o(nlogn) how?
        Arrays.sort(charArray);

        // now check adjancent elements
        for (int i = 0; i < charArray.length-1; i++) {
                if(charArray[i]==charArray[i+1]){
                    // true means repeated
                    return true;
                }
        }
        // true means not repeated
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

// time complexity is :: o(nlogn+n) which is o(nlogn)