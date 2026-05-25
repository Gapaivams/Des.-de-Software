package Exer4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transportavel> veiculos = new ArrayList<>();

        veiculos.add(new Caminhao());
        veiculos.add(new MotoEntrega());
        veiculos.add(new DroneEntrega());

        for (Transportavel i : veiculos) {
            i.realizarEntrega();
        }
    }
}
