import java.util.Scanner;

public class GiangVien {
    Scanner sc = new Scanner(System.in);
    public static int nextId = 100;
    private int maGv;
    private String hoTen;
    private String diaChi;
    private int SDT;
    private String trinhDo;

    public GiangVien(String hoTen, String diaChi, int SDT, String trinhDo){
        this.maGv=nextId++;
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.SDT=SDT;
        this.trinhDo=trinhDo;
    }

    public int getMaGv() {
        return maGv;
    }

    public void setMaGv(int maGv) {
        this.maGv = maGv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString(){
        return "\nMã giảng viên: " +maGv+
                "\nHọ tên: " +hoTen+
                "\nĐịa chỉ: " +diaChi+
                "\nSDT: " +SDT+
                "\nTrình độ: " +trinhDo;
    }
}
