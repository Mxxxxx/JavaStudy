package JavaStudy.Study.Study0619.DB;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-19 20:18
 **/
public class DBUtil {
    private static volatile DataSource dataSource = null;

    private static DataSource initData() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("199846");
        mysqlDataSource.setCharacterEncoding("utf8");
        return mysqlDataSource;
    }

    public static Connection getDataSource() throws SQLException {
        if (dataSource == null) {
            synchronized (DBUtil.class) {
                if (dataSource == null) {

                    //volatile修饰了内存可见性
                    dataSource = initData();
                }
            }
        }
        return dataSource.getConnection();
    }

    private DBUtil() {

    }
}
