package codigos;

public class SwitchEx {
    public static void main(String[] args) {
        int number = 4;

        String numberString = "";

        switch ( number ) {
            case 1: 
            numberString = "One";
            break;
            case 2: 
            numberString = "Two";
            break;
            case 3: 
            numberString = "Three";
            break;
            case 4: 
            numberString = "Four";
            break;

            default: 
            numberString = "Number not suported";
        }

        System.out.println( numberString );
    }
}
