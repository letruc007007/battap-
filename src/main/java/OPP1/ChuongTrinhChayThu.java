/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP1;

import java.text.DecimalFormat;

/**
 *
 * @author Administrator
 */
public class ChuongTrinhChayThu {
    public static void main(String[] args) {
        ACCOUNT myAccount = new  ACCOUNT("A001", "vu van lam", 1000000000);
        ACCOUNT  friendAccount = new ACCOUNT ("A002", "pham a lu", 0);

        DecimalFormat fmt = new DecimalFormat("#,##0.000");
        System.out.println("Thông tin tài khoản ban đầu:");
        myAccount.showInfo();
        friendAccount.showInfo();

        System.out.println("\nThực hiện các giao dịch:");

        myAccount.credit(200);

        friendAccount.debit(100);

        myAccount.transferTo(friendAccount, 300);

        System.out.println("\nThông tin tài khoản sau giao dịch:");
        myAccount.showInfo();
        friendAccount.showInfo();
    }
}
