package String;

import java.util.*;

//
public class DisplayTableFoodOrders_1418 {

    public List<List<String>> displayTable(List<List<String>> orders) {
        // 1) Collect all unique food items (alphabetically sorted)
        TreeSet<String> foods = new TreeSet<>();

        // 2) Map: tableNumber -> (food -> count); tables sorted numerically
        TreeMap<Integer, Map<String, Integer>> tableOrders = new TreeMap<>();

        for (List<String> order : orders) {
            int table = Integer.parseInt(order.get(1));
            String food = order.get(2);

            foods.add(food);

            // if table not in map, create new HashMap
            if (!tableOrders.containsKey(table)) {
                tableOrders.put(table, new HashMap<>());
            }

            Map<String, Integer> count = tableOrders.get(table);
            //if not present => create new => and add
            count.put(food, count.getOrDefault(food, 0) + 1);

        }

        // 3) Build header row: "Table" + sorted foods
        List<List<String>> result = new ArrayList<>();
        List<String> header = new ArrayList<>();
        header.add("Table");
        header.addAll(foods);
        result.add(header);

        // 4) Build rows per table (tables already sorted by TreeMap)
        for (Map.Entry<Integer, Map<String, Integer>> entry : tableOrders.entrySet()) {
            int table = entry.getKey();
            Map<String, Integer> counts = entry.getValue();

            List<String> row = new ArrayList<>();
            row.add(String.valueOf(table));
            for (String food : foods) {
                row.add(String.valueOf(counts.getOrDefault(food, 0)));
            }
            result.add(row);
        }
        return result;
    }
}

