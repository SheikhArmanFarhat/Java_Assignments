public class Problem5{
int empno;
String ename;
float hra ;
float da;
float basic;
float netpay;
float Calculate(){
    return basic+da+hra;
}
void havedata(int empno,String ename,float basic,float hra,float da){
    this.empno = empno;
    this.ename = ename;
    this.basic = basic;
    this.hra = hra;
    this.da = da;
    netpay = Calculate();
}
    void dispdata(){
        System.out.println("Problem5 no: "+empno);
        System.out.println("Problem5 name: "+ename);
        System.out.println("Basic: "+basic);
        System.out.println("Hra: "+hra);
        System.out.println("Da: "+da);
        System.out.println("Netpay: "+netpay);
    }
    public static void main(String[] args) {
        Problem5 x = new Problem5();
        x.havedata(101,"Prajwal",10.20f,54.5f,85.0f);
        x.dispdata();
    }
}
