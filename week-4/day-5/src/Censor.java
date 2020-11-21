import java.sql.SQLOutput;

public class Censor {
    public static void main(String[] args){
        String text="A kedvenc gyümülcsöm a(z) alma";
        String originalWord="alma";
        String newWord="banán";
        System.out.println(censor(text, originalWord, newWord));
    }
    public static String censor(String text, String originalWord, String newWord){
        String[] words=text.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (String word:words) {
            if(word.equals(originalWord)){
                stringBuilder.append(newWord).append(".");
            }else{
                stringBuilder.append(word).append(".");
            }
            
        }
        return stringBuilder.toString().trim();
    }
}
