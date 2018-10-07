import com.sekorm.annotations.JsonFieldName;
import com.sekorm.annotations.JsonListName;

import java.util.List;


/**
 * @author noah_yang
 * @version 1.0
 * @create 2018-10-05 19:33
 */
public class test2 {
    @JsonFieldName(name = "姓名2")
    private String name2;
    private String age2;
    private List<test3> test3s;

    public List<test3> getTest3s() {
        return test3s;
    }

    public void setTest3s(List<test3> test3s) {
        this.test3s = test3s;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getAge2() {
        return age2;
    }

    public void setAge2(String age2) {
        this.age2 = age2;
    }
}
