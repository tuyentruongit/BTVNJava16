package statics;

public enum TypeClient {
    CA_NHAN("Cá Nhân"),
    DOANH_NGHIEP("Doanh Nghiệp"),
    TAP_THE("Tập Thể");
    public String value ;

    TypeClient(String value) {
        this.value = value;
    }
}
