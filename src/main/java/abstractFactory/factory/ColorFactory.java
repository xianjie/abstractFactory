package abstractFactory.factory;

import abstractFactory.color.Blue;
import abstractFactory.color.Color;
import abstractFactory.color.Green;
import abstractFactory.color.Red;
import abstractFactory.shape.Shape;

/**
 * @Title: ColorFactory
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 14:24
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
