package aeroporto;

public class Main {
    public static void main(String[] args) {
        View view = new View();  // Cria a view para exibir as informações
        Aeroporto aeroporto = new Aeroporto();  // Cria o aeroporto que controla as pistas
        aeroporto.iniciar(view);  // Inicia o ciclo de decolagens
    }
}
