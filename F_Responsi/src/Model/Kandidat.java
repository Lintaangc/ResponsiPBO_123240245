/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Interfaces.Assesment;

/**
 *
 * @author Lab Informatika
 */
public class Kandidat implements Assesment{
	
	private int id;
	private String nama;
	private String divisi;
	private Double nilai_target;
	private Double nilai_disiplin;
	private Double nilai_inovasi;

	public Kandidat(String nama,String divisi,Double nilai_target,Double nilai_disiplin,Double nilai_inovasi) {
		this.nama = nama;
		this.divisi = divisi;
		this.nilai_target = nilai_target;
		this.nilai_disiplin = nilai_disiplin;
		this.nilai_inovasi = nilai_inovasi;
	}
	public Kandidat(int id,String nama,String divisi,Double nilai_target,Double nilai_disiplin,Double nilai_inovasi) {
		this.nama = nama;
		this.divisi = divisi;
		this.nilai_target = nilai_target;
		this.nilai_disiplin = nilai_disiplin;
		this.nilai_inovasi = nilai_inovasi;
	}
	


	@Override
	public double calculateScore() {
		return (nilai_target*50/100 + nilai_disiplin*30/100 + nilai_inovasi*20/100)/3.0;
	}

	@Override
	public String getStatus() {
		if (calculateScore() >= 85) {
			return"PROMOSO";
		}else{
			return "TETAP";
		}
	}
	public int getid(){
		return id;
	}
	public void setid(int id){
		this.id = id;
	}
	public String getnama(){
		return nama;
	}
	public void setnama(String nama){
		this.nama = nama;
	}public String getdivisi(){
		return divisi;
	}
	public void setdivisi(String divisi){
		this.divisi = divisi;
	}public double getnilai_target(){
		return nilai_target;
	}
	public void setnilai_target(double nilai_target){
		this.nilai_target = nilai_target;
	}public double getnilai_disiplin(){
		return nilai_disiplin;
	}
	public void setnilai_disiplin(double nilai_disiplin){
		this.nilai_disiplin = nilai_disiplin;
	}public double getnilai_inovasi(){
		return nilai_inovasi;
	}
	public void setnilai_inovasi(double nilai_inovasi){
		this.nilai_inovasi = nilai_inovasi;
	}
	
	
}
