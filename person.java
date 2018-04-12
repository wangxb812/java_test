package wxb829;

public class person {
    protected String name;
    protected String address;
    protected String phoneNum;
    protected String email;

    public person(String name, String address, String phoneNum, String email) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email= email;
    }

    @Override
    public String toString() {
        return String.format("%s :\nname : %s\naddress : %s\nphoneNumber : %s\nemail : %s"
                ,getClass().getSimpleName(),name,address,phoneNum,email);
    }
}
