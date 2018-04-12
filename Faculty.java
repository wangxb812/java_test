package wxb829;

public class Faculty extends employee{
    public String workTime;
    public int Class;
    public Faculty(String name,String address,String phoneNum,String email,
                 String Room,Double salary,myDate Date,String workTime,int Class)
    {
        super(name, address, phoneNum, email, Room, salary, Date);
        this.workTime=workTime;
        this.Class=Class;
    }
    @Override
    public String toString() {
        return super.toString()+String.format("\nwork time : %s\nlevel : %d",workTime,Class);
    }
}
