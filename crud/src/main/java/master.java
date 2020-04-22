public class master {
    private int id;
    private String name;
    private String age;
    private String password;

    @Override
    public String toString() {
        return "master{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", password='" + password + '\'' +
                ", rmb='" + rmb + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRmb() {
        return rmb;
    }

    public void setRmb(String rmb) {
        this.rmb = rmb;
    }

    private String rmb;
}
