public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private String prioridade;

    public Tarefa(String titulo, String descricao, String prazo, String prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

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

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar Java", "Completar o curso de Java", "2024-09-30", "Alta");

        // Modificar o título
        tarefa1.setTitulo("Estudar Java Avançado");

        // Acessar o novo título
        System.out.println(tarefa1.getTitulo());  // Saída: Estudar Java Avançado
    }
}


public class Tarefa {
    // ... (outros métodos)

    public String exibirDetalhes() {
        return "Título: " + titulo + "\nDescrição: " + descricao + "\nPrazo: " + prazo + "\nPrioridade: " + prioridade;
    }
}

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar Java", "Completar o curso de Java", "2024-09-30", "Alta");
        System.out.println(tarefa1.exibirDetalhes());
    }
}


public class Categoria {
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private String prioridade;
    private Categoria categoria;

    public Tarefa(String titulo, String descricao, String prazo, String prioridade, Categoria categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
        this.categoria = categoria;
    }

    // ... (outros métodos)

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

// public class Main {
public class Main {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria("Estudos");
        Tarefa tarefa1 = new Tarefa("Estudar Java", "Completar o curso de Java", "2024-09-30", "Alta", categoria1);

        System.out.println(tarefa1.getCategoria().getNome());  // Saída: Estudos
    }
}
