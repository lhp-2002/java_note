import java.util.Date;
public class TypeTest {
    public static void main(String[] args){
        // 数据类型
        String name = "张三";   //字符串类型
        int age = 18;       //整数类型
        char sex = '男';    //字符类型
        double height = 182.6;  //小数点类型，浮点数类型
        boolean single = true;  //布尔类型
        // 获取当前时间戳
        long timestamp = System.currentTimeMillis();
        Date dateObject = new Date(timestamp);
        long newTimestamp = dateObject.getTime();

        System.out.println(timestamp);
        System.out.println(newTimestamp);

        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(height);
        System.out.println(single);  
    }
}
