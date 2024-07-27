package food.techchallenge.api.domain.webhook;


public class WebhookPayload {
    private String status;
    private Long idPedido;

   
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

}
