import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Map<String, Integer>> list = new ArrayList<>();

        // 첫 번째 맵 생성 및 추가
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("answer", 1);
        map1.put("score", 5);
        list.add(map1);

        // 두 번째 맵 생성 및 추가
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("answer", 5);
        map2.put("score", 5);
        list.add(map2);

        // 세 번째 맵 생성 및 추가
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("answer", 2);
        map3.put("score", 4);
        list.add(map3);

        // 리스트 출력
        solution.solution(list);
    }
}