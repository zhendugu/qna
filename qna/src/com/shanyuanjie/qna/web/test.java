package com.shanyuanjie.qna.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "1234");

			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO QUEST(qingtianxie,danxuan,duoxuan,xiala) VALUES(?,?,?,?)");

			preparedStatement.setString(1, "qingtianxie");
			preparedStatement.setString(2, "danxuan");
			preparedStatement.setString(3, "duoxuan");
			preparedStatement.setString(4, "xiala");

			preparedStatement.executeUpdate();

			connection.close();
			preparedStatement.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
