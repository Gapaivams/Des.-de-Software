package Exer3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Inteligente> aparelhos = new ArrayList<>();

        aparelhos.add(new Alexa());
        aparelhos.add(new LampadaInteligente());
        aparelhos.add(new ArCondicionado());

        for (Inteligente i : aparelhos) {
            i.executarAcao();
        }
    }
}
