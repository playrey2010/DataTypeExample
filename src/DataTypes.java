public class DataTypes {
    public static void main(String[] args){
        // just declaring a boolean variable, no value
        boolean isRaining;
        // declaring and initializing (giving it a value)
        boolean isSunny = false;
        // byte is quite limited, mostly for debugging purposes
        byte b = 0;

        int myNumber = 239;

        double myDoubleVariable = 0.5;

        char singleCharacter = 'y';

        String myFirstName = "Rey";

        String myLastName = "Aponte";



        System.out.println("First value of singleCharacter: " + singleCharacter);

        singleCharacter = 'a';

        System.out.println("Second value of singleCharacter: " + singleCharacter);

        System.out.println("Is it sunny? " + isSunny);

        System.out.println("My number variable plus 1 is : " + (myNumber + 1));

        System.out.println("My first name is " + myFirstName);

        System.out.println("My full name is " + myFirstName + " " +  myLastName);

        System.out.println("My double is " + myDoubleVariable);

    }
}
