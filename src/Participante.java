public class Participante {
    private String nome;
    private int idade;
    private double progresso;

    public Participante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.progresso = 0.0;
    }

    public void atualizarProgresso(double progresso) {
        this.progresso = progresso;
    }

    // Getters e Setters
}
