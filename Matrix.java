import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matrix Mat1 = new Matrix(3, 3);
        Mat1.plus();
        Mat1.minus();
        Mat1.multiply();
        Mat1.division();
        Mat1.multiply_on_num();
        Mat1.square_matrix();

    }
}

class Matrix {
    int columns;
    int lines;
    int num;
    int [][] A;
    int [][] B;
    int [][] C;



    public Matrix(int columns, int lines){

        System.out.println("На что умножить матрицу A? ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        this.columns = columns;
        this.lines = lines;
        this.num = num;
        this.A = new int [3][3];
        this.B = new int [3][3];
        this.C = new int [3][3];

        System.out.println("A -------------");
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                A[i][j] = (int) (Math.random() * 20 + 1);
                System.out.print(" " + A[i][j]);
            }
            System.out.println();
        }
        System.out.println("B -------------");
        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B[i].length; j++) {
                B[i][j] = (int) (Math.random() * 20 + 1);
                System.out.print(" " + B[i][j]);
            }
            System.out.println();
        }
    }
    void plus() {
        System.out.println("Plus -------------");
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(" " + C[i][j]);
            }
            System.out.println();

        }
    }
    void minus() {
        System.out.println("Minus -------------");
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] - B[i][j];
                System.out.print(" " + C[i][j]);
            }
            System.out.println();

        }
    }
    void multiply() {
        System.out.println("Multiply -------------");
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] * B[i][j];
                System.out.print(" " + C[i][j]);
            }
            System.out.println();

        }
    }
    void multiply_on_num() {
        System.out.println("Multiply on num -------------");
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] * num;
                System.out.print(" " + C[i][j]);
            }
            System.out.println();

        }
    }
    void division(){
        System.out.println("Division -------------");
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] / B[i][j];
                System.out.print(" " + C[i][j]);
            }
            System.out.println();

        }
    }

    void square_matrix() {
        class square_matrix extends Matrix{

            public square_matrix(int columns, int lines) {
                super(columns, lines);
                this.columns = 3;
                this.lines = 3;

                System.out.println("Square Matrix Random -------------");
                for(int i = 0; i < A.length; i++) {
                    for(int j = 0; j < A[i].length; j++) {
                        A[i][j] = (int) (Math.random() * 20 + 1);
                        System.out.print(" " + A[i][j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
