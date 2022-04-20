import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;
public class ClassDemo {

    public static void main(String[] args) throws Exception{
        String url=" ";
        String uname= "root";
        String pass ="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= Driver.getConnection(url,uname,pass);


    }
}




