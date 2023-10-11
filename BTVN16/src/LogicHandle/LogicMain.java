package LogicHandle;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LogicMain {
    LogicClient logicClient = new LogicClient();
    LogicBank logicBank = new LogicBank();


    public void run (){
        while (true){
            printMenu();
            int choiceFuntion = choiceFuntion();
            switch (choiceFuntion){
                case 1:
                    logicClient.inpuInfor();
                    break;
                case 2:
                    logicClient.printClient();
                    break;
                case 3:
                    logicBank.inputInforBank();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;

            }
        }
    }

    private int choiceFuntion() {
        System.out.println("Bạn vui lòng chọn nhưng chức năng trên ");
        int choice = 0;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
            }catch (InputMismatchException e ){
                System.out.println("Dữ liệu bạn vừa nhập không đúng, Vui  lòng nhập lại ");
            }
            if (choice >0 && choice<10){
                break;
            }
            System.out.println("Chức năng bạn chọn không hợp lệ, Vui lòng chọn lại");
        }while (true);
        return choice;
    }

    private void printMenu() {
        System.out.println("Quản Lý Của Ngân Hàng");
        System.out.println("1. Nhập danh sách khách hàng mới ");
        System.out.println("2. In danh sách khách hàng");
        System.out.println("3. Nhập danh sách ngân hàng mới");
        System.out.println("4. In danh sách ngân hàng");
        System.out.println("5. Nhập sổ tiết kiệm mới cho khách hàng đã có");
        System.out.println("6. In sổ tiết kiệm mới cho khách hàng đã có");
        System.out.println("7. Sắp xếp danh sách khách hàng");
        System.out.println("8. lập bảng thống kê số tiền gửi cho mỗi khách  hàng");
        System.out.println("9. Thoát ");
    }
    public File fileclient(){
        File file = new File("client.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return file;
    }
}
