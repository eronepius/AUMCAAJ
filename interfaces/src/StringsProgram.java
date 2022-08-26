public class StringsProgram {

    public static void main(String args[]) {

        String first = "Java";
        String second = "Scala";
        String third = "JavaScript";

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        String greet = "Hello! World";
        System.out.println("String: " + greet);

        int length = greet.length();
        System.out.println("Length: " + length);

        first = "Java ";
        System.out.println("First String: " + first);

        // create second
        second = "Programming";
        System.out.println("Second String: " + second);

        // join two strings
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);

        first = "java programming";
        second = "java programming";
        third = "python programming";

        // compare first and second strings
        boolean result1 = first.equals(second);
        System.out.println("Strings first and second are equal: " + result1);

        // compare first and third strings
        boolean result2 = first.equals(third);
        System.out.println("Strings first and third are equal: " + result2);

        String name = new String("Created using new keywork in Java");
        System.out.println(name);

        System.out.println("CompareWithIgnoreCases : " + first.compareTo("java"));
        System.out.println("Uppercase : " + name.toUpperCase());
        System.out.println("Lowercase : " + name.toLowerCase());
        System.out.println("CharAt : " + name.charAt(10));
        System.out.println(name.substring(10));

    }
}
