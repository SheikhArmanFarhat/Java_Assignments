public class Problem6{
    float length;
    float breadth;
    Problem6(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }
    float area(){
        float area = length*breadth;
        return area;
    }
    public static void main(String[] args) {
        Problem6 r1 = new Problem6(4,5);
        Problem6 r2 = new Problem6(5,8);
        float x=r1.area();
        float y =r2.area();
        System.out.println(x);
        System.out.println(y);
    }
}
