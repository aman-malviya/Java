public class Main{
    public static void main(String[] args) {
        String[] cars={"Mercedes", "Tesla"};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        cars[0]="Ferrari";
        System.out.println(cars[0]);

        String[] fruits=new String[3];
        fruits[0]="Apple";
        fruits[1]="Banana";
        fruits[2]="Papaya";

        for(int i=0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }

        int[][] matrix=new int[2][2];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[1][0]=3;
        matrix[1][1]=4;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}