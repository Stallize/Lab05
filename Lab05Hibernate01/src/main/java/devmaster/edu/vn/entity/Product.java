package devmaster.edu.vn.entity;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Product")

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "MaSP")
	private String maSP;
	@Column(name = "TenSanPham")
	private String tenSanPham;
	@Column(name = "AnhSanPham")
	private String anhSanPham;
	@Column(name = "SoLuong")
	private String soLuong;
	@Column(name = "DonGia")
	private String donGia;
	@Column(name = "TrangThai")
	private String trangThai;
	
	public Product() {
		
	}
	
	public Product(String maSP) {
		this.maSP = maSP;
	}
	
	public String getMaSP() {
		return maSP;
	}
	
	public void setMaSP(String MaSP) {
		this.maSP = maSP;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getAnhSanPham() {
		return anhSanPham;
	}
	
	public void setAnhSanPham(String anhSanPham) {
		this.anhSanPham = anhSanPham;
	}
	
	public Integer getSoLuong() {
		return soLuong;
	}
	
	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}
	
	public Double getDonGia() {
		return donGia;
	}
	
	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}
	
	public Boolean getTrangThai() {
		return trangThai;
	}
	
	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}
}
