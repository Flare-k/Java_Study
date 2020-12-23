package inheritance;

public class Customer {
    protected int customerID;   // protected를 쓰면 외부 클래스에서는 private이지만, 상속관계에서는 public
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;    // 만약 protected를 안써주고 다른 패키지에 있었다면? VIPCustomer에서 접근 불가

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += (price * bonusRatio);
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
