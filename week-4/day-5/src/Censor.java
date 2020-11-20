import java.sql.SQLOutput;

public class Censor {
    public static void main(String[] args){
        String text="A kedvenc gyümülcsöm a(z) alma";
        String originalWord="alma";
        String newWord="banán";
        //System.out.println(text.indexOf("alma"));
        System.out.println(text.substring(0,26).concat(newWord));




    }
}
