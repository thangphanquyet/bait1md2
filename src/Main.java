import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double weight,height,bmi;
//        System.out.println("you weinht (in kg): ");
//        weight = sc.nextDouble();
//        System.out.println("you height (in mt)");
//        height = sc.nextDouble();
//        bmi = weight / Math.pow(height, 2);
//        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
//
//        int number = 2;
//
//        switch (number) {
//            case 1:
//                System.out.println("Đây là số 1");
//                break;
//            case 3:
//                  System.out.println("Đây là số 2");
//                break;
//            default: System.out.println("Error: invalid status");
//        }
//            ***
//        int bc;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("nhap so bc: ");
//        bc = sc.nextInt();
//        switch (bc) {
//            case 1:
//                System.out.println("Đây là số 1");
//                break;
//            case 3:
//                  System.out.println("Đây là số 2");
//                break;
//            default: System.out.println("Error: invalid status");
//        }
////         **khai báo sử dụng biến bài thực hành 2
//        int c = 12;// khai báo biến i là kiểu int
//        float d = 20.3f; // Khai báo biến f có kiểu là float
//        double e = 20.5; //Khai báo biến d có kiểu là double
//        char f = 'a'; // Khai báo biến c có kiểu là char có giá trị là kí tự a
//        String g = "hanoi";
//        System.out.println("c=:" + c);
//        System.out.println("d:" + d);
//        System.out.println("e=:" + e);
//        System.out.println("f=:" + f);
//        System.out.println("g=:" + g);
//           ***Viết một ứng dụng để tính diện tích của hình chữ nhật dựa vào chiều rộng và chiều cao
//        float width;
//        float height;
//        Scanner b1 = new Scanner(System.in);
//        System.out.println(" nhập width");
//        width = b1.nextFloat();
//        System.out.println(" nhập height");
//        height = b1.nextFloat();
//        float arry = width * height;
//        System.out.println(" diện tích hình chữ nhật là: " + arry);
//         *** giải phương trình bậc nhất
//        System.out.println("giải phương trình bậc nhất ");
//        System.out.println("Cho phương trình 'a * x + b = c', hãy nhập hằng số: ");
//        Scanner b2 = new Scanner(System.in);
//        System.out.println("nhập số a: ");
//        double a = b2.nextDouble();
//        System.out.println("nhập số b: ");
//        double b = b2.nextDouble();
//        System.out.println("nhập số c: ");
//        double c = b2.nextDouble();
//        if (a!= 0) {
//            double arr = (c - b) / a;
//            System.out.printf("có giá trị bằng: x = %f!\n", arr);
//        }else if (b==c){
//            System.out.println("phương trình vô số nghiệm");
//        }else {
//            System.out.println("phương trình vô nghiệm");
//        }
//          *** Luyện tập cấu trúc rẽ nhánh dựa trên câu lệnh switch..case.
//          Scanner b10 = new Scanner(System.in);
//        System.out.println("tìm ngày tháng nào ?: ");
//        int arr10 = b10.nextInt();
//        String daysInMonth;
//        switch (arr10){
//            case 2:
//                daysInMonth = "28 hoặc 29";
//                break;
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                daysInMonth = "31";
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                daysInMonth = "30";
//                break;
//            default:
//                daysInMonth = "";
//        }
//        if (!daysInMonth.equals("")) System.out.printf("Tháng '%d' có %s days!", arr10, daysInMonth);
//        else System.out.print("không có giá trị nào!");
//            *** tìm năm nhuận
        Scanner b11 = new Scanner(System.in);
        System.out.println("nhập số năm: ");
        int year = b11.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + ": là năm nhuận");
                }else {
                    System.out.println(year +": không là năm nhuận");
                }
            }else{
                System.out.println(year + ": là năm nhuận");
            }
        }else{
            System.out.println(year + ": không là năm nhuận");
        }
    }
}