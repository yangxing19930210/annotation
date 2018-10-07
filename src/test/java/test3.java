import com.sekorm.annotations.JsonFieldName;


/**
 * @author noah_yang
 * @version 1.0
 * @create 2018-10-05 19:33
 */
public class test3 {
    @JsonFieldName(name = "姓名3")
    private String name2;
    @JsonFieldName(name = "1111姓名3")
    private String age2;

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
