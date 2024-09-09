public class Main {
    public static void main(String[] args) {
        // Criar um bootcamp
        Bootcamp bootcamp = new Bootcamp("Java Avançado");

        // Criar participantes
        Participante participante1 = new Participante("Ana", 25);
        Participante participante2 = new Participante("Carlos", 30);

        // Adicionar participantes ao bootcamp
        bootcamp.adicionarParticipante(participante1);
        bootcamp.adicionarParticipante(participante2);

        // Criar módulos
        Modulo modulo1 = new Modulo("Introdução ao Java", "Fundamentos básicos de Java.");
        Modulo modulo2 = new Modulo("Programação Orientada a Objetos", "Conceitos avançados de OO em Java.");

        // Adicionar módulos ao bootcamp
        bootcamp.adicionarModulo(modulo1);
        bootcamp.adicionarModulo(modulo2);

        // Atualizar progresso dos participantes
        participante1.atualizarProgresso(50.0); // 50% concluído
        participante2.atualizarProgresso(75.0); // 75% concluído

        // Saída para verificação
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Participantes:");
        for (Participante p : bootcamp.getParticipantes()) {
            System.out.println("- " + p.getNome() + " (Progresso: " + p.getProgresso() + "%)");
        }
        System.out.println("Módulos:");
        for (Modulo m : bootcamp.getModulos()) {
            System.out.println("- " + m.getNome() + ": " + m.getDescricao());
        }
    }
}
