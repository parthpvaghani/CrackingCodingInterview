package Strings.UniqueCharacters;

import java.util.*;

// sorting based approach
public class Approach1 {
    
    public static boolean UniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    return true;
                }
            }
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
