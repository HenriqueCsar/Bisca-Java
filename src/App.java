
public class App {
    public static void main(String[] args) throws Exception {

        Baralho Baralho = new Baralho();
        Bisca BiscaGame = new Bisca();
        Jogador Jogador1 = new Jogador();
        Jogador Jogador2 = new Jogador();

        // System.out.println(BaralhoBisca.GetTamanhoBaralho());
        BiscaGame.Trunfo=BiscaGame.PegarTrunfo(Baralho.Baralho);


       System.out.println(Baralho.GetTamanhoBaralho());

        Jogador1.PegarCartaBaralho(Baralho.Baralho);
        Jogador2.PegarCartaBaralho(Baralho.Baralho);

        System.out.println(Baralho.GetTamanhoBaralho());

        System.out.println(Jogador1.QuantidadeDeCartas());

        System.out.println(Jogador1.Cartas().toString());

        // System.out.println(Baralho.Baralho.toString());



    }

}
    