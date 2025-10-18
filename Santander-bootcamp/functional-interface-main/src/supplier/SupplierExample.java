package supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornercer novo objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {
        
        // Usar Supplier com expressão Lambda para fornercer uma saudação personalizada.
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo!";

        // Usar Supplier para obter uma lista de 5 saudações.
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo!")
        .limit(5)
        .collect(Collectors.toList());

        // Imprimir as saudacoes geradas.
        listaSaudacoes.forEach(System.out::println);
    }
}
