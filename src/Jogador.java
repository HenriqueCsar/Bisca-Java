import java.util.ArrayList;


public class Jogador {
    public int id=0;
    public int pontos = 0;

    ArrayList<Carta> CartasdoJogador = new ArrayList<Carta>();
    ArrayList<Carta> CartasGanhadasJogador = new ArrayList<Carta>();

    public void PegarCartaBaralho(ArrayList<Carta> Baralho){
        int Number = (int) (Math.random() * Baralho.size()-1 - 0 + 1) + 0;
        
        Carta Carta = Baralho.get(Number);
        Carta.jogador = this;
        
        CartasdoJogador.add(Carta);
        Baralho.remove(Carta);
    }

    public void ColocarCartaPartida(ArrayList<Carta> cartasPartida, Carta Trufo){
        
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
                System.out.println("CONSIDERANDO QUE SEJAM AS DUAS CARTAS DA PARTIDA COM O MESMO NIPE.");
                //VERIFICANDO SE O PESO É DIFERENTE.
                if(cartasPartida.get(0).PegarPeso() > cartasPartida.get(1).PegarPeso()){

                    //CONSIDERANDO QUE O INDEX 0 SEJA A CARTA DO JOGADOR ATUAL
                    if(cartasPartida.get(0).jogador == this){
                        CartasGanhadasJogador.add(cartasPartida.get(0));
                        cartasPartida.remove(cartasPartida.get(0));
                    }
                
                //CONSIDERANDO QUE O PESO SEJAM IGUAIS.
                }else if(cartasPartida.get(0).PegarPeso() == cartasPartida.get(1).PegarPeso()){
                    //CONSIDERANDO QUE O INDEX 0 TENHAM A FACE MAIOR DO QUE O INDEX 1
                    if(Integer.parseInt(cartasPartida.get(0).PegarFace()) > Integer.parseInt(cartasPartida.get(1).PegarFace())){
                        if(cartasPartida.get(0).jogador == this){
                            CartasGanhadasJogador.add(cartasPartida.get(0));
                            cartasPartida.remove(cartasPartida.get(0));
                        }
                    }else{
                        if(cartasPartida.get(1).jogador == this){
                            CartasGanhadasJogador.add(cartasPartida.get(1));
                            cartasPartida.remove(cartasPartida.get(1));
                        }
                    }
                }else{
                    //CONSIDERANDO QUE O INDEX 1 SEJA A CARTA DO JOGADOR ATUAL
                    if(cartasPartida.get(1).jogador == this){
                        CartasGanhadasJogador.add(cartasPartida.get(1));
                        cartasPartida.remove(cartasPartida.get(1));
                    }
                }

        //CONSIDERANDO QUE PELO MENOS UM TENHA O NIPE IGUAL O DO TRUNFO
        }else if(trunfo.PegarNipe() == cartasPartida.get(0).PegarNipe() || trunfo.PegarNipe() == cartasPartida.get(1).PegarNipe() ){
            System.out.println("CONSIDERANDO QUE PELO MENOS UM TENHA O NIPE IGUAL O DO TRUNFO");
                for(int i = 0; i<cartasPartida.size()-1;i++){
                    if(cartasPartida.get(i).jogador == this){
                        CartasGanhadasJogador.add(cartasPartida.get(i));
                        cartasPartida.remove(cartasPartida.get(i));
                    }
            }
        //CONSIDERANDO QUE O NÃO TENHAM NIPES IGUAIS AO TRUFO 
        }else{
            System.out.println("CONSIDERANDO QUE O NÃO TENHAM NIPES IGUAIS AO TRUFO ");
            if(cartasPartida.get(0).PegarPeso() > cartasPartida.get(1).PegarPeso()){

                //CONSIDERANDO QUE O INDEX 0 SEJA A CARTA DO JOGADOR ATUAL
                if(cartasPartida.get(0).jogador == this){
                    CartasGanhadasJogador.add(cartasPartida.get(0));
                    cartasPartida.remove(cartasPartida.get(0));
                }
            
            //CONSIDERANDO QUE O PESO SEJAM IGUAIS.
            }else if(cartasPartida.get(0).PegarPeso() == cartasPartida.get(1).PegarPeso()){
                System.out.println("CONSIDERANDO QUE O PESO SEJAM IGUAIS.");
                //CONSIDERANDO QUE O INDEX 0 TENHAM A FACE MAIOR DO QUE O INDEX 1
                if(Integer.parseInt(cartasPartida.get(0).PegarFace()) > Integer.parseInt(cartasPartida.get(1).PegarFace())){
                    if(cartasPartida.get(0).jogador == this){
                        CartasGanhadasJogador.add(cartasPartida.get(0));
                        cartasPartida.remove(cartasPartida.get(0));
                    }
                }else{
                    if(cartasPartida.get(1).jogador == this){
                        CartasGanhadasJogador.add(cartasPartida.get(1));
                        cartasPartida.remove(cartasPartida.get(1));
                    }
                }
            }else{
                //CONSIDERANDO QUE O INDEX 1 SEJA A CARTA DO JOGADOR ATUAL
                System.out.println("CONSIDERANDO QUE O INDEX 1 SEJA A CARTA DO JOGADOR ATUAL");
                if(cartasPartida.get(1).jogador == this){
                    CartasGanhadasJogador.add(cartasPartida.get(1));
                    cartasPartida.remove(cartasPartida.get(1));
                }
            }
        }
    }catch(Exception exception){
        
    }
        
        // if(cartasPartida.get(0).PegarPeso() > cartasPartida.get(1).PegarPeso()){
            
         
        // }

        //     // jogador 1 ---- 2 p: 3
        //     if(cartasPartida.get(0).PegarNipe() == trunfo.PegarNipe()){ 
                
        //         //Caso os pesos ao pegar a partida forem iguais.
        //         if( cartasPartida.get(0).PegarPeso() == 0 && cartasPartida.get(1).PegarPeso() == 0 ){
                    
        //             if( Integer.parseInt(cartasPartida.get(0).PegarFace()) > Integer.parseInt(cartasPartida.get(1).PegarFace())){
        //                 CartasGanhadasJogador.add(cartasPartida.get(0));
        //                 cartasPartida.remove(cartasPartida.get(0));
        //             }else{
        //                 CartasGanhadasJogador.add(cartasPartida.get(1));
        //                 cartasPartida.remove(cartasPartida.get(1));   
        //             }
                    

        //         }
        //         if( cartasPartida.get(0).PegarPeso() > cartasPartida.get(1).PegarPeso()){
                    
                
        //         }
        //     }
        //     //jogador 2 ------ 3 p: 0
        //     if(cartasPartida.get(1).PegarNipe() == trunfo.PegarNipe()){

        //             //Caso os pesos ao pegar a partida forem iguais.
        //             if( cartasPartida.get(0).PegarPeso() == 0 && cartasPartida.get(1).PegarPeso() == 0 ){
                        
        //                 if( Integer.parseInt(cartasPartida.get(0).PegarFace()) > Integer.parseInt(cartasPartida.get(1).PegarFace())){
        //                     CartasGanhadasJogador.add(cartasPartida.get(0));
        //                     cartasPartida.remove(cartasPartida.get(0));
        //                 }else{
        //                     CartasGanhadasJogador.add(cartasPartida.get(1));
        //                     cartasPartida.remove(cartasPartida.get(1));   
        //                 }
                        

        //             }
        //     }

        
    }


    public int QuantidadedePontos(){
        for(int i = 0; i<CartasGanhadasJogador.size()-1; i++){
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

}
