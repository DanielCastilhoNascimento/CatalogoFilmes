import java.time.LocalDate;

public class Filme {
    private String nome;
    private LocalDate dataLancamento;
    private double orcamento;
    private String descricao;

    public Filme(String nome, LocalDate dataLancamento, double orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void status()
    {
        System.out.println("\n\n**** Status do Filme ****  ");
        System.out.println("Nome do Filme:  " + this.nome);
        System.out.println("Data de Lançamento: " + this.dataLancamento);
        System.out.printf("Valor Orçamento do filme:  "+ this.orcamento);
    }

}


