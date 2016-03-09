package Leetcode;

import java.util.*;

/**
 * Created by csj on 2016/3/5.
 */
public class Rotate {
    protected void Solution(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return;
        //上下交换
        int[] temp;
        int length = matrix.length;
        for (int i = 0; i < matrix.length / 2; i++) {

            temp = matrix[i];
            matrix[i] = matrix[length-i-1];
            matrix[length-i-1] = temp;

        }
        //交换对称的
        int swap;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j <length; j++) {
                swap = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=swap;
            }
        }
    }
    public static void main(String[] args) {
        int[][] test = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Rotate r = new Rotate();
        r.Solution(test);
    }
}