/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author Lab Informatika
 */
public class DBConnection {
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String nama_db = "employee_db";
	String url_db = "jdbc:mysql://localhost:3306/" + nama_db;
	String Username = "root";
	String Password = "";

	Connection conn;
	
	public DBConnection() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(url_db,Username,Password);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Koneksi gagal" + e.getMessage());
		}
	}
	public Connection getConnection(){
		return conn;
	}
}
