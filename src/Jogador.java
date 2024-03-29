import java.util.ArrayList;


public class Jogador {
    public int id=0;
    public int pontos = 0;
    static Jogador Ganhador;

    ArrayList<Carta> CartasdoJogador = new ArrayList<Carta>();
    ArrayList<Carta> CartasGanhadasJogador = new ArrayList<Carta>();

    public void PegarCartaBaralho(ArrayList<Carta> Baralho){
        int Number = (int) (Math.random() * Baralho.size()-1 - 0 + 1) + 0;
        
        Carta Carta = Baralho.get(Number);
        Carta.jogador = this;
        
        CartasdoJogador.add(Carta);
        Baralho.remove(Carta);
    }

    public void ColocarCartaPartida(ArrayList<Carta> cartasPartida, Carta Trunfo, Jogador jogador1, Jogador jogador2, Regras Regras){
        
        int Number = (int) (Math.random() * CartasdoJogador.size()-1 - 0 + 1) + 0;
        
        Carta Carta = CartasdoJogador().get(Number);

        // System.out.println("Regras 07 do trufo - "+Regras.VerificarSeO7doTrunfoSaiu(Carta,Trunfo, jogador1, jogador2)); 
    
        //Verificando se saiu o 7 do mesmo nipe na partida.
        if(Carta.Face == "As" && Carta.PegarNipe() == Trunfo.PegarNipe()){
            if(Regras.VerificarSeO7doTrunfoSaiu(cartasPartida,Carta,Trunfo, jogador1, jogador2)){
                cartasPartida.add(Carta);
                CartasdoJogador().remove(Carta);
            }else{

                //Remover carta da partida utilizando a referência.
                while(Carta.Face=="As" && Carta.PegarNipe() == Trunfo.PegarNipe()){
                    Number = (int) (Math.random() * CartasdoJogador.size()-1 - 0 + 1) + 0;
                    Carta = CartasdoJogador().get(Number);
                }

                cartasPartida.add(Carta);
                CartasdoJogador().remove(Carta);

            }
        }else{
            //Colocar carta na partida utilizando a referência.
            cartasPartida.add(Carta);

            //Remover carta da partida utilizando a referência.
            CartasdoJogador().remove(Carta);
        }

    }


    public void PegarCartadaPartida(ArrayList<Carta> cartasPartida,Carta trunfo) {
            //CONSIDERANDO QUE SEJAM AS DUAS CARTAS DA PARTIDA COM O MESMO NIPE.
            try{
            if(trunfo.PegarNipe() == cartasPartida.get(0).PegarNipe() && trunfo.PegarNipe() == cartasPartida.get(1).PegarNipe()){
                // System.out.println("CONSIDERANDO QUE SEJAM AS DUAS CARTAS DA PARTIDA COM O MESMO NIPE.");
                //VERIFICANDO SE O PESO É DIFERENTE.
                if(cartasPartida.get(0).PegarPeso() > cartasPartida.get(1).PegarPeso()){

                    //CONSIDERANDO QUE O INDEX 0 SEJA A CARTA DO JOGADOR ATUAL
                    if(cartasPartida.get(0).jogador == this){
                        AdicionarRemoverCarta(cartasPartida);
                        AlterarGanhador(this);
                    }
                
                //CONSIDERANDO QUE O PESO SEJAM IGUAIS.
                }else if(cartasPartida.get(0).PegarPeso() == cartasPartida.get(1).PegarPeso()){

                    //CONSIDERANDO QUE O INDEX 0 TENHAM A FACE MAIOR DO QUE O INDEX 1
                    if(Integer.parseInt(cartasPartida.get(0).PegarFace()) > Integer.parseInt(cartasPartida.get(1).PegarFace())){
                        if(cartasPartida.get(0).jogador == this){
                            AdicionarRemoverCarta(cartasPartida);
                            AlterarGanhador(this);
                        }
                    }else{
                        if(cartasPartida.get(1).jogador == this){
                            AdicionarRemoverCarta(cartasPartida);
                            AlterarGanhador(this);
                        }
                    }
                }else{
                    //CONSIDERANDO QUE O INDEX 1 SEJA A CARTA DO JOGADOR ATUAL
                    if(cartasPartida.get(1).jogador == this){
                        AdicionarRemoverCarta(cartasPartida);
                        AlterarGanhador(this);
                    }
                }

        //CONSIDERANDO QUE PELO MENOS UM TENHA O NIPE IGUAL O DO TRUNFO
        }else if(trunfo.PegarNipe() == cartasPartida.get(0).PegarNipe() || trunfo.PegarNipe() == cartasPartida.get(1).PegarNipe() ){
            System.out.println("CONSIDERANDO QUE PELO MENOS UM TENHA O NIPE IGUAL O DO TRUNFO");
                    if(cartasPartida.get(0).jogador == this && trunfo.PegarNipe() == cartasPartida.get(0).PegarNipe() ){
                        AdicionarRemoverCarta(cartasPartida);
                        AlterarGanhador(this);
                    }
                    if(cartasPartida.get(1).jogador == this && trunfo.PegarNipe() == cartasPartida.get(1).PegarNipe() ){
                        AdicionarRemoverCarta(cartasPartida);
                        AlterarGanhador(this);
                    }
            
        //CONSIDERANDO QUE O NÃO TENHAM NIPES IGUAIS AO TRUFO 
        }else{
            System.out.println("CONSIDERANDO QUE O NÃO TENHAM NIPES IGUAIS AO TRUFO ");
            if(cartasPartida.get(0).PegarPeso() > cartasPartida.get(1).PegarPeso() && cartasPartida.get(0).PegarNipe() == cartasPartida.get(1).PegarNipe()){

                //CONSIDERANDO QUE O INDEX 0 SEJA A CARTA DO JOGADOR ATUAL
                if(cartasPartida.get(0).jogador == this){
                    AdicionarRemoverCarta(cartasPartida);
                    AlterarGanhador(this);
                }
            
            //CONSIDERANDO QUE O PESO SEJAM IGUAIS.
            }if(cartasPartida.get(0).PegarPeso() < cartasPartida.get(1).PegarPeso() && cartasPartida.get(0).PegarNipe() == cartasPartida.get(1).PegarNipe()){

                //CONSIDERANDO QUE O INDEX 0 SEJA A CARTA DO JOGADOR ATUAL
                if(cartasPartida.get(1).jogador == this){
                    AdicionarRemoverCarta(cartasPartida);
                    AlterarGanhador(this);
                }
            
            //CONSIDERANDO QUE O PESO SEJAM IGUAIS.
            }else if(cartasPartida.get(0).PegarPeso() == cartasPartida.get(1).PegarPeso() && cartasPartida.get(0).PegarNipe() == cartasPartida.get(1).PegarNipe()){
                System.out.println("CONSIDERANDO QUE O PESO SEJAM IGUAIS.");
                //CONSIDERANDO QUE O INDEX 0 TENHAM A FACE MAIOR DO QUE O INDEX 1
                if(Integer.parseInt(cartasPartida.get(0).PegarFace()) > Integer.parseInt(cartasPartida.get(1).PegarFace())){
                    if(cartasPartida.get(0).jogador == this){
                        AdicionarRemoverCarta(cartasPartida);
                        AlterarGanhador(this);
                    }
                }else{
                    if(cartasPartida.get(1).jogador == this){
                        AdicionarRemoverCarta(cartasPartida);
                        AlterarGanhador(this);

                    }
                }
            }else{
                //CONSIDERANDO QUE O INDEX 1 SEJA A CARTA DO JOGADOR ATUAL
                System.out.println("CONSIDERANDO QUE O INDEX 1 SEJA A CARTA DO JOGADOR ATUAL");
                if(cartasPartida.get(0).jogador == this){
                    AdicionarRemoverCarta(cartasPartida);
                    AlterarGanhador(this);
                }
            }
        }
    }catch(Exception exception){}
        
    }


    public int QuantidadedePontos(){
        this.pontos=0;
        for(int i = 0; i<CartasGanhadasJogador.size(); i++){
            this.pontos += CartasGanhadasJogador.get(i).PegarPeso();
        }
        return this.pontos;
    }


    public int QuantidadeDeCartas(){
        return CartasdoJogador.size();
    }


    public ArrayList<Carta> CartasdoJogador(){
        return CartasdoJogador;
    }

    public ArrayList<Carta> CartasGanhadasJogador(){
        return CartasGanhadasJogador;
    }

    public void AlterarGanhador(Jogador ganhador){
        Jogador.Ganhador = ganhador;
    }

    public void AdicionarRemoverCarta(ArrayList<Carta> cartasPartida){
        CartasGanhadasJogador.add(cartasPartida.get(1));
        CartasGanhadasJogador.add(cartasPartida.get(0));
        cartasPartida.remove(cartasPartida.get(1));
        cartasPartida.remove(cartasPartida.get(0));
    }

}
