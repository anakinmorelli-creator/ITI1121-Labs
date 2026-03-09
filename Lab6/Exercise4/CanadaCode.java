public class CanadaCode extends PostalCode {

    public CanadaCode( String code ) {
        super( code );
    }

    public boolean isValid() {

        String myCode = getCode();
        if (myCode.length() != 7) return false;

        return Character.isLetter(myCode.charAt(0)) &&
                Character.isDigit(myCode.charAt(1)) &&
                Character.isLetter(myCode.charAt(2)) &&
                Character.isWhitespace(myCode.charAt(3)) &&
                Character.isDigit(myCode.charAt(4)) &&
                Character.isLetter(myCode.charAt(5)) &&
                Character.isDigit(myCode.charAt(6));
    }

}
