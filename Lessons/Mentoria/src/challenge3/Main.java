package challenge3;

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller("Kamila", 12345678910L,10, 5);
        System.out.println(seller.calculateSalary());
        Consultant consultant = new Consultant("Pedro",12345678L,100,6);
        System.out.println(consultant.calculateSalary());
    }
}
