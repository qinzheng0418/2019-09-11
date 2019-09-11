package Demo;

import java.sql.Connection;
import java.sql.SQLException;

public class Mytext {
    public static void main(String[] args) throws NoSuchMethodException, SQLException, ClassNotFoundException {
        Connection connection = JDBCUntil.getConnection();
        System.out.println(connection);
    }
}
