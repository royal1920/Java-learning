package org.example;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author： yuruoyi1
 * @Date： 2024/2/26 18:13
 * @version： 1.0
 * @注释
 */

public class filterTest {
    public static void main(String[] args) {
        List<String> tabIds = Arrays.asList("1", "2", "3");
        List<String> prefixedTabIds = tabIds.stream()
                .map(tabid -> '1' + tabid)
                .collect(Collectors.toList());
        System.out.println(prefixedTabIds);

        // 创建 Map 实例
        Map<String, String> Map = new HashMap<>();
        // 写入指定的 key 和 value
        String key = "678";
        String value = "100055896099_0.0646#10090058784869_0.0637#10090100455441_0.0609#10062967153455_0";
        // 将键值对放入 map
        Map.put(key, value);
        // 打印 map 确认写入成功
        System.out.println(Map);
        // 打印新map
        System.out.println(
                Map.values().stream()
                        .flatMap(x -> Stream.of(x.split("#")))
                        .map(x -> x.split("_")[0])
                        .distinct()
                        .collect(Collectors.toList())
        );
    }
}
