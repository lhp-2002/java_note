import java.util.Scanner;
public class HireTest {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);

        System.out.println("输入年纪");
        int age = sc.nextInt(); //18

        System.out.println("乘几");
        int id = sc.nextInt();  //2

        System.out.println("等于 = " + age * id);   //等于 = 36
    }
}
