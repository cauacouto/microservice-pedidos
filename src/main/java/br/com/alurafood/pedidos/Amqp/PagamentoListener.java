package br.com.alurafood.pedidos.Amqp;

import br.com.alurafood.pedidos.dto.PagamentoDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PagamentoListener {


    @RabbitListener(queues = "pagamentos.detalhes-pedido")
    public void recebeMesagem(@Payload PagamentoDto pagamento){

        String mensagem = """
           Dados do pagamento: %s
           Número do pedido: %s
           Valor R$: %s
           Status: %s 
                """.formatted(pagamento.getId(),pagamento.getPedidoId(),pagamento.getValor(),pagamento.getStatus());
        System.out.println("recebi a mensagem" + mensagem);
    }
}
