package abstractFactory.color;

/**
 * @Title: Blue
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 14:22
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
