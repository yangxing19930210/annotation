import com.sekorm.binding.JsonNameBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author noah_yang
 * @version 1.0
 * @create 2018-10-05 19:35
 */
public class tets {

    public static void main(String[] args) throws Exception {
        test2 test4=new test2();

        test4.setAge2("444");
        test2 test2=new test2();

        test2.setAge2("2222211");
        List lis=new ArrayList();
        test3 test33=new test3();
        test33.setName2("efewf");
        test33.setAge2("fewfewf");
        lis.add(test33);
        test2.setTest3s(lis);
        test2 test3=new test2();
        test3.setName2("2222233");

        test1 test1=new test1();
        test1.setName("1111");

        List list=new ArrayList();
        list.add(test2);
        list.add(test3);
        test1.setTest2s(list);
        test1.setTest2(test4);
        String s=JsonNameBinding.getJson(test1);
        System.out.print(s);
    }
}
