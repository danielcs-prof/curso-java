package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamBuild {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        Consumer<Integer> printI = System.out::println;

        Stream<String > langs = Stream.of("Java","Lua","JS");
        langs.forEach(print);

        String [] maisLangs = {"Python ", "Lisp ", "Go\n"};
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs,1,3).forEach(print);

        List<String> outrasLangs = Arrays.asList("C", "C++", "PHP", "Kotlin\n");
        outrasLangs.parallelStream().forEach(print);

        Stream.generate( () -> "a").forEach(print);
        Stream.iterate(0, n ->+1).forEach(printI);


    }
}
