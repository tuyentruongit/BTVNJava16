package LogicHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LogicBank {

    public void inputInforBank() {
        System.out.println("Bạn muốn thêm bao nhiêu ngân hàng mới");
        int newBank ;
        do {
            try {
                newBank = new Scanner(System.in).nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Dữ liệu bạn vừa nhập không đúng, Vui  lòng nhập lại ");
            }
        }while (true);
        for (int i = 0; i < newBank; i++) {
            
        }
    }
}
