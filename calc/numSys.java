package calc;

public class numSys {

    public static String base10_to_base16(int first) {
        return String.format("%X", first);
    }

    public static String base10_to_base8(int first) {
        return String.format("%o", first);
    }

    public static String base10_to_base2(int first) {
        return Integer.toBinaryString(first);
    }

    public static String which_base(String userChoice, int first) {
        switch (userChoice.toLowerCase()) {
            case "hex":
                return base10_to_base16(first);
            case "octal":
                return base10_to_base8(first);
            case "binary":
                return base10_to_base2(first);
            default:
                return "Invalid input. Please choose from: hex, octal, binary.";
        }
    }
}
