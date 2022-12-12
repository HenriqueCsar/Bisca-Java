import java.util.ArrayList;

public class Regras {
    
    public boolean VerificarSeO7doTrunfoSaiu(ArrayList<Carta> cartasPartida, Carta Carta, Carta Trunfo, Jogador Jogador1, Jogador Jogador2){

        //Verificando se saiu o 7 do mesmo nipe do trunfo na partida.

        for(int i = 0; i<Jogador1.CartasGanhadasJogador.size()-1;i++){
            if(Jogador1.CartasGanhadasJogador().get(i).PegarFace() == "7" && Carta.PegarNipe() == Trunfo.PegarNipe()){
                return true;
            }
        }

        for(int i = 0; i<Jogador2.CartasGanhadasJogador.size()-1;i++){
            if(Jogador2.CartasGanhadasJogador().get(i).PegarFace() == "7" && Carta.PegarNipe() == Trunfo.PegarNipe()){
                return true;
            }
        }

        for(int i = 0; i<cartasPartida.size()-1;i++){
            if(cartasPartida.get(i).PegarFace() == "7" && Carta.PegarNipe() == Trunfo.PegarNipe()){
                return true;
            }
        }


            return false;
        }


    


    public void FimPartida(Carta trunfo, Jogador jogador1, Jogador jogador2){
        System.out.println("FIM DA PARTIDA ESTAMOS EM REGRAS");
        System.out.println(jogador2.CartasdoJogador.size());
        if(jogador2.CartasdoJogador.size()==0){
            if(trunfo.jogador == null){trunfo.jogador = jogador2;}
            jogador2.CartasdoJogador.add(trunfo);
        }else{
            if(jogador1.CartasdoJogador.size()==1){
                if(trunfo.jogador == null){trunfo.jogador = jogador1;}
                jogador1.CartasdoJogador.add(trunfo);
            }else{
                if(trunfo.jogador == null){trunfo.jogador = jogador2;}
                jogador2.CartasdoJogador.add(trunfo);
            }
        }
    }
}
