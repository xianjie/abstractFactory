package abstractFactory.shape;

/**
 * @Title: Square
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 14:19
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
