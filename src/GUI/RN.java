/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.Random;

/**
 *
 * @author Dilshan Shanaka
 */
public class RN {
    public static int Rn() {
        Random random = new Random();
        return random.nextInt(255);
    }
}

