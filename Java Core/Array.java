public class Array {
    public static void main(String[] args) {
        int array1D[] = new int[10];
        for(int i=0; i<10; i++){
            array1D[i]=i;
            System.out.println(array1D[i]);
        }

        int array2D[][]=new int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                array2D[i][j]=i+j;
                System.out.println(array2D[i][j]);
            }
        }
    }
}
