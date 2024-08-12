package be.digitalcity.demo.java.demo.bonus;

import be.digitalcity.demo.java.oo.HeritageOOP.Vehicule;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoReflection {
    public static void main(String[] args) {

        Class<Vehicule> clazz = Vehicule.class;

        for (Method method : clazz.getMethods()) {
            System.out.println( method.getName() );
        }

        for (Field field : clazz.getFields()) {
            System.out.println( field.getName() );
        }

    }
}
