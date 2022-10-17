package com.microsservico.consumidorestoque.consumer;

import org.librabbitmq.constantes.RabbitMQConstantes;
import org.librabbitmq.dto.PrecoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PrecoConsumer {

    @RabbitListener(queues = RabbitMQConstantes.FILA_PRECO)
    public void consumidorPreco(PrecoDTO precoDTO) {
        System.out.println("Escutando fila de preço");
        System.out.println(precoDTO.codigoProduto);
        System.out.println(precoDTO.preco);
        System.out.println("----------------");
    }
}
