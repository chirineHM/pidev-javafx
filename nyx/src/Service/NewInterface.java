/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import java.util.List;

/**
 *
 * @author hmida
 */
public interface NewInterface <T> {
  public void ajouter(T t);  
  public List<T> afficher();
  public void supprimer(int t);
}
