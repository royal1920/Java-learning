package org.example;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.TypeReference;
import java.util.List;
import java.util.Map;

/**
 * @Author： yuruoyi1
 * @Date： 2024/3/5 15:41
 * @version： 1.0
 * @注释
 */

public class JsonParse {
    public static void main(String[] args) {
        String skuMinExpoFactor = "{\"sku1\": [10000, 15000], \"sku2\": [20000]}";
        Map<String, List<Integer>> map = JSON.parseObject(skuMinExpoFactor, new TypeReference<Map<String, List<Integer>>>() {
        });
        System.out.println(map);

        // 遍历map的key和value
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<Integer> value = entry.getValue();
            // 这里可以处理每个key和value
            System.out.println("Key: " + key + ", Value: " + value);

            System.out.println(map.get("sku1"));
        }
    }
}
