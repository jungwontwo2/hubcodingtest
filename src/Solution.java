import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public String solution(List<Map<String, Integer>> arr) {

        Map<Integer, Integer> scoreMap = new HashMap<>();
        
        for (Map<String, Integer> item : arr) {
            int answer = item.get("answer");
            int score = item.get("score");
            scoreMap.put(answer, score);
        }
        int maxScore = Collections.max(scoreMap.values());

        List<String> winners = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : scoreMap.entrySet()) {
            if (entry.getValue() == maxScore) {
                if (entry.getKey() == 1) {
                    winners.add("a");
                } else if (entry.getKey() == 3) {
                    winners.add("b");
                } else if (entry.getKey() == 5) {
                    winners.add("c");
                }
            }
        }

        return winners.stream()
                .map(w -> w + " : " + maxScore)
                .collect(Collectors.joining(", "));
    }

}
