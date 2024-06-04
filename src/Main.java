import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Map<String, Integer>> list = new ArrayList<>();
        list.add(new HashMap<>() {{ put("answer", 1); put("score", 5); }});
        list.add(new HashMap<>() {{ put("answer", 3); put("score", 3); }});
        list.add(new HashMap<>() {{ put("answer", 2); put("score", 4); }});
        String answer = solution.solution(list);
        System.out.println("answer = " + answer);

        List<Map<String, Integer>> list2 = new ArrayList<>();
        list2.add(new HashMap<>() {{ put("answer", 1); put("score", 5); }});
        list2.add(new HashMap<>() {{ put("answer", 5); put("score", 5); }});
        list2.add(new HashMap<>() {{ put("answer", 2); put("score", 4); }});
        String answer2 = solution.solution(list2);
        System.out.println("answer2 = " + answer2);
    }
}