package wxb829;

public class Staff extends employee{
    protected String chenghao;
    public Staff(String name,String address,String phoneNum,String email,
                String Room,Double salary,myDate Date,String chenghao)
    {
        super(name, address, phoneNum, email, Room, salary, Date);
        this.chenghao=chenghao;
    }
    @Override
    public String toString() {
        return super.toString()+String.format("\nchenghao : %s", chenghao);
    }
}
