package Searching.Basic;

//Search for a character in a String

public class ex5 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char ch = 'o';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                 System.out.println("Character '" + ch + "' found in the index " + i +  " of " +count+ "times in the string.");
            } 
        }

    }
    
}
