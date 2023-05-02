package SimpleArray;

import javax.swing.*;

public class DoubleArray {
    public static void main(String[] args) {
        // размер массива
        int n, m;
        // текст диалогового окна
        String text = "Two-dimensional array of random numbers";
        // считываение размера массива
        n = Integer.parseInt(JOptionPane.showInputDialog("Rows in an array"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Columns in an array"));
        // создаем массив
        int[][] numb = new int[n][m];
        // заполняем массив случайными числами
        for (int i = 0; i < n; i++) {
            text += "\n";
            for (int j = 0; j < m; j++) {
                numb[i][j] = (int) (10 * Math.random());
                text += numb[i][j] + " ";
            }
            // вывод диалогово окна с рандомными числами
            JOptionPane.showMessageDialog(null,text);
        }

        int[] nums = {1, 3, 5, 7};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        double[][] x = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print((int)x[i][j] + " ");
            }
        }
        char[][] symbs = {{'a'}, {'b', 'c'}, {'d', 'e', 'f'}};

    }

}
