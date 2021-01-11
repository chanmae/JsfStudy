package fullstack.engineer.business.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DBConnection {

	public void getConnection() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		/** 接続先 */
		String url = "jdbc:mysql://localhost/sampledb";
		/** 接続先のユーザー名 */
		String userName = "user";
		/** 接続先のパスワード */
		String password = "password";
		/** 実行したいSQL文 */
		String sql = "SELECT * FROM sampledb.student";

		try {
			// JDBCドライバのロード
			Class.forName("com.mysql.jdbc.Driver");
			// １．データベースへの接続
			connection = DriverManager.getConnection(url, userName, password);

			// ２．Statementの作成
			statement = connection.createStatement();

			// ３．SQL文の実行
			resultSet = statement.executeQuery(sql);

			// ４．ResultSetの操作
			while (resultSet.next()) {
				// 取得した情報の操作
				System.out.print(resultSet.getString(1) + ", ");
				System.out.print(resultSet.getString(2) + ", ");
				System.out.print(resultSet.getString(3) + ", ");
				System.out.print(resultSet.getString(4));
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// ５．接続のクローズ
				// ResultSetのクローズ
				if (resultSet != null) {
					resultSet.close();
				}
				// Statementのクローズ
				if (statement != null) {
					statement.close();
				}
				// Connectionのクローズ
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
