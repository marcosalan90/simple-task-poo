public class Tarefa {
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

    // Métodos get e set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    // Método para exibir detalhes da tarefa
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazo);
        System.out.println("Prioridade: " + prioridade);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Tarefa
        Tarefa tarefa = new Tarefa("Estudar Java", "Completar os exercícios de POO", "2024-09-01", 1);

        // Modificando o título da tarefa
        tarefa.setTitulo("Estudar Java Avançado");

        // Exibindo o novo título
        System.out.println("Novo Título: " + tarefa.getTitulo());

        // Exibindo todos os detalhes da tarefa
        tarefa.exibirDetalhes();
    }
}

//marcos alan braga de moura 04172381
//breno coqueiro monteiro de araujo 04172253