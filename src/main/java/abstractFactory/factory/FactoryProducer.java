package abstractFactory.factory;

/**
 * @Title: FactoryProducer
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 14:24
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();

        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
