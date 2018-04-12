package wxb829;

import java.io.PrintStream;

public class main {

    public static void main(String[] args) {
        // write your code here
        student student=new student("张三","洪山区","110","san@163.com", wxb829.student.GradeOne);
        Staff staff=new Staff("王五","湖北省武汉市","13312345678","wang@qq.com","南一楼808",10000.0,new myDate(2015,5,4),"王师傅");
        Faculty faculty=new Faculty("李四","北京市朝阳区","13388888888","li@qq.com","南一楼803",15000.0,new myDate(2015,8,2),"8:00-17:00",2);
        PrintStream stream=System.out;
        stream.println(student.toString()+"\n");
        stream.println(staff.toString()+"\n");
        stream.println(faculty.toString()+"\n");
        myDate date=new myDate();
        stream.println("当前日期 : "+date.toString());
        date=new myDate(561555550000L);
        stream.println("elaspedtime=561555550000L的日期为"+date.toString());

    }
}
