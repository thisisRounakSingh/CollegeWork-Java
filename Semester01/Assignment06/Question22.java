import java.util.Scanner;

public class Question22 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.printf(
                "Length of the string: %d%nFirst Character: '%c'%nLast Character: '%c'%nString in uppercase: \"%s\"%nString in lowercase: \"%s\"%nDoes the string contain \"Java\"? %b%nDoes the string start with \"Hello\"? %b%nDoes the string end with \"World\"?%b%nTrimmed string: \"%s\"%nString after replacing 'a' with '@': \"%s\"%nSubstring from 2 to 7: \"%s\"%n",
                str.length(), str.charAt(0), str.charAt(str.length() - 1), str.toUpperCase(), str.toLowerCase(),
                str.contains("Java"), str.startsWith("Hello"), str.endsWith("World"), str.trim(), str.replace('a', '@'),
                str.substring(2, 7));
        input.close();
    }
}
