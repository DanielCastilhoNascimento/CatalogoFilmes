public class Ator {
    private String nome;
    private String nacionalidade;
    private String premiacoes;

    public Ator(String nome, String nacionalidade, String premiacoes) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.premiacoes = premiacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes) {
        this.premiacoes = premiacoes;
    }
}