import java.util.HashMap ;
public class Main {
    public static void main(String[] args) {
       Employee e1=new Employee(1,3000,200,"fady","atia","fady@mail.com","1234567",22,"cacher",10) ;
        System.out.print(e1.tostring()+"\n");
        //System.out.print(e1.getDname());
       // Department d1 =new Department() ;

        Pizza menue =new Pizza() ;
        System.out.print("Display the pizza menue \n");
        menue.displayMenue();
        double tp= menue.pizza_choice();

        System.out.print("total price is : "+ tp ) ;








    }
}
