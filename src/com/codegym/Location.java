package com.codegym;

public class Location {
    private int col, row;
    public double maxValue;

    public Location() {
        this.col = 0;
        this.row = 0;
    }

    public Location(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public static Location locateLargest(double[][] arr){
        double max = arr[0][0];
        int row = 0, col = 0;
        Location l = new Location();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        l.setRow(row);
        l.setCol(col);
        l.maxValue = max;
        return l;
    }

    public void display(){
        System.out.printf("The location of the largest element is %e at (%d,%d)",this.maxValue,this.row,this.col);
    }

}

