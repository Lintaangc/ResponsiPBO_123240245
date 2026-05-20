/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import Connector.DBConnection;
import Model.Kandidat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public class KlasifikasiDAO {
	Connection conn;
	
	public KlasifikasiDAO(){
		DBConnection db = new DBConnection();
		conn = db.getConnection();
	}
	
	// CREATE
	public void insert(Kandidat evaluasi){
		String query = "INSERT INTO evaluasi" + "(nama,divisi,nilai_target,niali_disiplin,nilai_inovasi,status)" + "VALUES(?,?,?,?,?,?)";
		
		try {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1,evaluasi.getnama());
			statement.setString(2,evaluasi.getdivisi());
			statement.setDouble (3,evaluasi.getnilai_target());
			statement.setDouble(4,evaluasi.getnilai_disiplin());
			statement.setDouble(5,evaluasi.getnilai_inovasi());
			statement.setString(6,evaluasi.getStatus());
			statement.setInt(7,evaluasi.getid());
			statement.executeUpdate();
			statement.close();
		} catch (SQLException e) {
			System.out.println("ERROR INSERT DATA" + e.getMessage());
		}
	}
	//READ 
	public List<Kandidat>getAll(){
		List<Kandidat>evaluasiList = new ArrayList<>();
		String query = "SELECT * FROM evaluasi";
		
		try {
			PreparedStatement statement = conn.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				Kandidat evaluasi = new Kandidat(query, query, Double.MAX_VALUE, Double.NaN, Double.MIN_NORMAL);
				
				evaluasi.setid(resultSet.getInt("id"));
				evaluasi.setnama(resultSet.getString("nama"));
				evaluasi.setdivisi(resultSet.getString("divisi"));
				evaluasi.setnilai_target(resultSet.getDouble("nilai_target"));
				evaluasi.setnilai_disiplin(resultSet.getDouble("nilai_disiplin"));
				evaluasi.setnilai_inovasi(resultSet.getDouble("nilai_inovasi"));
				evaluasiList.add(evaluasi);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			System.out.println("error baca data" + e.getMessage());
		}
		return evaluasiList;
	}
}
