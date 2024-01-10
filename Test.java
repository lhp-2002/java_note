public class Test{
    public static void main(String []args) {
        // 输出Hello，world
        // System.out.println("Hello,world,main");
        // System.out.println("name" + "张三");
        // System.out.println("age" + "28");
        // 制表符  美化输出
        // System.out.println("name" + '\t' + "张三");
        // System.out.println("age" + '\t' + "28");

        // 变量
        // int a = 10, b = 15, c = 30;
        // System.out.println(a);
        // System.out.println(b);

        // a = 20;
        // System.out.println(a);
        // System.out.println(c);
        // int num = 0;
        // int [] a = {1,2,2,0,1};
        // int [] b = {0,1,1,1,0};
        // for (int i=0; i<a.length; i++){
        //     if (a[i] >= 1){
        //         num = num + a[i];
        //     }

        //     if (b[i] >= 1){
        //         num = num - b[i];
        //     }
        // }

        // System.out.println(num);
        byte a = -101;   // 不能超过127，负数不能超过-128
        System.out.println(a);

        short b = 30000;
        System.out.println(b);

        long c = 9999999999L;  //long类型大于9位数时，需要在后面加个L
        System.out.println(c);

        float d = 198.89F; //float类型，定义数据值时需要在后面加个F
        System.out.println(d);
    }
 }