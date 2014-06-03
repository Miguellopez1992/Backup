/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup.interfaces;

/**
 *
 * @author Miguel L
 */
public interface RWSetting <T>{
    
    public boolean save(T obj);
    
    public T getSetting();
    
}
