/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ChuongTrinhChayThu{
    public static void chuongtrinhchaythu(String[] args) {
        
        Rectangle rect1 = new Rectangle();
        System.out.println("hinh chu nhat thu 2 (thong tin mac dinh):");
        rect1.showInfo();

     
        Scanner sr = new Scanner(System.in);
        System.out.println("nhap thong tin hinh chu nhat thu 2:");

        System.out.print(" nhap chieu cao: ");
        double length = sr.nextDouble();

        System.out.print("nhap chieu rong: ");
        double width = sr.nextDouble();

        
        Rectangle rect2 = new Rectangle(length, width);
        System.out.println("hinh chu nhat thu 2:");
        rect2.showInfo();

        sr.close();
    }
}

