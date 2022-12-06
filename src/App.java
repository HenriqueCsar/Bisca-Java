
public class App {
    public static void main(String[] args) throws Exception {

        Baralho Baralho = new Baralho();
        Bisca BiscaGame = new Bisca();
        Jogador Jogador1 = new Jogador();
        Jogador Jogador2 = new Jogador();

        // System.out.println(BaralhoBisca.GetTamanhoBaralho());

        System.out.println(Baralho.GetTamanhoBaralho()); //40

        BiscaGame.Trunfo=BiscaGame.PegarTrunfo(Baralho.Baralho);

       System.out.println(Baralho.GetTamanhoBaralho()); //39
        BiscaGame.DistribuirCartas(Baralho, Jogador2);
        BiscaGame.DistribuirCartas(Baralho, Jogador1);

        System.out.println("TRUNFO: "+BiscaGame.Trunfo);


        System.out.println("Esse seria o 36 : "+Baralho.GetTamanhoBaralho());//36

        // System.out.println(Jogador1.QuantidadeDeCartas());
        System.out.println("TRUNFO: "+BiscaGame.Trunfo);

        System.out.println(Jogador2.Cartas().toString());

        // System.out.println(Jogador1.QuantidadedePontos());
        
        // System.out.println(Baralho.Baralho.toString());



    }

}
    