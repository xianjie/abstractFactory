package abstractFactory.factory;

import abstractFactory.color.Color;
import abstractFactory.shape.Circle;
import abstractFactory.shape.Rectangle;
import abstractFactory.shape.Shape;
import abstractFactory.shape.Square;

/**
 * @Title: ShapeFactory
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 14:23
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
