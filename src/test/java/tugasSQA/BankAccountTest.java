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
        assertEquals(1500, account.getSaldo()); 
    }

    @Test
    void testWithdrawBerhasil() {
        BankAccount account = new BankAccount(1000);
        account.withdraw(400);
        assertEquals(600, account.getSaldo()); 
    }

    @Test
    void testWithdrawGagal() {
        BankAccount account = new BankAccount(100);
        assertThrows(ArithmeticException.class, () -> {
            account.withdraw(500);
        });
    }
}
