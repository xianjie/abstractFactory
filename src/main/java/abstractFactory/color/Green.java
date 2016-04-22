package abstractFactory.color;

/**
 * @Title: Green
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 14:21
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
