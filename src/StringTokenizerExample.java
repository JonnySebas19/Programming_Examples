import java.util.StringTokenizer;
public class StringTokenizerExample {
    public static void main(String[] args){
        String sentence = "A single word can be critical.";
        StringTokenizer wordFactory = new StringTokenizer(sentence);

        while(wordFactory.hasMoreTokens()){
            System.out.println(wordFactory.nextToken());
        }
    }
}
