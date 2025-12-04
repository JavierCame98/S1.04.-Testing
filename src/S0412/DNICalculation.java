package S0412;

public class DNICalculation {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char letterCalculation(int DNINumber){

        if(DNINumber < 0 || DNINumber > 99999999){
            throw new IllegalArgumentException("The DNI number is out of range");
        }
        int indexDNI = DNINumber % 23;
        return LETTERS.charAt(indexDNI);
    }


}
