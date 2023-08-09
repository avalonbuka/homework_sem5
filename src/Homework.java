import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Homework {
    public static void main(String[] args) {
        String text = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. " +
        "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";
        Map<Integer, ArrayList<String>> counter = new HashMap<>();
        String[] wordList = text.split("[, ?.@]+");
        System.out.println(text.toLowerCase() );

        for (String s : wordList) {
            Integer key = s.length();
            if (counter.containsKey(key)) {
                counter.get(key).add(s);
            } else {
                ArrayList<String> al = new ArrayList<>();
                al.add(s);
                counter.put(key, al);
            }
        }

        for(Integer key : counter.keySet()) {
            System.out.printf("%s -> [%s] \n", key, String.join(", ", counter.get(key)));
        }
    }
}