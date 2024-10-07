package coreJava;

public class ReverseOfSentence {
    public String reverseWordsInSentence(String sentence) {

        if(sentence==null){
            return "INVALID";
        }
        if(sentence.isEmpty()){
            return "";
        }


        StringBuilder reversedString=new StringBuilder();

        for( String word : sentence.split(" ")){
            StringBuilder reversedWord=new StringBuilder(word).reverse();
            reversedString.append(reversedWord).append(" ");

        }
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        ReverseOfSentence reverseOfSentence=new ReverseOfSentence();
        System.out.println(reverseOfSentence.reverseWordsInSentence("Hello World"));
        System.out.println(reverseOfSentence.reverseWordsInSentence("This is a test"));
        System.out.println(reverseOfSentence.reverseWordsInSentence("Java Programming"));
    }
}
