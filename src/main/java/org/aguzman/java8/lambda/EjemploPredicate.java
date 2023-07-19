package org.aguzman.java8.lambda;

import org.aguzman.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = valor -> valor > 10;
        System.out.println( predicate.test(15));

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3 = String :: equals;
        System.out.println(t3.test("Andres", "Andres"));

        BiPredicate<Integer, Integer> t4 = (i , j) -> i<j;

        System.out.println(t4.test(5, 23));

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a.setNombre("Maria");
        b.setNombre("Maria");

        BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(t5.test(a,b));

    }
}
