/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author BARRIENTOS LOPEZ
 */
public class Factorial {

    public int calcula_factorial(double n) {
        int factorial = 1;
        for (int i = 1;i <= n;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
