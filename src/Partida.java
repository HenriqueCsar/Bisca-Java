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

        
        System.out.println("Jogador1 "+Jogador1.CartasdoJogador.toString()); 
        System.out.println("Jogador2 "+Jogador2.CartasdoJogador.toString()); 

        //COLOCAR UMA CARTA NA PARTIDA
        Jogador1.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
        Jogador2.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);

        System.out.println("Partida "+CartasPartida.toString());

        Jogador1.PegarCartadaPartida(CartasPartida,Trunfo);
        Jogador2.PegarCartadaPartida(CartasPartida,Trunfo);

        System.out.println(Jogador.Ganhador); 

        
        System.out.println("Jogador1 "+Jogador1.CartasdoJogador.toString()); 
        System.out.println("Jogador2 "+Jogador2.CartasdoJogador.toString()); 

        System.out.println("CartasGanhadasJogador1 "+Jogador1.CartasGanhadasJogador.toString());
        System.out.println("CartasGanhadasJogador2 "+Jogador2.CartasGanhadasJogador.toString());

        System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
        System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());
        try{
            for(int i = 0; i < 40; i++){

            
            Jogador1.PegarCartaBaralho(Baralho.Baralho);
            Jogador2.PegarCartaBaralho(Baralho.Baralho);

            System.out.println(Jogador.Ganhador); 


            System.out.println("Jogador1 "+Jogador1.CartasdoJogador.toString()); 
            System.out.println("Jogador2 "+Jogador2.CartasdoJogador.toString()); 

            if(Jogador.Ganhador == Jogador1){
                Jogador1.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
                Jogador2.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
            }else{
                Jogador2.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras); 
                Jogador1.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
            }
            System.out.println("Partida "+CartasPartida.toString());


            Jogador1.PegarCartadaPartida(CartasPartida,Trunfo);
            Jogador2.PegarCartadaPartida(CartasPartida,Trunfo);

            System.out.println(Jogador.Ganhador); 


            System.out.println("CartasGanhadasJogador1 "+Jogador1.CartasGanhadasJogador.toString());
            System.out.println("CartasGanhadasJogador2 "+Jogador2.CartasGanhadasJogador.toString());

            System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
            System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());

            }
    }catch(Exception exception){
        
    }
try{
    for(int i =0; i<30; i++){
        System.out.println("Jogador1 "+Jogador1.CartasdoJogador.toString()); 
        System.out.println("Jogador2 "+Jogador2.CartasdoJogador.toString()); 

        if(Jogador.Ganhador == Jogador1){
            Jogador1.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
            Jogador2.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
        }else{
            Jogador2.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras); 
            Jogador1.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
        }

        System.out.println("Partida "+CartasPartida.toString());


        Jogador1.PegarCartadaPartida(CartasPartida,Trunfo);
        Jogador2.PegarCartadaPartida(CartasPartida,Trunfo);

        System.out.println("CartasGanhadasJogador1 "+Jogador1.CartasGanhadasJogador.toString());
        System.out.println("CartasGanhadasJogador2 "+Jogador2.CartasGanhadasJogador.toString());

        System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
        System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());

        System.out.println("Jogador1 "+Jogador1.CartasdoJogador.toString()); 
        System.out.println("Jogador2 "+Jogador2.CartasdoJogador.toString()); 
        if(Jogador1.CartasdoJogador.size()==1){
            Jogador2.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
            break;
        }
        System.out.println("Partida "+CartasPartida.toString());

        System.out.println("CartasGanhadasJogador1 "+Jogador1.CartasGanhadasJogador.toString());
        System.out.println("CartasGanhadasJogador2 "+Jogador2.CartasGanhadasJogador.toString());

        System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
        System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());

        System.out.println("Trunfo: "+this.Trunfo);
        System.out.println("Partida "+CartasPartida.toString());
    }
}catch(Exception exception){

    }
    
    Regras.FimPartida(Trunfo, Jogador1, Jogador2);

    if(Jogador.Ganhador == Jogador1){
        Jogador1.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
        Jogador2.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
    }else{
        Jogador2.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras); 
        Jogador1.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
    }

    System.out.println("Jogador1 depois das regras "+Jogador1.CartasdoJogador.toString()); 
    System.out.println("Jogador2 "+Jogador2.CartasdoJogador.toString()); 

    // try{for(int i =0; i<30; i++){

    // System.out.println("Depois das Regras - Jogador1 "+Jogador1.CartasdoJogador.toString()); 
    // System.out.println("Jogador2 "+Jogador2.CartasdoJogador.toString()); 

    //     System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
    //     System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());

    //     System.out.println("Trunfo: "+this.Trunfo);
    //     System.out.println("Partida "+CartasPartida.toString());
        
    //     Jogador1.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);
    //     Jogador2.ColocarCartaPartida(CartasPartida, Trunfo, Jogador1, Jogador2, Regras);

    //     System.out.println("Partida "+CartasPartida.toString());


    //     Jogador1.PegarCartadaPartida(CartasPartida,Trunfo);
    //     Jogador2.PegarCartadaPartida(CartasPartida,Trunfo);

        
    //     System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
    //     System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());

    // }
    // }catch(Exception exception){

    // }

    
    System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
    System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());

    System.out.println("Trunfo: "+this.Trunfo);

    Jogador1.PegarCartadaPartida(CartasPartida,Trunfo);
    Jogador2.PegarCartadaPartida(CartasPartida,Trunfo);

    System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
    System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());

    System.out.println("Partida "+CartasPartida.toString());

    System.out.println("Trunfo: "+this.Trunfo);

    System.out.println("\n");

    System.out.println("CartasGanhadasJogador1 "+Jogador1.CartasGanhadasJogador.toString());

    System.out.println("CartasGanhadasJogador2 "+Jogador2.CartasGanhadasJogador.toString());

    System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
    System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());
    System.out.println("Quantidade total de pontos: "+(Jogador1.QuantidadedePontos()+Jogador2.QuantidadedePontos()));

    System.out.println(" Quantidade de Cartas Ganhas Jogador1: "+Jogador1.CartasGanhadasJogador.size());
    System.out.println(" Quantidade de Cartas Ganhas Jogador2: "+Jogador2.CartasGanhadasJogador.size());

    System.out.println("Trunfo: "+this.Trunfo);

    }
    
    

}
