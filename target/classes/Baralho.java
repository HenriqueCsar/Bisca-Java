package main.resources

import java.util.ArrayList;

public class Baralho {
    ArrayList<Carta> Baralho = Cartas();

public ArrayList<Carta> Cartas(){
  
    ArrayList<Carta> Baralho = new ArrayList<Carta>();
    

    String[] nipes = {"Ouro", "Copas", "Espadas", "Paus"};
    String[] faces = {"As", "2", "3", "4", "5", "6", "7", "Valete", "Dama", "Rei"};
    int[] Peso =  {11, 0, 0, 0, 0, 0, 10, 3, 2, 4};

    for(int i = 0; i < faces.length; i++){
        Baralho.add(new Carta(nipes[0], faces[i], Peso[i]));
        Baralho.add(new Carta(nipes[1], faces[i], Peso[i]));
        Baralho.add(new Carta(nipes[2], faces[i], Peso[i]));
        Baralho.add(new Carta(nipes[3], faces[i], Peso[i]));
    }

    return Baralho;
}


public int PegarTamanhoBaralho(){
    return Baralho.size();
}




}


