package clases;

/**
 * @author jh3ys0n
 */
public class Main {

    public static void main(String[] args) {
        RecursosAprendizaje ra = new RecursosAprendizaje();
        String[] argsAgent = {"-gui", "Agente-I:agentes.Agente_I; Agente-B:agentes.Agente_B; Agente-RS:agentes.Agente_RS"};
        jade.Boot.main(argsAgent);
    }
}
