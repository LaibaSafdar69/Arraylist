import java.util.ArrayList;
import java.util.HashSet;
public class Main2 {

    public static void main(String[] args) {
        String Text="The Ideology of Pakistan finely describes the religious and political foundations of the Pakistani nation. It is an Islamic Ideology that defines the identity, ideology, and destiny of the Muslim Ummah. The Ideology of Pakistan is deeply rooted in Islam, which lays down the code of life for Muslims."+
                "The Ideology of Pakistan guarantees equality, justice, and human dignity for all citizens regardless of their caste, creed, or religion. It envisages a just society where everyone will have equal rights and opportunities.";
        ArrayList<String> sentence=new ArrayList<>();


        String t[]=Text.split(" ");
        System.out.println("Total characters:"+Text.length());
        for(String temp:t) {
            sentence.add(temp);
            System.out.println(temp);
        }
        char charArray[]=Text.toCharArray();
        HashSet<String>set=new HashSet<>();
        set.addAll(sentence);
        System.out.println("Unique words:"+set.size());
        System.out.println(sentence.indexOf("dignity"));
        System.out.println("Total Words:"+sentence.size());
        String t2[]=Text.split("\\.");
        System.out.println("Total Sentences:"+t2.length);

        ArrayList<T> wordfrequency=new ArrayList<>();

        for(String temp:t) {
            if(wordfrequency.contains(new T(temp,0))) {
                int index = wordfrequency.indexOf(new T(temp, 0));
                wordfrequency.get(index).setN(wordfrequency.get(index).getN() + 1);
                System.out.println(index);
            }
            else
                wordfrequency.add(new T(temp,1));

        }
    }



}


