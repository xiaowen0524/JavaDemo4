package text.bwei.com.javademo4.three;

/**
 * 1.version:
 * 2.date:2016/11/28 18:44
 * 3.update:2016/11/28.
 * 4.autour:张玉杰
 */
public class A {
    private String name;
    private String age;
    private String address;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public A(String age, String address, String name, String sex) {
        this.age = age;
        this.address = address;
        this.name = name;
        this.sex = sex;
    }

    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
