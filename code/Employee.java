public class Employee extends Department {
  //  private String name;
    private int id;
    private int salary;
    private int bonus;

   // public String getName() {
   //     return name;
   // }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    private Personal_info personalInfo;

    public Employee( int id, int salary, int bonus, String f_name, String l_name, String email, String phone, int age,String Dname ,int Dnunmber) {
        super(Dname,Dnunmber);
       // this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        //composition relationship ;
        this.personalInfo = new Personal_info(f_name, l_name, email, phone, age);
    }
    @Override
    public String tostring() {
        return "Id :" + id + "\n" + "salary :" + salary + "\n" + "Bonus : " + bonus;

    }
}
