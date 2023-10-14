import java.util.*;

class AreaOfCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle to Calc the area of circle: ");
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println("The Area is: "+area);
    }
}