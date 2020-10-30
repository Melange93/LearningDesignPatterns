package structural.flyweight;

import java.awt.*;
import java.util.*;

public class TreeFactory {

    private static Set<TreeType> treeTypes = new HashSet<>();

    public static TreeType getTreeType(String name, Color color, String texture) {
        TreeType treeType = new TreeType(name, color, texture);
        treeTypes.add(treeType);
        return treeType;
    }

    /*
    Other implementation:

    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String texture) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, texture);
            treeTypes.put(name, result);
        }
        return result;
    }
     */
}
