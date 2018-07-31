package zhang.testpackage;

/**
 * Created by zhang on 2018/7/30.
 */
public class Puppy {

    /**
     * @Author: zhang on 2018/7/30 14:37
     * @param: [name]
     * @return:
     * @Description:
     */
    public Puppy(String name) {
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name);
    }
    public static void main(String []args){
        // 下面的语句将创建一个Puppy对象
        Puppy myPuppy = new Puppy( "tommy" );
    }
}
