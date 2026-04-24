/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasSQA;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author HP
 */
public class BankAccountTest {
    
    @Test
    void testDepositBerhasil() {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        assertEquals(1500, account.getSaldo()); // Memastikan saldo bertambah [cite: 98]
    }

    @Test
    void testWithdrawBerhasil() {
        BankAccount account = new BankAccount(1000);
        account.withdraw(400);
        assertEquals(600, account.getSaldo()); // Memastikan saldo berkurang [cite: 99]
    }

    @Test
    void testWithdrawGagal() {
        BankAccount account = new BankAccount(100);
        // Memastikan exception muncul saat saldo tidak cukup [cite: 96, 100]
        assertThrows(ArithmeticException.class, () -> {
            account.withdraw(500);
        });
    }
}
