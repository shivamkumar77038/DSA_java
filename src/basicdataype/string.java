package basicdataype;

public class string {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("Hello World");

        // Use a for-each loop to iterate through the String
        for ( char ch : sb.toString().toCharArray()) {
            System.out.println(ch);  // Print each character
        }


    }
}