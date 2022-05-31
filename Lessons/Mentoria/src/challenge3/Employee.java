package challenge3;

public abstract class Employee {

    private String name;
    private long cpf;
    protected final double SALARY = 1000.0;

    public Employee(String name, long cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSALARY() {
        return SALARY;
    }
}
