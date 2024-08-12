package be.digitalcity.demo.java.oo.exo8;


@FunctionalInterface  // indique que l'interface est une fonctionnelle, qui n'accepte qu'une seule méthode abstraite
// Cela permet d'utiliser une lambda expression pour déclarer une méthode abstraite dans une interface.
public interface ActionVoiture<T> {

    void execute(T t);
    
}
