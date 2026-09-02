public class StringOperationsSimple {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenation: " + concat);

        // Length
        System.out.println("Length of str1: " + str1.length());

        // Character at position
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // Substring
        System.out.println("Substring of str2 (0,3): " + str2.substring(0, 3));

        // Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));

        // Convert to uppercase/lowercase
        System.out.println("Uppercase str1: " + str1.toUpperCase());
        System.out.println("Lowercase str2: " + str2.toLowerCase());

        // Replace characters
        System.out.println("Replace 'l' with 'x' in str1: " + str1.replace('l', 'x'));

        // Trim spaces
        String str3 = "   Java   ";
        System.out.println("Trimmed str3: '" + str3.trim() + "'");
    }
}
