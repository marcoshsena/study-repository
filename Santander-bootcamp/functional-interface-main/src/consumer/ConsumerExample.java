package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* 
 * Representa uma ordenação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos dos Streams sem modificar, ou retornar um valor.
 */

public class ConsumerExample {
    public static void main(String[] args) {
        // Criar lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar Consumer com expressão Lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir os números pares no Stream
        numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
    }
    
}
