package wxb829;

public class employee extends person {
    protected String office;
    protected Double salary;
    protected myDate Date;

    public employee(String name, String address, String phoneNumber, String emailAddress, String office, Double salary, myDate Date) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.Date = Date;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("\noffice : %s\nsalary : %.2f\nappointment date : %s",office,salary,Date.toString());
    }
}
