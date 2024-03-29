/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

 import java.lang.*;
 import java.util.*;

public class ProblemSet5 {

    public static void main(String[] args) {

    }
    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {

        if(in == null || out == null){
            return in;
        }else if(out.length() != 4){
            return in;
        }

        String startString = out.substring(0,2);
        String endString = out.substring(out.length()-2,out.length());

        String combinedString = startString + in + endString;

        return combinedString;

    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
        if(text == null || (text.length() < 1 || text.length() > 10) || (n < 1 || n > text.length())){
            return text;
        }

        String firstLetters = text.substring(0, n);
        String lastLetters = text.substring(text.length()-n, text.length());
        String combinedLetters = firstLetters + lastLetters;

        return combinedLetters;

    }

    // /*
    //  * Exercise 3.
    //  *
    //  * Given a string, return a new string using the middle three characters of text.
    //  */

    public String middleMan(String text) {
        if(text == null || (text.length()%2 == 0) || (text.length() < 3)){
            return text;
        }

        int middleIndex = text.length()/2;

        String middleString = text.substring(middleIndex-1, middleIndex+2);

        return middleString;
    }

    // /*
    //  * Exercise 4.
    //  *
    //  * Given two strings, determine whether or not target is equivalent to the middle
    //  * three characters of text.
    //  */

    public boolean isCentered(String text, String target) {

        if(text == null || (text.length()%2==0) || (text.length() < 3) || target == null || (target.length() != 3)){
            return false;
        }

        String middleText = middleMan(text);
        if(target.equals(middleText)){
            return true;
        }else{
            return false;
        }

    }

    // /*
    //  * Exercise 5.
    //  *
    //  * Given a string and a character, compute the number of words that end in suffix.
    //  */

    public int countMe(String text, char suffix) {

        if(text == null || !(Character.isLetter(suffix))){
            return -1;
        }

        int suffixCount = 0;

        String[] stringArray = text.split(" ");

        for(int i = 0; i < stringArray.length; i++){
            String workingString = stringArray[i].substring((stringArray[i].length()-1), (stringArray[i].length()));
            if(workingString.charAt(workingString.length()-1) == suffix){
                suffixCount++;
            }
        }

        return suffixCount;
    }

    // /*
    //  * Exercise 6.
    //  *
    //  * Given a string, compute the number of triplets in text.
    //  */
    //
    public int triplets(String text) {
        if(text == null || text.equals(null)){
            return -1;
        }else if(text.length() == 3){
            if(text.substring(0,1) == text.substring(1,2) && text.substring(1,2) == text.substring(1,3)){
                return 1;
            }else{
                return 0;
            }
        }
        int tripletCount = 0;
        for(int i = 1; i < text.length(); i++){
            String tripletLetter = text.substring(i,i+1);
            if(text.length() > i+1){
                if((text.substring(i-1,i).equals(tripletLetter))
                && (text.substring(i,i+1).equals(tripletLetter))
                && (text.substring(i+1,i+2).equals(tripletLetter))){
                    tripletCount++;
                }
            }
        }
        return tripletCount;
    }
    //
    // /*
    //  * Exercise 7.
    //  *
    //  * Given a string, compute the sum of the digits in text.
    //  */
    //
    public long addMe(String text) {
        int addMeSum = 0;
        if(text == null || text.equals(null)){
            return -1;
        }
        for(int j = 0; j < text.length(); j++){
            if(Character.isDigit(text.charAt(j))){
                addMeSum += Integer.valueOf(text.substring(j,j+1));
            }
        }
        return addMeSum;
    }
    //
    // /*
    //  * Exercise 8.
    //  *
    //  * Given a string, compute the length of the longest sequence.
    //  */
    //
    public long sequence(String text) {
        if(text == null || text.equals(null)){
            return -1;
        }else if(text.length() == 0){
            return 0;
        }
        String[] textArray = text.split("");
        int longestSeries = -1;
        String workingString = "";
        for(int i = text.length()-1; i > -1; i--){
            for(int j = text.length(); j > 0; j--){
            workingString += textArray[i];
            if(text.indexOf(workingString) > 0 && workingString.length() > longestSeries){
                longestSeries = workingString.length();
            }
            }
            workingString = "";
        }
        return longestSeries;
    }
    //
    // /*
    //  * Exercise 9.
    //  *
    //  * Given two strings, return a new string built by intertwining each of the
    //  * characters of a and b.
    //  */
    //
    public String intertwine(String a, String b) {
        if(a == null || a.equals(null)){
            return null;
        }else if(b == null || b.equals(null)){
            return null;
        }
        if(a == "" || a.equals("")){
            return b;
        }else if(b == "" || b.equals("")){
            return a;
        }

        int aNumberCount = 0;
        int bNumberCount = 0;

        String[] aArray = a.split("");
        String[] bArray = b.split("");
        String[] abArray = new String[(aArray.length + bArray.length)];

        for(int i = 0; i < abArray.length; i++){
            if(aNumberCount == (a.length())){
                abArray[i] = b.substring(bNumberCount);
                break;
            }else if(bNumberCount == (b.length())){
                abArray[i] = a.substring(aNumberCount);
                break;
            }
            if(i%2 == 0 && aArray[aNumberCount] != null){
                abArray[i] = aArray[aNumberCount];
                aNumberCount++;
            }else if(i%2 != 0 && bArray[bNumberCount] != null){
                abArray[i] = bArray[bNumberCount];
                bNumberCount++;
            }
        }
        for(int z = 0; z < abArray.length; z++){
            if(abArray[z] == null){
                abArray[z] = "";
            }
        }

        return String.join("",abArray);

    }
    //
    // /*
    //  * Exercise 10.
    //  *
    //  * Given a string, determine whether or not it is a palindrome.
    //  */
    //
    public boolean isPalindrome(String text) {
        if(text == null || text.equals(null)){
            return false;
        }
        String[] textArray = text.split("");
        int palindromeCount = 0;
        String text1 = "";
        String text2 = "";
        for(int j = text.length()-1; j > -1; j--){
                text1 = textArray[j];
                text2 = textArray[((text.length()-1)-j)];
                if(text1.equals(text2)){
                    palindromeCount++;
                }
            }
        if(palindromeCount == (text.length())){
            return true;
        }else{
            return false;
        }
    }
}
