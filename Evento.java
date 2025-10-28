
import java.time.LocalDateTime;

public class Evento {

    private String nome;
    private String local;
    private LocalDateTime dataHora;
    private Integer capacidadeMaxima;
    private Integer ingressosVendidos;

    public Evento(String nome, String local, LocalDateTime dataHora, Integer capacidadeMaxima,
            Integer ingressosVendidos) {
        this.nome = nome;
        this.local = local;
        this.dataHora = dataHora;
        this.capacidadeMaxima = capacidadeMaxima;
        this.ingressosVendidos = ingressosVendidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Integer getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(Integer capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Integer getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(Integer ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public void venderIngresso(int quantidade) {
        this.ingressosVendidos += quantidade;
    }

    public void verificarDisponibilidade() {
        IO.println("N° de ingressos vendidos: " + (this.capacidadeMaxima - this.ingressosVendidos));
    }

}
