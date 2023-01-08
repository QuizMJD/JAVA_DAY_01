import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Để đọc file txt trong Java, bạn có thể sử dụng lớp BufferedReader
public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\Text.txt"; // Tên file cần đọc
        String line; // Biến lưu từng dòng đọc được từ file

        try {
            // Mở file để đọc
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Đọc từng dòng trong file và in ra màn hình
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Đóng reader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Trong ví dụ trên, chúng ta đọc từng dòng trong file và in nó ra màn hình.
        // Nếu bạn muốn đọc một ký tự một lúc, bạn có thể sử dụng lớp BufferedReader và phương thức read() để đọc ký tự một lúc.
        // Ví dụ:
//        int ch;
//        while ((ch = reader.read()) != -1) {
//            System.out.println((char) ch);
//        }
        //Trong ví dụ trên, chúng ta sử dụng vòng lặp while để đọc từng ký tự trong file, rồi ép kiểu về kiểu char và in ra màn hình.
        //
        //Cần lưu ý rằng bạn cần để ý xử lý ngoại lệ IOException khi đọc file.
        ////////////////////////////////////
//        Trong Java, file được đọc từ máy tính của bạn. Vì vậy, nếu bạn muốn đọc một file, bạn cần chỉ định đường dẫn đến file đó.
//
//        Đường dẫn có thể là một đường dẫn tuyệt đối hoặc một đường dẫn tương đối. Đối với đường dẫn tuyệt đối, bạn sẽ chỉ định đường dẫn đầy đủ từ gốc đến file, ví dụ: C:\Users\Username\Documents\input.txt. Đối với đường dẫn tương đối, bạn sẽ chỉ định đường dẫn tương đối đến file so với vị trí hiện tại của chương trình, ví dụ: ./input.txt hoặc ../input.txt.
//
//                Ví dụ về đọc file txt với đường dẫn tuyệt đối:
//
//        Copy code
//        String fileName = "C:\\Users\\Username\\Documents\\input.txt";
//        Ví dụ về đọc file txt với đường dẫn tương đối:
//
//        Copy code
//        String fileName = "./input.txt";
//        Để đọc file txt, bạn có thể sử dụng lớp BufferedReader như đã hướng dẫn trước đó.
//
//        Cần lưu ý rằng bạn cần xử lý ngoại lệ IOException khi đọc file

    }
}