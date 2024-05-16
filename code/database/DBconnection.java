package database;
import java.sql.Connection ;
import java.sql.SQLException;
import java.sql.Statement ;
import java.sql.DriverManager ;
public class DBconnection {
    private static String url="" ;
    private  static  String dbname="resturant" ;
    private static Connection  conn ;
    private static void seturl(){
     //حدد عنوان الداتا بيز اللي عايوز اعملconnection عليها

        url="jdbc:mysql://localhost:3306/"+dbname+"?use Unicode=true&characterEncoding=UTF-8";


    }
    private static void setconnection() throws SQLException{
        seturl();
        conn=DriverManager.getConnection(url,"roor","") ;




    }


}
