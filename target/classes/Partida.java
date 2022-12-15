package main.resources
import java.util.ArrayList;

public class Partida {
    Carta Trunfo;
    ArrayList<Carta> CartasPartida = new ArrayList<Carta>();  
    
    public Partida(Baralho Baralho, Bisca BiscaGame, Jogador Jogador1, Jogador Jogador2, Regras Regras){
    
        //Condicional para pegar trunfo, considerando que seja diferente de As e 7.
        this.Trunfo = BiscaGame.PegarTrunfo(Baralho.Baralho);

        if(this.Trunfo.Face=="As" || this.Trunfo.Face == "7"){
            while(this.Trunfo.Face == "As" || this.Trunfo.Face == "7"){
             this.Trunfo = BiscaGame.PegarTrunfo(Baralho.Baralho);
            }
        }
        
        if(!(this.Trunfo.Face=="As" || this.Trunfo.Face == "7")){
            Baralho.Baralho.remove(this.Trunfo);
        }
    
        System.out.println("Trunfo: "+this.Trunfo);


        System.out.println(Baralho.PegarTamanhoBaralho());


        //DISTRIBUIÇÃO INICIAL DE CARTAS
        BiscaGame.DistribuirCartas(Baralho, Jogador2);
        BiscaGame.DistribuirCartas(Baralho, Jogador1);

        //Operação responsável por colocar a carta na mesa e tirar e alterar de acordo com quem ganhar.
        BiscaGame.Cartiador(Baralho, Jogador1, Jogador2, Regras, Trunfo, CartasPartida);
    }
    
    

}
