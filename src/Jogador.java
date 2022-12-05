import java.util.ArrayList;


public class Jogador {
    public int pontos;

    ArrayList<Carta> Cartas = new ArrayList<Carta>();

    public void PegarCartaBaralho(ArrayList<Carta> Baralho){

        int Number = (int) (Math.random() * Baralho.size() - 0 + 1) + 0;
        
        Carta Carta = Baralho.get(Number);

        Cartas.add(Carta);
        Baralho.remove(Carta);
    }


    public int QuantidadeDeCartas(){
        return Cartas.size();
    }

    public ArrayList<Carta> Cartas(){
        return Cartas;
    }

}
