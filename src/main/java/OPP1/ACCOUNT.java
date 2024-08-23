/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP1;

/**
 *
 * @author Administrator
 */
public class ACCOUNT {
    private String id;
    private String name;
    private int balance;
     
    public ACCOUNT(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public void credit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Nạp tiền thành công! Số dư hiện tại: " + this.balance);
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0.");
        }
    }

    public void debit(int amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Thanh toán thành công! Số dư hiện tại: " + this.balance);
            } else {
                System.out.println("Thanh toán không thành công! Số tiền trong tài khoản không đủ.");
            }
        } else {
            System.out.println("Số tiền thanh toán phải lớn hơn 0.");
        }
    }

    public void transferTo(ACCOUNT account, int amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                account.balance += amount;
                System.out.println("Chuyển tiền thành công! Số dư hiện tại của " + this.name + ": " + this.balance);
                System.out.println("Số dư hiện tại của " + account.name + ": " + account.balance);
            } else {
                System.out.println("Chuyển tiền không thành công! Số tiền trong tài khoản không đủ.");
            }
        } else {
            System.out.println("Số tiền chuyển phải lớn hơn 0.");
        }
    }
    public void showInfo() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Balance: " + this.balance);
    }
}
