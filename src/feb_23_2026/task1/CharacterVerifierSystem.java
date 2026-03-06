package feb_23_2026.task1;

public class CharacterVerifierSystem {

    public static void analyzeCharacter(char ch) {

        if (Character.isDigit(ch)) {
            System.out.println(ch + " belongs to the Digit category.");
        }

        else if (Character.isLetter(ch)) {

            System.out.println(ch + " belongs to the Alphabet category.");

            if (Character.isUpperCase(ch)) {
                System.out.println("The character is in UPPERCASE form.");
            } 
            else {
                System.out.println("The character is in lowercase form.");
            }

            char converted = Character.toLowerCase(ch);

            if ("aeiou".indexOf(converted) != -1) {
                System.out.println("This alphabet is a Vowel.");
            } 
            else {
                System.out.println("This alphabet is a Consonant.");
            }
        }

        else {
            System.out.println(ch + " is classified as a Special Symbol.");
        }
    }

    public static void verifyChar(char userInput) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verifyChar'");
    }
}