package wxb829;

public class student extends person{
    public  static final String GradeOne="大一";
    public  static final String GradeTwo="大二";
    public  static final String GradeThree="大三";
    public  static final String GradeFour="大四";
    protected String grade;

    public student(String name, String address, String phoneNumber, String emailAddress, String grade) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("\ngrade : %s",grade);
    }
}
