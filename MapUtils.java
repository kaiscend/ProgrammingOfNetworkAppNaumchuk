//Задача 2. Напишите метод, который получает на вход Map<K, V> и возвращает Map,
//где ключи и значения поменяны местами. Для упрощения задачи
//мапа должна быть с ключами типа String и значениями типа Integer.

import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> map) {
        Map<V, K> swappedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            swappedMap.put(value, key);
        }
        return swappedMap;
    }
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("one", 1);
        originalMap.put("two", 2);
        originalMap.put("three", 3);

        Map<Integer, String> swappedMap = swapKeysAndValues(originalMap);

        for (Map.Entry<Integer, String> entry : swappedMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " => " + value);
        }
    }
}