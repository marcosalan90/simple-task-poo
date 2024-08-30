class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    // Construtor
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    // Construtor
    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.descricao = "";
        this.prazo = "";
        this.prioridade = 0;
    }

    // Métodos get
    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getPrazo() {
        return this.prazo;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    // Métodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    // Método para obter descrição completa
    public String getDescricaoCompleta() {
        return "Título: " + this.titulo + "\n" +
               "Descrição: " + this.descricao + "\n" +
               "Prazo: " + this.prazo + "\n" +
               "Prioridade: " + this.prioridade;
    }
}

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudos poo", "revisar os conceitos de classes e objetos", "03-09-2024", 1);
        System.out.println(tarefa1.getDescricaoCompleta());
    }
}
