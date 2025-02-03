public class ifelse {
    public static void main(String[] args) {
        int x=5;
        int y=3;
        int z=7;
        if(x>y && x>z){
            System.out.println(x);
        }
        else if(y>x && y>z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }

        int n=10;
        int res=n%2==0? 1 : 0;
        System.out.println(res);
    }
}
