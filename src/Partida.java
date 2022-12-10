import java.util.ArrayList;

public class Partida {
    Carta Trufo;

    ArrayList<Carta> CartasPartida = new ArrayList<Carta>();  
    
    public Partida(Baralho Baralho, Bisca BiscaGame, Jogador Jogador1, Jogador Jogador2){
    

        this.Trufo = BiscaGame.PegarTrunfo(Baralho.Baralho);

        System.out.println("Trunfo: "+Trufo);
        // System.out.println(BiscaGame.Trunfo);
        // System.out.println(BaralhoBisca.GetTamanhoBaralho());

        BiscaGame.DistribuirCartas(Baralho, Jogador2);
        BiscaGame.DistribuirCartas(Baralho, Jogador1);

        
        System.out.println("Jogador1 "+Jogador1.CartasdoJogador.toString()); 
        System.out.println("Jogador2 "+Jogador2.CartasdoJogador.toString()); 

        Jogador1.ColocarCartaPartida(CartasPartida, Trufo);
        Jogador2.ColocarCartaPartida(CartasPartida, Trufo);
        
        Jogador1.PegarCartadaPartida(CartasPartida,Trufo);
        System.out.println(CartasPartida.toString());
    
    
        // System.out.println(Jogador1.QuantidadedePontos());
        
        // System.out.println(Baralho.Baralho.toString());
    }

}
