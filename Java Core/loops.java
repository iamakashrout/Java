public class loops {
    public static void main(String[] args) {
        int x=0;
        System.out.println("while loop:");
        while(x<10){
            System.out.println(x);
            x++;
        }
        x=0;
        System.out.println("do while loop:");
        do {
            System.out.println(x);
            x++;
        } while(x<10);
        System.out.println("for loop:");
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }
}
