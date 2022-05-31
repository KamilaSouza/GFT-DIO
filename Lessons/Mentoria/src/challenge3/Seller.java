package challenge3;

public class Seller extends Employee {

    private double commission;
    private long sellingQuantity;

    public Seller(String name, long cpf, double commission, long sellingQuantity) {
        super(name, cpf);
        this.commission = commission;
        this.sellingQuantity = sellingQuantity;
    }

    @Override
    public double calculateSalary() {
        return super.SALARY + (this.commission * this.sellingQuantity);
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public long getSellingQuantity() {
        return sellingQuantity;
    }

    public void setSellingQuantity(long sellingQuantity) {
        this.sellingQuantity = sellingQuantity;
    }
}
