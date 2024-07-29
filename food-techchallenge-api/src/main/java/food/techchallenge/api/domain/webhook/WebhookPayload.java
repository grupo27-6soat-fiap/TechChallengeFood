package food.techchallenge.api.domain.webhook;


public class WebhookPayload {
    private String status;
    private Long idSistemaExterno;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Long getIdSistemaExterno() {
        return idSistemaExterno;
    }

    public void setIdSistemaExterno(Long idSistemaExterno) {
        this.idSistemaExterno = idSistemaExterno;
    }

}
