// // Classe Tarefa
// public class Tarefa {
//     private String titulo;
//     private String descricao;
//     private String prazo;
//     private int prioridade;
//     private Categoria categoria;

//     // Construtor
//     public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
//         this.titulo = titulo;
//         this.descricao = descricao;
//         this.prazo = prazo;
//         this.prioridade = prioridade;
//     }

//     // Métodos get e set
//     public String getTitulo() {
//         return titulo;
//     }

//     public void setTitulo(String titulo) {
//         this.titulo = titulo;
//     }

//     public String getDescricao() {
//         return descricao;
//     }

//     public void setDescricao(String descricao) {
//         this.descricao = descricao;
//     }

//     public String getPrazo() {
//         return prazo;
//     }

//     public void setPrazo(String prazo) {
//         this.prazo = prazo;
//     }

//     public int getPrioridade() {
//         return prioridade;
//     }

//     public void setPrioridade(int prioridade) {
//         this.prioridade = prioridade;
//     }

//     public Categoria getCategoria() {
//         return categoria;
//     }

//     public void setCategoria(Categoria categoria) {
//         this.categoria = categoria;
//     }

//     // Método para exibir detalhes da tarefa
//     public void exibirDetalhes() {
//         System.out.println("Título: " + titulo);
//         System.out.println("Descrição: " + descricao);
//         System.out.println("Prazo: " + prazo);
//         System.out.println("Prioridade: " + prioridade);
//         if (categoria != null) {
//             System.out.println("Categoria: " + categoria.getNome());
//         }
//     }
// }

// // Classe Categoria
// public class Categoria {
//     private String nome;

//     // Construtor
//     public Categoria(String nome) {
//         this.nome = nome;
//     }

//     // Métodos get e set
//     public String getNome() {
//         return nome;
//     }

//     public void setNome(String nome) {
//         this.nome = nome;
//     }
// }

// // Classe principal para testar
// public class Main {
//     public static void main(String[] args) {
//         // Criando uma instância de Tarefa
//         Tarefa tarefa = new Tarefa("Estudar Java", "Completar os exercícios de POO", "2024-09-01", 1);

//         // Modificando o título da tarefa
//         tarefa.setTitulo("Estudar Java Avançado");

//         // Exibindo o novo título
//         System.out.println("Novo Título: " + tarefa.getTitulo());

//         // Criando uma instância de Categoria
//         Categoria categoria = new Categoria("Estudos");

//         // Associando a categoria à tarefa
//         tarefa.setCategoria(categoria);

//         // Exibindo os detalhes da tarefa
//         tarefa.exibirDetalhes();
//     }
// }

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
