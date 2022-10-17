package com.microsservico.consumidorestoque.consumer;

import org.librabbitmq.constantes.RabbitMQConstantes;
import org.librabbitmq.dto.EstoqueDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EstoqueConsumer {

    @RabbitListener(queues = RabbitMQConstantes.FILA_ESTOQUE)
    private void consumidor(EstoqueDTO estoqueDTO) throws InterruptedException {
        System.out.println("Escutando fila de estoque");
        System.out.println(estoqueDTO.codigoProduto);
        System.out.println(estoqueDTO.quantidade);
        System.out.println("--------------------------------");

        // Thread.sleep(12000);

        //throw new IllegalArgumentException("Argumento inválido!");
    }

}
