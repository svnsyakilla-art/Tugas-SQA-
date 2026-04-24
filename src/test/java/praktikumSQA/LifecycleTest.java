/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumSQA;

import org.junit.jupiter.api.*;
/**
 *
 * @author HP
 */
public class LifecycleTest {
    @BeforeEach
        void setUp() {
            System.out.println("Sebelum test");
        }
        @AfterEach
        void tearDown() {
            System.out.println("Setelah test");
        }
        @Test
        void test1() {
            System.out.println("Test 1");
        }
}
