import java.util.Scanner;

public class MonHoc {
    Scanner sc =new Scanner(System.in);
    private static int nextId = 100;
    private int maMonHoc;
    private String tenMon;
    private int tongSoTiet;
    private int soTietLyThuyet;
    private float mucKinhPhi;

    public MonHoc(String tenMon, int tongSoTiet, int soTietLyThuyet, float mucKinhPhi){
        this.maMonHoc=nextId++;
        this.tenMon=tenMon;
        this.tongSoTiet=tongSoTiet;
        this.soTietLyThuyet=soTietLyThuyet;
        this.mucKinhPhi=mucKinhPhi;
    }


    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(int maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public int getSoTietLyThuyet() {
        return soTietLyThuyet;
    }

    public void setSoTietLyThuyet(int soTietLyThuyet) {
        this.soTietLyThuyet = soTietLyThuyet;
    }

    public float getMucKinhPhi() {
        return mucKinhPhi;
    }

    public void setMucKinhPhi(float mucKinhPhi) {
        this.mucKinhPhi = mucKinhPhi;
    }


    public String toString(){
        return "\nMã môn học: " +maMonHoc+
                "\nTên môn: " +tenMon+
                "\nTổng số tiết: " +tongSoTiet+
                "\nSố tiết lý thuyết: " +soTietLyThuyet+
                "\nMức kinh phí: " +mucKinhPhi;
    }
}
