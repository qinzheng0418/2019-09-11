package Demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-09-11 09:22
 * @Description:西部开源教育科技有限公司
 */
@Target(ElementType.METHOD) //限定自定义注解，用在什么上面
@Retention(RetentionPolicy.RUNTIME) //限定自定义注解保留到什么时期
public @interface JDBCAnnotation {
    String driverClass() default "com.mysql.jdbc.Driver";

    String url() default "jdbc:mysql://localhost:3306/mydb";

    String username();

    String password();
}
