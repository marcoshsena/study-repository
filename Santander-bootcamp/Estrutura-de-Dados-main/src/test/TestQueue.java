package test;


import main.java.dataStructure.Queue;

import java.util.Random;

public class TestQueue {

    public static void main(String[] args) {
        int n = 5;
        var random = new Random();
        int cliente = random.nextInt(101);
        Queue queue = new Queue(cliente);
        System.out.println("Chegou o cliente " + cliente);
        for(int i = 2; i <= n; i++){
            cliente = random.nextInt(101);
            System.out.println("Chegou o clieente: " + cliente);
            queue.enqueue(cliente);
        }
        // Atendimento dos clientes
        var node = queue.dequeue();
        while (node != null) {
            System.out.println("Atnedido o clieent: " + node.getValue());
            node = queue.dequeue();
        }
    }
}
