import model._FigureModel;
import utils.RandomUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<_FigureModel> randomModels = RandomUtil.generateRandomModels(5, 10, 200D);

        for (_FigureModel model : randomModels) {
            System.out.println(model.print());
        }
    }
}