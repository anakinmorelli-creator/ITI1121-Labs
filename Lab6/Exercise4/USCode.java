public class USCode extends PostalCode {

    public USCode( String code ) {
        super( code );
    }

    public boolean isValid() {

        String myCode = getCode();
        if (myCode.length() != 8) return false;

        return Character.isLetter(myCode.charAt(0)) &&
                Character.isLetter(myCode.charAt(1)) &&
                Character.isWhitespace(myCode.charAt(2)) &&
                Character.isDigit(myCode.charAt(3)) &&
                Character.isDigit(myCode.charAt(4)) &&
                Character.isDigit(myCode.charAt(5)) &&
                Character.isDigit(myCode.charAt(6)) &&
                Character.isDigit(myCode.charAt(7));
    }
}
