package Demo;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUntil {
    @JDBCAnnotation(driverClass = "com.mysql.jdbc.Driver", url = "jdbc:mysql://localhost:3306/mydb", username = "root", password = "123456")
    public  static Connection getConnection() throws NoSuchMethodException, ClassNotFoundException, SQLException {

        Class<JDBCUntil> jdbcUntilClass = JDBCUntil.class;
        Method method = jdbcUntilClass.getMethod("getConnection");
        boolean b = method.isAnnotationPresent(JDBCAnnotation.class);
      if (b) {
          JDBCAnnotation annotation = method.getAnnotation(JDBCAnnotation.class);
          String driverClass = annotation.driverClass();
          String url = annotation.url();
          String password = annotation.password();
          String username = annotation.username();
          Class.forName(driverClass);
          //获取数据库连接对象
          Connection connection = DriverManager.getConnection(url, username, password);
          return connection;
      }
       return null;
    }
}
