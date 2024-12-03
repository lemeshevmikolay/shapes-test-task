package utils;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ColorUtil {

    private static final Map<String, Color> COLOR_MAP = new HashMap<>();

    static {
        COLOR_MAP.put("червоний", new Color(255, 0, 0));
        COLOR_MAP.put("зелений", new Color(0, 255, 0));
        COLOR_MAP.put("синій", new Color(0, 0, 255));
        COLOR_MAP.put("жовтий", new Color(255, 255, 0));
        COLOR_MAP.put("чорний", new Color(0, 0, 0));
        COLOR_MAP.put("білий", new Color(255, 255, 255));
        COLOR_MAP.put("сірий", new Color(128, 128, 128));
        COLOR_MAP.put("оранжевий", new Color(255, 165, 0));
        COLOR_MAP.put("рожевий", new Color(255, 192, 203));
    }

    public static String getRandomColorName() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        Color randomColor = new Color(red, green, blue);

        return getClosestColorName(randomColor);
    }

    private static String getClosestColorName(Color color) {
        String closestName = "Unknown";
        double closestDistance = Double.MAX_VALUE;

        for (Map.Entry<String, Color> entry : COLOR_MAP.entrySet()) {
            Color predefinedColor = entry.getValue();
            double distance = getColorDistance(color, predefinedColor);

            if (distance < closestDistance) {
                closestDistance = distance;
                closestName = entry.getKey();
            }
        }

        return closestName;
    }

    private static double getColorDistance(Color c1, Color c2) {
        int redDiff = c1.getRed() - c2.getRed();
        int greenDiff = c1.getGreen() - c2.getGreen();
        int blueDiff = c1.getBlue() - c2.getBlue();
        return Math.sqrt(redDiff * redDiff + greenDiff * greenDiff + blueDiff * blueDiff);
    }
}
