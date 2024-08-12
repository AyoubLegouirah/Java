package be.digitalcity.demo.java.demo.DemoStatic;
import java.util.ArrayList;
import java.util.List;



// Importation du sous-package MathUtils.Subclass pour pouvoir utiliser la methode addition directement

public class DemoStatic {

    public static void main(String[] args) {

//        MathUtils.addition(4,2);
//        addition(4,3);
//        division(5,6);
        List<Dwarf> dwarfs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dwarfs.add(new Dwarf("Dwarf " + i));
        }

        dwarfs.forEach(System.out::println);

        Dwarf.talk();
    }
}
