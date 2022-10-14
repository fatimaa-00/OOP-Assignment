import java.util.*;
class MARKS{
    public static void main(String args[]){
        System.out.println("Enter the marks to calculate the cpn:");
        Scanner mark = new Scanner(System.in);
        int testmarks;
        Float matric,inter;
        double cpn;
        System.out.println("Enter the matric percentage:");
        matric = mark.nextFloat();
        System.out.println(matric);
        System.out.println("Enter the inter");
        inter = mark.nextFloat();
        System.out.println(inter);
        System.out.println("Enter the test marks:");
        testmarks = mark.nextInt();
        System.out.println(testmarks);
        cpn = matric * 0.10 + inter * 0.30 + testmarks *0.60;
        System.out.println("the cpn is:");
        System.out.print(cpn);
    }
}