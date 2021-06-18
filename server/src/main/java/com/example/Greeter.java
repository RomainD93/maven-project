/**
 * This module is about impact of the final keyword on performance
 * <p>
 * This module explores  if there are any performance benefits from
 * using the final keyword in our code. This module examines the performance
 * implications of using final on a variable, method, and class level.
 * </p>
 *
 * @since 1.0
 * @author baeldung
 * @version 1.1
 */
package com.example;

 /**
  * Résumé du rôle de la classe.
  */
public class Greeter {

 /**
 * Constructeur.
 */
  public Greeter() {
  }

 /**
  * Résumé du rôle de la méthode.
  * Commentaires détaillés sur le role de la methode
  * @param someone la valeur a traiter
  * @return la valeur calculée
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
