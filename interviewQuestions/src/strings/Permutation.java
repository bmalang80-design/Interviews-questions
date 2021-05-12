package strings;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        permutation("Bakary");

        list.forEach(e -> System.out.println(e));
    }
    private static  void permutation(String w){
        permutation(w, "");
    }
    private static void permutation(String w, String perfix){
        if (w.length() == 0){
          list.add(perfix);
        }else {
            for (int i = 0; i < w.length() ; i++) {
                String newW = w.substring(0, i) + w.substring(i + 1);
                permutation(newW, perfix + w.charAt(i));
            }
        }
    }
}
