package abstractFactory.factory;

import abstractFactory.color.Color;
import abstractFactory.shape.Shape;

/**
 * @Title: AbstractFactory
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 14:22
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
