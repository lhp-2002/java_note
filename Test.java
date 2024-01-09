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
        int num = 0;
        int [] a = {1,2,2,0,1};
        int [] b = {0,1,1,1,0};
        for (int i=0; i<a.length; i++){
            if (a[i] >= 1){
                num = num + a[i];
            }

            if (b[i] >= 1){
                num = num - b[i];
            }
        }

        System.out.println(num);
    }
 }