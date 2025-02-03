class Calculator {
    int a;
    public int add(int n1, int n2){
        int res=n1+n2;
        System.out.println("Adding");
        return res;
    }
}

public class Object {
    public static void main(String[] args) {
        int num1=3;
        int num2=7;
        Calculator calc = new Calculator();
        int res=calc.add(num1, num2);
        System.out.println(res);
    }
}
