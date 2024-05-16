public class Department {
    protected String Dname ;
    protected int  Dnumber ;

    public String getDname() {
        return Dname;
    }

    public int getDnumber() {
        return Dnumber;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public void setDnumber(int dnumber) {
        Dnumber = dnumber;
    }
public Department(){

}
    public Department(String dname, int dnumber) {
        Dname = dname;
        Dnumber = dnumber;
    }
    public String tostring (){

        return "Name of Department :"+ Dname +"\n"+"Department ID :"+Dnumber ;

    }
}
