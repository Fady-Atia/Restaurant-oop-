import java.util.ArrayList;
import java.util.Scanner ;
public  class Pizza implements Essentials {
    private ArrayList<String>size=new ArrayList<String>() ;
    private ArrayList<String>type=new ArrayList<String>() ;
    private ArrayList<Integer>price=new ArrayList<Integer>() ;


    /*size.add("S") ;
    size.add("M") ;
    size.add("L") ;*/
    // Constructor to initialize the ArrayList
    public Pizza() {
        // Add elements to the ArrayList within the constructor
        size.add("S");
        size.add("M");
        size.add("L");
        type.add("Margherita") ;
        type.add("Meat") ;
        type.add("chicken") ;
        price.add(50) ;
        price.add(60) ;
        price.add(75) ;
    }

    // Getter method to access the size ArrayList
    @Override
    public ArrayList<String>getsize() {
        return size;
    }
    @Override
    public ArrayList<String>gettype(){
        return type ;
    }
    @Override
    public ArrayList<Integer>getprice(){
        return price ;
    }

    @Override
    public void displayMenue() {
        System.out.println("----------- Menue of pizza ----------- ") ;
        System.out.println("========================================");
        System.out.println("Number -- Type-------- size----------price-----") ;
        System.out.println(" 1."+" Margherita "+"-----"+" small  "+"-----"+" 50 "+"\n");
        System.out.println(" 2."+" Margherita "+"-----"+" medium "+"-----"+" 60 "+"\n");
        System.out.println(" 3."+" Margherita "+"-----"+" large  "+"-----"+" 75 "+"\n");
        System.out.println(" 4."+"   meat     "+"-----"+" small  "+"-----"+" 50 "+"\n");
        System.out.println(" 5."+"   meat     "+"-----"+" medium  "+"-----"+" 60 "+"\n");
        System.out.println(" 6."+"   meat     "+"-----"+" large  "+"-----"+" 75 "+"\n");
        System.out.println(" 7."+" chicken     "+"-----"+" small  "+"-----"+" 50 "+"\n");
        System.out.println(" 7."+" chicken     "+"-----"+" medium  "+"-----"+" 60 "+"\n");
        System.out.println(" 8."+" chicken     "+"-----"+" large   "+"-----"+" 75 "+"\n");

    }
    double total_price=0.0  ;
public double pizza_choice() {

    float taxes = .25F;
    //int quantity=0 ;
    int amount;

    System.out.print("please enter number of your choice ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    switch (number) {
        case 1:
            System.out.print("your choice is Margherita small \n");
            System.out.print("How much quantity do you want?");
            amount = input.nextInt();
            total_price += (price.get(0) * amount) + (price.get(0)) * taxes;
            break;
        case 2:
            System.out.print("your choice is Margherita medium \n");
            System.out.print("How much quantity do you want?");
            amount = input.nextInt();
            total_price += (price.get(1) * amount) + (price.get(1)) * taxes;
            break;
        case 3:
            System.out.print("your choice is Margherita large \n ");
            System.out.print("How much quantity do you want?");
            amount = input.nextInt();
            total_price += (price.get(2) * amount) + (price.get(2)) * taxes;
            break;
        case 4:
            System.out.print("your choice is meat small \n ");
            System.out.print("How much quantity do you want?");
            amount = input.nextInt();
            total_price += (price.get(0) * amount) + (price.get(0)) * taxes;
            break;
        case 5:
            System.out.print("your choice is  pizza meat medium \n ");
            System.out.print("How much quantity do you want?");
            amount = input.nextInt();
            total_price += (price.get(1) * amount) + (price.get(1)) * taxes;
            break;
        case 6:
            System.out.print("your choice is  pizza meat large \n ");
            System.out.print("How much quantity do you want?");
            amount = input.nextInt();
            total_price += (price.get(2) * amount) + (price.get(2)) * taxes;
            break;

        case 7:
            System.out.print("your choice is pizza chicken small \n ");
            System.out.print("How much quantity do you want?");
            amount = input.nextInt();
            total_price += (price.get(0) * amount) + (price.get(0)) * taxes;
            break;
        case 8:
            System.out.print("your choice is pizza chicken medium \n");
            System.out.print("How much quantity do you want?");
            amount = input.nextInt();
            total_price += (price.get(1) * amount) + (price.get(1)) * taxes;
            break;
        case 9:
            System.out.print("your choice is pizza chicken large \n ");
            System.out.print("How much quantity do you want?");
            amount = input.nextInt();
            total_price += (price.get(2) * amount) + (price.get(2)) * taxes;
            break;

        default:
            System.out.print("please enter number between 1 to 9 ");
            break;
    }
    System.out.print("Do you need any thing else ");
    String x = input.next();
    if (x.equals("no")) {
        return total_price;
    }
    else {
        displayMenue();
        pizza_choice();
        return total_price;

    }
}

}

