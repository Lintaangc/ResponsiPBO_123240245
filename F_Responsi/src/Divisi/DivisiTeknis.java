/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Divisi;

import Model.Kandidat;

/**
 *
 * @author Lab Informatika
 */
public class DivisiTeknis extends Kandidat{
	
	public DivisiTeknis(String nama, String divisi, Double target, Double disiplin, Double inovasi) {
		super(nama, divisi, target, disiplin, inovasi);
	}
	public DivisiTeknis(int id,String nama, String divisi, Double target, Double disiplin, Double inovasi) {
		super(id, nama, divisi, target, disiplin, inovasi);
	}
	
}
