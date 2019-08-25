import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static javax.swing.UIManager.put;

/**
 * Created by kanov on 1/31/2017.
 */
public class LegendaryFarming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> materials = new LinkedHashMap<String, Integer>() {
            {
                put("fragments", 0);
                put("motes", 0);
                put("shards", 0);
            }
        };

        Map<String, Integer> junk = new TreeMap<>();
        boolean obtained = false;
        while (!obtained) {
            String[] input = reader.readLine().toLowerCase().split(" ");
            for (int i = 0; i < input.length; i += 2) {
                String material = input[i + 1];
                int quantities = Integer.parseInt(input[i]);
                if (materials.containsKey(material)) {
                    materials.put(material, materials.get(material) + quantities);
                    if (materials.get(material) >= 250) {
                        materials.put(material, materials.get(material) - 250);
                        obtained = true;

                        switch (material) {
                            case "shards":
                                System.out.printf("Shadowmourne obtained!\n");
                                break;
                            case "fragments":
                                System.out.printf("Valanyr obtained!\n");
                                break;
                            case "motes":
                                System.out.printf("Dragonwrath obtained!\n");
                                break;
                        }
                        break;
                    }
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, 0);
                    }
                    junk.put(material, junk.get(material) + quantities);
                }
            }
        }
        materials.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach((entry -> System.out.printf("%s: %s\n", entry.getKey(), entry.getValue())));
        junk.entrySet().stream().forEach(pairs -> System.out.printf("%s: %s\n", pairs.getKey(), pairs.getValue()));
    }
}
