import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NewspaperSolution {
    public static void main(String[] args) {
        ArrayList<HashMap<String, Float>> newsPaperList = new ArrayList<HashMap<String, Float>>();
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Float> map = new HashMap<>();
        map.put("TOI", 26F);
        newsPaperList.add(0, map);
        map = new HashMap<>();
        map.put("ET", 34F);
        newsPaperList.add(1, map);
        map = new HashMap<>();
        map.put("Hindu", 20.5F);
        newsPaperList.add(2, map);
        map = new HashMap<>();
        map.put("BM", 10.5F);
        newsPaperList.add(3, map);
        map = new HashMap<>();
        map.put("HT", 18F);
        newsPaperList.add(4, map);
        int maxBudget;
        System.out.println(newsPaperList);
        maxBudget = scanner.nextInt();
        for (int i = 0; i < newsPaperList.size() - 1; i++) {
            for (int j = i + 1; j <= newsPaperList.size() - 1; j++) {
                for (Float f1 : newsPaperList.get(i).values()) {
                    for (Float f2 : newsPaperList.get(j).values()) {
                        if (f1 + f2 < maxBudget) {
                            System.out.println(newsPaperList.get(i).keySet().toString() + newsPaperList.get(j).keySet().toString());
                        }
                    }
                }
            }
        }
    }
}
