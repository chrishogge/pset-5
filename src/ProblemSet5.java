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

public class ProblemSet5 {

    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();

        System.out.println(ps.surroundMe("h","1234"));
        System.out.println(ps.endsMeet("Christoph",3));
        System.out.println(ps.middleMan("abcdefghi"));
        System.out.println(ps.isCentered("abcdefghi", "def"));
        System.out.println(ps.countMe("abc abc ccc def ghi jkl", 'c'));
        System.out.println(ps.triplets("DT6syyyUuubVKV25Ty9FYYYRq6"));
        System.out.println(ps.addMe("1fawasad9as"));

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
        int tripletCount = 0;
        for(int i = 1; i < text.length(); i++){
            String tripletLetter = text.substring(i,i+1);
            if((text.substring(i-1,i).equals(tripletLetter)) && (text.substring(i,i+1).equals(tripletLetter)) && (text.substring(i+1,i+2).equals(tripletLetter))){
                tripletCount++;
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
        String[] textArray = text.split(" ");
        int longestWord =
        for(int k = 0; k < textArray.length; k++){

        }
    }
    //
    // /*
    //  * Exercise 9.
    //  *
    //  * Given two strings, return a new string built by intertwining each of the
    //  * characters of a and b.
    //  */
    //
    // public String intertwine(String a, String b) {
    //
    // }
    //
    // /*
    //  * Exercise 10.
    //  *
    //  * Given a string, determine whether or not it is a palindrome.
    //  */
    //
    // public boolean isPalindrome(String text) {
    //
    // }
}
