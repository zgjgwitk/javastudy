package zhang.testpackage;

/**
 * Created by zhang on 2018/7/30.
 */
public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        show1();

    }

    public static void show1() {
        String str = "helloworld";
        char[] data = str.toCharArray();// 将字符串转为数组
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + "  ");
            data[x] -= 32;
            System.out.print(data[x] + "  ");
        }
        System.out.println(new String(data));
    }
}
