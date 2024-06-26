import java.util.Scanner;

public class main {
    private static final GiangVien[] giangVien = new GiangVien[100];
    private static int soLuongGiangVien = 0;

    private  static final MonHoc[] monHoc = new MonHoc[100];
    private  static  int soLuongMonHoc = 0;

    private static final QLKeKhaiGiangDay[] qlKeKhaiGiangDay = new QLKeKhaiGiangDay[100];
    private  static  int soLuongQLKeKhaiGiangDay = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Teacher Salary Mangement");
            System.out.println("1. Thêm giảng viên ");
            System.out.println("2. Hiển thị danh sách giảng viên ");
            System.out.println("3. Thêm môn học ");
            System.out.println("4. Hiển thị danh sách môn học ");
            System.out.println("5. Lập bảng kê khai giảng dạy cho giảng viên ");
            System.out.println("6. In danh sách kê khai giảng dạy ra màn hình ");
            System.out.println("7. Sắp xếp danh sách kê khai giảng dạy theo họ tên ");
            System.out.println("8. Sắp xếp danh sách kê khai giảng dạy theo môn(giảm dần) ");
            System.out.println("9. Bảng tiền công cho giảng viên ");
            System.out.println("0. Thoát chương trình !!!");
            System.out.println("Lựa chọn của bạn: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    themGiangVien();
                    pause();
                    break;
                case 2:
                    hienThiDanhSachGiangVien();
                    pause();
                    break;
                case 3:
                    themMonHoc();
                    pause();
                    break;
                case 4:
                    hienThiDanhSachMonHoc();
                    pause();
                    break;
                case 5:
                    lapBangKeKhai();
                    pause();
                    break;
                case 6:
                    hienThiBangKeKhai();
                    pause();
                    break;
                case 7:
                    sapXepTheoHoTen();
                    pause();
                    break;
                case 8:
                    sapXepTheoMon();
                    pause();
                    break;
                case 9:
                    bangLuong();
                    pause();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ vui lòng chọn lại.");
            }
        }while ( choose != 0);
        sc.close();
    }

    private static void themGiangVien(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số lượng giảng viên : ");
        int n= sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("Nhập thông tin giảng viên thứ " +(i+1));
            System.out.println("Nhập tên giảng viên: ");
            String hoTen = sc.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String diaChi = sc.nextLine();
            System.out.println("Nhập SDT: ");
            int SDT= sc.nextInt();
            System.out.println("Chọn trình độ: \n1.GS-TS \n2.PGS-TS \n3.Giảng viên chính \n4.Thạc sĩ");
            int check = sc.nextInt();
            sc.nextLine();
            String loaiTrinhDo;
            switch (check){
                case 1:
                    loaiTrinhDo = "GS-TS";
                    break;
                case 2:
                    loaiTrinhDo ="PSG-TS";
                    break;
                case 3:
                    loaiTrinhDo = "Giảng viên chính";
                    break;
                case 4:
                    loaiTrinhDo = "Thạc sĩ";
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ nên lựa chọn mặc định của bạn là 'GS-TS'.");
                    loaiTrinhDo = "GS-TS";
            }
            GiangVien newGiangVien = new GiangVien(hoTen,diaChi,SDT,loaiTrinhDo);
            giangVien[soLuongGiangVien++]= newGiangVien;
        }
    }


    private static  void hienThiDanhSachGiangVien(){
        System.out.println("Danh sách giảng viên: ");
        for (int i=0 ;i <soLuongGiangVien;i++){
            System.out.println(giangVien[i]);
        }
    }



    private static void themMonHoc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm số lượng môn học: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin môn học thứ " + (i+1));
            System.out.println("Tên môn học: ");
            String tenMon = sc.nextLine();
            System.out.println("Tổng số tiết: ");
            int tongSoTiet;
            do {
                tongSoTiet = sc.nextInt();
                sc.nextLine();
                if (tongSoTiet <= 0 || tongSoTiet > 200) {
                    System.out.println("Tổng số tiết không hợp lệ vui lòng nhập lại (0< Tổng số tiết <200)");
                }
            } while (tongSoTiet <= 0 || tongSoTiet > 200);
            int soTietLyThuyet;
            do {
                System.out.println("Nhập số tiết lý thuyết: ");
                soTietLyThuyet = sc.nextInt();
                sc.nextLine();
                if (soTietLyThuyet <= 0 || soTietLyThuyet > tongSoTiet) {
                    System.out.println("Số tiết lý thuyết không hợp lệ vui lòng nhập lại (0< Số tiết lý thuyết < Tổng số tiết)");
                }
            } while (soTietLyThuyet <= 0 || soTietLyThuyet > tongSoTiet);

            System.out.println("Nhập mức kinh phí: ");
            int mucKinhPhi = sc.nextInt();
            sc.nextLine();
            MonHoc newMonHoc = new MonHoc(tenMon, tongSoTiet, soTietLyThuyet, mucKinhPhi);
            monHoc[soLuongMonHoc++] = newMonHoc;
        }
    }


    private static  void hienThiDanhSachMonHoc(){
        System.out.println("Danh sách môn học: ");
        for (int i=0 ;i <soLuongMonHoc;i++){
            System.out.println(monHoc[i]);
        }
    }

    private static  void  lapBangKeKhai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Id giảng viên: ");
        int idGV = sc.nextInt();
        sc.nextLine();
        GiangVien giangVien = timKiemGiangVien(idGV);
        if(giangVien == null){
            System.out.println("ID không hợp lệ");
            return;
        }

        System.out.println("Nhập Id môn học: ");
        int idMonHoc = sc.nextInt();
        sc.nextLine();
        MonHoc monHoc = timKiemMonHoc(idMonHoc);
        if(monHoc == null){
            System.out.println("ID không hợp lệ");
            return;
        }

        System.out.println("Nhập số lớp giảng dạy: ");
        int soLop = sc.nextInt();
        sc.nextLine();

        QLKeKhaiGiangDay newQLKeKhaiGiangDay = new QLKeKhaiGiangDay(giangVien,monHoc,soLop);
        qlKeKhaiGiangDay[soLuongQLKeKhaiGiangDay++] = newQLKeKhaiGiangDay;
    }


    private  static  void hienThiBangKeKhai(){
        System.out.println("Bảng kê khai: ");
        for (int i=0 ;i <soLuongQLKeKhaiGiangDay;i++){
            System.out.println(qlKeKhaiGiangDay[i]);
        }
    }


    public static  void sapXepTheoHoTen(){
        if (soLuongQLKeKhaiGiangDay <= 1){
            System.out.println("Không đủ dữ liệu để sắp xếp!!");
            return;
        }
        for (int i =0 ;i<soLuongQLKeKhaiGiangDay-1;i++){
            for (int j= i+1;j<soLuongQLKeKhaiGiangDay;j++){
                if (qlKeKhaiGiangDay[i].getGiangVien().getHoTen().compareTo(qlKeKhaiGiangDay[j].getGiangVien().getHoTen()) >0){
                    QLKeKhaiGiangDay temp = qlKeKhaiGiangDay[i];
                    qlKeKhaiGiangDay[i] = qlKeKhaiGiangDay[j];
                    qlKeKhaiGiangDay[j] = temp;
                }
            }
            hienThiBangKeKhai();
        }
    }

    public  static void sapXepTheoMon(){
        if (soLuongQLKeKhaiGiangDay <=1){
            System.out.println("Không đủ dữ liệu để sắp xếp!!");
            return;
        }
        for (int i=0;i<soLuongQLKeKhaiGiangDay-1;i++){
            for (int j=i+1;j<soLuongQLKeKhaiGiangDay;j++){
                if (qlKeKhaiGiangDay[i].tongSoTiet()<qlKeKhaiGiangDay[j].tongSoTiet()){
                    QLKeKhaiGiangDay temp = qlKeKhaiGiangDay[i];
                    qlKeKhaiGiangDay[i] = qlKeKhaiGiangDay[j];
                    qlKeKhaiGiangDay[j] = temp;
                }
            }
        }
    }

    public static GiangVien timKiemGiangVien(int idGV){
        for (int i=0;i<soLuongGiangVien;i++){
            if (giangVien[i].getMaGv()==idGV){
                return giangVien[i];
            }
        }
        return null;
    }

    public static MonHoc timKiemMonHoc(int idMonHoc){
        for (int i=0;i<soLuongMonHoc;i++){
            if (monHoc[i].getMaMonHoc()==idMonHoc){
                return monHoc[i];
            }
        }
        return null;
    }

    private static void bangLuong(){
        System.out.println("Bảng tính tiền lương:");
        for (int i = 0; i <soLuongGiangVien; i++){
            GiangVien GV = giangVien[i];
            int total =0;
            for (int j =0 ;j<soLuongQLKeKhaiGiangDay;j++){
                QLKeKhaiGiangDay ql = qlKeKhaiGiangDay[i];
                if (ql.getGiangVien().getMaGv()==GV.getMaGv()){
                    total +=ql.tongSoTiet();
                }
            }
            System.out.println("Giảng viên: " + GV.getHoTen() + ": " + total + " VND");
        }
    }



    public static void pause(){
        System.out.print("Nhấn enter để tiếp tục ...");
        try{
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
