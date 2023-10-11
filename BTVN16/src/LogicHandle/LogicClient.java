package LogicHandle;

import entity.Client;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LogicClient {
    List<Client> clients = new ArrayList<>();

    public void inpuInfor() {
        System.out.println("Bạn muốn thêm bao nhiêu khách hàng mới ");
        int newClient ;
        do {
            try {
                newClient = new Scanner(System.in).nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Dữ liệu bạn vừa nhập không đúng, Vui  lòng nhập lại ");
            }
        }while (true);
        for (int i = 0; i < newClient; i++) {
            System.out.println("Nhập thông tin của khách hàng thứ "+(i+1));
            Client client =new Client();
            client.inputInfor();
            saveClient( client);
        }
    }

    private void saveClient(Client client) {
        clients.add(client);
    }

    public void printClient() {
        System.out.println(clients);
    }
}
