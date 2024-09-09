import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private List<Participante> participantes;
    private List<Modulo> modulos;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.participantes = new ArrayList<>();
        this.modulos = new ArrayList<>();
    }

    public void adicionarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void adicionarModulo(Modulo modulo) {
        modulos.add(modulo);
    }

    // Getters e Setters
}
