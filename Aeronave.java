package aeroporto;

import java.util.Random;

public class Aeronave extends Thread {
    private String nome;
    private String pista;
    private View view;
    
    public Aeronave(String nome, String pista, View view) {
        this.nome = nome;
        this.pista = pista;
        this.view = view;
    }

    // Método para simular as fases de decolagem
    public void decolar() throws InterruptedException {
        Random random = new Random();

        // Fase de manobra
        int tempoManobra = 300 + random.nextInt(400); // 300 a 700 ms
        view.exibirFase(nome, "Manobra", tempoManobra);
        Thread.sleep(tempoManobra);

        // Fase de taxiar
        int tempoTaxiar = 500 + random.nextInt(500); // 500 a 1000 ms
        view.exibirFase(nome, "Taxiar", tempoTaxiar);
        Thread.sleep(tempoTaxiar);

        // Fase de decolagem
        int tempoDecolagem = 600 + random.nextInt(200); // 600 a 800 ms
        view.exibirFase(nome, "Decolagem", tempoDecolagem);
        Thread.sleep(tempoDecolagem);

        // Fase de afastamento
        int tempoAfastamento = 300 + random.nextInt(500); // 300 a 800 ms
        view.exibirFase(nome, "Afastamento", tempoAfastamento);
        Thread.sleep(tempoAfastamento);

        view.exibirConclusao(nome, pista);
    }

    @Override
    public void run() {
        try {
            decolar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getPista() {
        return pista;
    }
}
