/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

/**
 *
 * @author Nazarov
 */

// --- интервейс наблюдателя ---
public interface Observer{
    void updateDate(int min, int max, int value);
}
