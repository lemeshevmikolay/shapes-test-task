package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.*;

public class RandomUtil {

    private static final Random random = new Random();

    public static _FigureModel generateRandomModel(Double testDataMax) {
        int modelType = random.nextInt(4);
        switch (modelType) {
            case 0:
                return new CircleModel(random.nextDouble(testDataMax), ColorUtil.getRandomColorName());
            case 1:
                return new SquareModel(random.nextDouble(testDataMax), ColorUtil.getRandomColorName());
            case 2:
                return new TriangleModel(random.nextDouble(testDataMax), random.nextDouble(testDataMax),
                        random.nextDouble(testDataMax), ColorUtil.getRandomColorName());
            case 3:
                return new TrapezoidModel(random.nextDouble(testDataMax), random.nextDouble(testDataMax),
                        random.nextDouble(testDataMax), random.nextDouble(testDataMax), ColorUtil.getRandomColorName());
            default:
                throw new IllegalStateException("Unexpected value: " + modelType);
        }
    }

    public static List<_FigureModel> generateRandomModels(Integer min, Integer max, Double testDataMax) {
        int numberOfModels = random.nextInt(max - min + 1) + min;
        List<_FigureModel> models = new ArrayList<>();

        for (int i = 0; i < numberOfModels; i++) {
            models.add(generateRandomModel(testDataMax));
        }

        return models;
    }
}
