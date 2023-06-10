import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

// Input: s = "Hello World"

// Output: 5

// Explanation: The last word is "World" with length 5.

import java.util.*;
public class test6 {
    public static void main(String[] args) {
        String s = "Hello World";
        s=s.trim();
        int count=0;

        for(int i=s.length()-1; i>=0; i--){
            
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }
        System.out.println(count);

    }
}
