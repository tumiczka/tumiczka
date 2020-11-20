import java.util.Arrays;

public class GrammarCheck {
    public static void main(String[] args) {
        String text = "Ez egy példa mondat. Lehet, hogy jó lesz.";
        String[] text2 = text.split("\\.");
        System.out.println(Arrays.toString(text2));
        String textUpperCase = text.toUpperCase();
        System.out.println(textUpperCase);
        String[] text3 = textUpperCase.split("\\.");
        System.out.println(Arrays.toString(text3));
        System.out.println(text2[1]);
        if(text2[1]==text3[1])
                System.out.println(true);
            else
                System.out.println(false);



    }


}

