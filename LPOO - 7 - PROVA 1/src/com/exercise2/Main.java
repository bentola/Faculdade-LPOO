package com.exercise2;

import java.util.*;

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] mat=new int[n][m];
        int[][] t=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }    
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                t[j][i]=mat[i][j];
            }    
        }
        int soma=0;
        for(int i=0;i<m;i++){
            soma+=mat[x][i];
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%3d ",t[i][j]);
            }    
            System.out.print("\n");
        }
        float media=(float)soma/m;
        System.out.printf("Media=%.1f\n",media);
    }
}