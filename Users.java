public class Users {
    private String name;
    private int age;
    private String email;
    private String ph_no;
    private String password;
    @Override
    public String toString() {
        return "Name: "+this.name+"\nAge: "+this.age+"\nEmail: "+this.email+"\nPhone number: "+this.ph_no+"\nPassword: "+this.password;
    }
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPh_no() {
        return ph_no;
    }


    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public Users(String name, int age, String email, String ph_no, String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.ph_no = ph_no;
        this.password = password;
    }


    
}
