import java.util.ArrayList;

// import java.util.ArrayList;

public class Bisca {
    Carta Trunfo;
    /*Metodo Regras do jogo*/
    

    public Carta PegarTrunfo(ArrayList<Carta> baralho){

        int Number = (int) (Math.random() * baralho.size() - 0 + 1) + 0;
        
        Carta Carta = baralho.get(Number);
        if(!(Carta.GetFace()=="As" || Carta.GetFace() == "7")){
            System.out.println("- Trunfo Válido - "+Carta.toString());
            baralho.remove(Number);
        }else{
            System.out.println(" - Trunfo inválido - Face: " + Carta.GetFace());
            PegarTrunfo(baralho);
        }
    
        return Carta;
    
    }

    public void DistribuirCartas(Baralho baralho, Jogador Jogador){
        for(int i = 0; i < 3; i++){
           Jogador.PegarCartaBaralho(baralho.Baralho);
        }
    }

    
    // public Carta PegarCarta(ArrayList<Carta> Baralho){

    //     int Number = (int) (Math.random() * Baralho.size() - 0 + 1) + 0;
        
    //     Carta Carta = Baralho.get(Number);
    
    //     return Carta;
    
    // }



}
