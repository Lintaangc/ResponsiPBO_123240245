/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import CRUD.KlasifikasiDAO;
import Divisi.DivisiPemasaran;
import Divisi.DivisiTeknis;
import Model.Kandidat;
import View.Karyawan.ViewData;

import javax.swing.JOptionPane;
import java.util.List;
/**
 *
 * @author Lab Informatika
 */
public class KlasifikasiController {
	public ViewData view;
	public KlasifikasiDAO dao;
	public int selectedid = -1;
	
	public KlasifikasiController(View.Karyawan ViewData){
		this.view = new view;
		this.KlasifikasiDAO = new dao;
		
		loadTable();
		initEvent();
	}
	
}
