package clases;

/**
 * @author jh3ys0n
 */
public class Main {

    public static void main(String[] args) {

        String[] argsAgent = {"-gui", "Agente-I:clases.Agente_I; Agente-B:clases.Agente_B"};
        jade.Boot.main(argsAgent);
    }

}
