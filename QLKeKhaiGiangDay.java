public class QLKeKhaiGiangDay {
    private final GiangVien giangVien;
    private final MonHoc monHoc;
    private final int soLop;

    public QLKeKhaiGiangDay(GiangVien giangVien, MonHoc monHoc, int soLop){
        if (soLop < 1 || soLop >3) {
            System.out.println("\nSố lớp giảng dạy không hợp lệ vui lòng nhập lại (Số lớp cần phải > 1 và < 3 )!!!");
        }
        this.giangVien = giangVien;
        this.monHoc = monHoc;
        this.soLop = soLop;
    }



    public GiangVien getGiangVien() {
        return giangVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public int getSoLop() {
        return soLop;
    }

    public int tongSoTiet(){
        return monHoc.getTongSoTiet() * soLop;
    }

    public float tienLuong(){
        float tienLuongLyThuyet = monHoc.getSoTietLyThuyet() *monHoc.getMucKinhPhi() * soLop;
        float tienLuongThucHanh = (monHoc.getTongSoTiet() - monHoc.getSoTietLyThuyet()) * monHoc.getMucKinhPhi() * soLop * 0.7f;
        return  tienLuongLyThuyet + tienLuongThucHanh;
    }

    @Override
    public String toString() {
        return "\nGiảng viên: \n" +giangVien+
                "\nMôn học: \n" +monHoc+
                "\nSố lớp: \n" +soLop+
                "\nTổng số tiết: \n" +tongSoTiet()+
                "\nTiền lương: \n" +tienLuong();
    }
}
