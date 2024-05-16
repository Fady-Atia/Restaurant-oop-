public class Personal_info {
    private String f_name;
    private String l_name;
    private String email;
    private String phone;
    private int age ;



    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Personal_info(String f_name, String l_name, String email, String phone,int age) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.phone = phone;
        this.age=age ;
    }
    public String tostring(){

        return " ** personal information are ** "+"\n"+"first name : "+ f_name +"\n"+"last name :"+l_name+"\n"+"email : " +email +"\n"+"phone number : "+phone +"\n"+"Age : "+age  ;


    }
}
