/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasSQA;

/**
 *
 * @author HP
 */
public class BankAccount {
    private double saldo;

    public BankAccount(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public void deposit(double jumlah) {
        saldo += jumlah;
    }

    public void withdraw(double jumlah) {
        if (jumlah > saldo) {
            throw new ArithmeticException("Saldo tidak cukup"); 
        }
        saldo -= jumlah;
    }

    public double getSaldo() {
        return saldo;
    }
}