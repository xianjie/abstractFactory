package abstractFactory.shape;

/**
 * @Title: Circle
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 14:20
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
