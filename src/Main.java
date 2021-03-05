import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //10. Найти положительные элементы главной диагонали квадратной матрицы.
        int[][] m = new int[5][5];
        Random rd = new Random();
        System.out.println("Исходная матрица:");
        for (int i = 0; i < 5; i ++) {
            for (int j = 0; j < 5; j ++) {
                m[i][j] = rd.nextInt(10) - 5;
                System.out.printf("%3d", m[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Положительные элементы главной диагонали:");
        for (int i = 0, j = 0; i < 5; i ++, j ++) {
            if(m[i][j] > 0) System.out.print(m[i][j] + " ");
        }
    }
}
