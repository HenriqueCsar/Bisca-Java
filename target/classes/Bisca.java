package main.resources

import java.util.ArrayList;

// import java.util.ArrayList;

public class Bisca {
    Carta Trunfo;
    /*Metodo Regras do jogo*/
    

    public Carta PegarTrunfo(ArrayList<Carta> baralho){

        int Number = (int) (Math.random() * baralho.size()-1 - 0 + 1) + 0;
        
        Carta Carta = baralho.get(Number);
        
        return Carta;
    
    
    }

    public void DistribuirCartas(Baralho baralho, Jogador Jogador){
        for(int i = 0; i < 3; i++){
           Jogador.PegarCartaBaralho(baralho.Baralho);
        }
    }

    public void Cartiador(Baralho Baralho, Jogador Jogador1, Jogador Jogador2, Regras Regras, Carta Trunfo, ArrayList<Carta> CartasPartida){
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

        System.out.println("Trunfo: "+Trunfo);
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

    //     System.out.println("Trunfo: "+Trunfo);
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

    System.out.println("Trunfo: "+Trunfo);

    Jogador1.PegarCartadaPartida(CartasPartida,Trunfo);
    Jogador2.PegarCartadaPartida(CartasPartida,Trunfo);

    System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
    System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());

    System.out.println("Partida "+CartasPartida.toString());

    System.out.println("Trunfo: "+Trunfo);

    System.out.println("\n");

    System.out.println("CartasGanhadasJogador1 "+Jogador1.CartasGanhadasJogador.toString());

    System.out.println("CartasGanhadasJogador2 "+Jogador2.CartasGanhadasJogador.toString());

    System.out.println(" Quantidade de Pontos Jogador1: "+Jogador1.QuantidadedePontos());
    System.out.println(" Quantidade de Pontos Jogador2: "+Jogador2.QuantidadedePontos());
    System.out.println("Quantidade total de pontos: "+(Jogador1.QuantidadedePontos()+Jogador2.QuantidadedePontos()));

    System.out.println(" Quantidade de Cartas Ganhas Jogador1: "+Jogador1.CartasGanhadasJogador.size());
    System.out.println(" Quantidade de Cartas Ganhas Jogador2: "+Jogador2.CartasGanhadasJogador.size());

    System.out.println("Trunfo: "+Trunfo);
    
}



    




    
    // public Carta PegarCarta(ArrayList<Carta> Baralho){

    //     int Number = (int) (Math.random() * Baralho.size() - 0 + 1) + 0;
        
    //     Carta Carta = Baralho.get(Number);
    
    //     return Carta;
    
    // }



}
