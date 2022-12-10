import java.util.ArrayList;


public class Jogador {
    public int pontos = 0;

    ArrayList<Carta> CartasdoJogador = new ArrayList<Carta>();
    ArrayList<Carta> CartasPartida = new ArrayList<Carta>();

    public void PegarCartaBaralho(ArrayList<Carta> Baralho){

        int Number = (int) (Math.random() * Baralho.size()-1 - 0 + 1) + 0;
        
        Carta Carta = Baralho.get(Number);
        
        CartasdoJogador.add(Carta);
        Baralho.remove(Carta);
    }

    public Carta ColocarCartaPartida(ArrayList<Carta> cartasPartida, Carta Trufo){
        
        int Number = (int) (Math.random() * CartasdoJogador.size()-1 - 0 + 1) + 0;
        
        Carta Carta = CartasdoJogador().get(Number);
                
        //Verificando se saiu o 7 do mesmo nipe na partida.
        if(Carta.Face == "As" && Carta.PegarNipe() == Trufo.PegarNipe()){
            for(int i = 0; i<CartasdoJogador.size()-1; i++){
                if(CartasdoJogador().get(i).PegarFace() == "7" && Carta.PegarNipe() == Trufo.PegarNipe()){
                    cartasPartida.add(Carta);
                    CartasdoJogador.remove(Carta);
                }else{
                    ColocarCartaPartida(cartasPartida, Trufo);
                };
            }
        }
        
        //Colocar carta na partida utilizando a referência.

        cartasPartida.add(Carta);
        CartasPartida.add(Carta);

        //Remover carta da partida utilizando a referência.
        CartasdoJogador().remove(Carta);

        return Carta;
    }


    public void PegarCartadaPartida(ArrayList<Carta> cartasPartida2,Carta trunfo) {
        
    }


    public int QuantidadedePontos(){
        for(int i = 0; i<CartasPartida.size()-1; i++){
            this.pontos += CartasPartida.get(i).PegarPeso();
        }
        return this.pontos;
    }


    public int QuantidadeDeCartas(){
        return CartasdoJogador.size();
    }


    public ArrayList<Carta> CartasdoJogador(){
        return CartasdoJogador;
    }

    public ArrayList<Carta> CartasPartida(){
        return CartasPartida;
    }

}
