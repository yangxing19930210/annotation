
import com.alibaba.fastjson.annotation.JSONField;
import com.sekorm.annotations.JsonFieldName;
import com.sekorm.annotations.JsonListName;
import com.sekorm.annotations.JsonObjcetName;

import java.util.List;

/**
 * @author noah_yang
 * @version 1.0
 * @create 2018-10-05 19:32
 */
public class test1 {
    @JsonFieldName(name = "姓名")
    private String name;
    @JsonFieldName(name = "年龄")
    private Integer age;

    private test2 test2;
    @JsonListName(name = "字列表")
    private List<test2> test2s;


    public test2 getTest2() {
        return test2;
    }

    public void setTest2(test2 test2) {
        this.test2 = test2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<test2> getTest2s() {
        return test2s;
    }

    public void setTest2s(List<test2> test2s) {
        this.test2s = test2s;
    }
}
