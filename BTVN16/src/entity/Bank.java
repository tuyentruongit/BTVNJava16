package entity;

public class Bank {
    private int idBank;
    private String nameBank;
    private float interestRate;

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "idBank=" + idBank +
                ", nameBank='" + nameBank + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
