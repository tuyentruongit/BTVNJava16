package entity;

import statics.TypeClient;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client  extends Person implements Input{
    private static int nextID = 10000;
    private int idClient ;
    private String name;

    private TypeClient typeClient;

    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", typeClient=" + typeClient +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfor() {
        System.out.println("Nhập tên của khách hàng ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ của khách hàng ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại của khách hàng ");
        do {
            do {
                try {
                    this.setPhone(new Scanner(System.in).nextLine());
                    break;
                }
                catch (InputMismatchException e){
                    System.out.println("Dữ liệu bạn vừa nhập không đúng, Vui lòng nhập lại");
                }
            }while (true);
            if (regexPhoneNumber(getPhone())){
                break;
            }
            System.out.println("So dien thoai ban vua nhap khong dung vui long nhap lai");
        }while (true);
        System.out.println("Khách hàng trên thuộc đối tượng nào");
        System.out.println("1. Cá Nhân");
        System.out.println("2. Tập thể ");
        System.out.println("3. Doanh Nghiệp");
        int typeClient =0;
        do {
            try {
                typeClient = new Scanner(System.in).nextInt();
            }catch (InputMismatchException e ){
                System.out.println("Dữ liệu bạn vừa nhập không đúng, Vui  lòng nhập lại ");
            }
            if (typeClient >0 && typeClient<4){
                break;
            }
            System.out.println("Chức năng bạn chọn không hợp lệ, Vui lòng chọn lại");
        }while (true);
        switch (typeClient){
            case 1:
                this.setTypeClient(TypeClient.CA_NHAN);
                break;
            case 2:
                this.setTypeClient(TypeClient.TAP_THE);
                break;
            case 3:
                this.setTypeClient(TypeClient.TAP_THE);
                break;
        }
    }
    public boolean regexPhoneNumber(String phone){
        String regex =  "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
        if(phone.matches(regex)){
            return true;
        }
        return false;
    }
}
