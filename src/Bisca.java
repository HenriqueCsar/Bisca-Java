import java.util.ArrayList;

// import java.util.ArrayList;

public class Bisca {
    Carta Trunfo;
    /*Metodo Regras do jogo*/
    

    public Carta PegarTrunfo(ArrayList<Carta> Baralho){

        int Number = (int) (Math.random() * Baralho.size() - 0 + 1) + 0;
        
        Carta Carta = Baralho.get(Number);
        if(!(Carta.GetFace()=="As" || Carta.GetFace() == "7")){
            System.out.println("- Trunfo Válido - "+Carta.toString());
            Baralho.remove(Number);
        }else{
            System.out.println(" - Trunfo inválido - Face: " + Carta.GetFace());
            PegarTrunfo(Baralho);
        }
    
        return Carta;
    
    }

    
    // public Carta PegarCarta(ArrayList<Carta> Baralho){

    //     int Number = (int) (Math.random() * Baralho.size() - 0 + 1) + 0;
        
    //     Carta Carta = Baralho.get(Number);
    
    //     return Carta;
    
    // }



}
