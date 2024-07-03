package com.csi.service;

public class ApplicationSevice {
    public static void main(String[] args) {
        ApplicationSevice sevice = new ApplicationSevice();
        System.out.println("Addition Result:" + sevice.add(10, 20));
        System.out.println("Substraction Result:" + sevice.sub(12, 10));
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

}
