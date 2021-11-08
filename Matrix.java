class Main {
    public static int N = 3;
    public static void main(String [] args) {

        int [][] A = new int [N][N];
        int [][] B = new int [N][N];
        int [][] C = new int [N][N];

        System.out.println(" Матрица A:");
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                A[i][j] = (int) (Math.random() * 20 + 1);
                System.out.print(" " + A[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n Матрица B:");
        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B[i].length; j++) {
                B[i][j] = (int) (Math.random() * 20 + 1);
                System.out.print(" " + B[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n Сложение");
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(" " + C[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n Умножение");
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] * B[i][j];
                System.out.print(" " + C[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n Вычитание");
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] - B[i][j];
                System.out.print(" " + C[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n Деление ");
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] / B[i][j];
                System.out.print(" " + C[i][j]);
            }
            System.out.println();
        }
    }
}
