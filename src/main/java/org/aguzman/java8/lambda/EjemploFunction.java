package org.aguzman.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

    public static void main(String[] args) {
        Function<String, String> f1 = param -> "Hola que tal! " +  param;
        String resultado = f1.apply("Saul");
        System.out.println(resultado);

        Function<String, String> f2 = String :: toUpperCase;
        System.out.println(f2.apply("Saul"));

        BiFunction<String, String, String> f3 = (a, b) ->  a.concat(b).toUpperCase();

        System.out.println(f3.apply("Hola ", "Saul Salguero"));

        BiFunction<String, String, Integer> f4 = String::compareTo;
        System.out.println(f4.apply("Saul", "Saul 1"));

        BiFunction<String, String, String> f5 = String :: concat;
        System.out.println(f5.apply("Saul ", "Saul 1"));
    }
}
