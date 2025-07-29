package ut.edu.nhom_qtda.models;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "honongdan")
public class HoNongDan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MaHo")
    private String maHo;

    @Column(name = "TenChuHo")
    private String tenChuHo;

    @Column(name = "CCCD")
    private String cccd;

    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "SoDienThoai")
    private String soDienThoai;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "SoThanhVien")
    private Integer soThanhVien;

    @Column(name = "LoaiDat")
    private String loaiDat;

    @Column(name = "DienTich")
    private Float dienTich;

    @Column(name = "NgayDangKy")
    private Date ngayDangKy;

    // Getters, Setters

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getMaHo() {return maHo;}
    public void setMaHo(String maHo) {this.maHo = maHo;}

    public String getTenChuHo() {return tenChuHo;}
    public void setTenChuHo(String tenChuHo) {this.tenChuHo = tenChuHo;}

    public String getCccd() {return cccd;}
    public void setCccd(String cccd) {this.cccd = cccd;}

    public Date getNgaySinh() {return ngaySinh;}
    public void setNgaySinh(Date ngaySinh) {this.ngaySinh = ngaySinh;}

    public String getSoDienThoai() {return soDienThoai;}
    public void setSoDienThoai(String soDienThoai) {this.soDienThoai = soDienThoai;}

    public String getDiaChi() {return diaChi;}
    public void setDiaChi(String diaChi) {this.diaChi = diaChi;}

    public Integer getSoThanhVien() {return soThanhVien;}
    public void setSoThanhVien(Integer soThanhVien) {this.soThanhVien = soThanhVien;}

    public String getLoaiDat() {return loaiDat;}
    public void setLoaiDat(String loaiDat) {this.loaiDat = loaiDat;}

    public Float getDienTich() {return dienTich;}
    public void setDienTich(Float dienTich) {this.dienTich = dienTich;}

    public Date getNgayDangKy() {return ngayDangKy;}
    public void setNgayDangKy(Date ngayDangKy) {this.ngayDangKy = ngayDangKy;}


}
