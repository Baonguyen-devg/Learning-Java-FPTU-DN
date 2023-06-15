/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import view.Validation;

/**
 *
 * @author Thanh
 */
public class Algorithm {

    Validation val = new Validation();

    // letter and character count
    public void countWordAndLetter() {
        String input = val.getLine("Enter your string: ");
        StringTokenizer tokenizer = new StringTokenizer(input);
        int letterCount = 0;

        Map<String, Integer> wordMap = new HashMap<>();
        Map<Character, Integer> letterMap = new HashMap<>();

        // count word and letter 
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            wordMap.put(token, wordMap.getOrDefault(token, 0) + 1);
            for (int i = 0; i < token.length(); i++) {
                char c = token.charAt(i);
                if (Character.isLetter(c)) {
                    letterCount++;
                    letterMap.put(c, letterMap.getOrDefault(c, 0) + 1);
                }
            }
        }
        //using the replace() and toString() methods to replace the default separator (", ") with a newline character and indent the output for each key-value pair.
        System.out.println(wordMap.toString().replace(", ", ", "));
        System.out.println(letterMap.toString().replace(", ", ", "));

    }

    // change base 16 10 2
    public int OtherToDec(String other, int base) {
        int result = 0;
        String HEX = "0123456789ABCDEF";
        other = other.toUpperCase();
        for (int i = 0; i < other.length(); i++) {
            result += HEX.indexOf(other.charAt(i)) * Math.pow(base, other.length() - 1 - i);
        }
        return result;
    }

    public String DecToOther(int Dec, int base) {
        String result = "";
        String HEX = "0123456789ABCDEF";
        while (Dec > 0) {
            result = HEX.charAt(Dec % base) + result;
            Dec /= base;
        }
        return result;
    }

    public void runConvert() {
        int choose = 1;
        while (choose == 1) {
            int inBase = val.getBase("Enter base input", "Base invalid");
            String value = val.getValue("Enter value input", "Value invalid", inBase);
            int outBase = val.getBase("Enter base output", "Base invalid");
            System.out.println("After change base: ");
            System.out.println("The output: ");
            if (inBase == 10) {
                System.out.println(DecToOther(inBase, outBase));

            } else {
                int dectmp = OtherToDec(value, inBase);
                System.out.println(DecToOther(dectmp, outBase));
            }
            System.out.println("======================================");

            choose = val.getInt("Continue ? (1/0)");
        }
    }

}
