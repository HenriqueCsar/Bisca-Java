package main.resources


public class Carta {
    public String Nipe;
    public String Face;
    public int Peso;
    public Jogador jogador;
    // ArrayList<C> Baralho;

    public Carta(String Nipe, String Face, int Peso){
        this.Nipe = Nipe;
        this.Face = Face;
        this.Peso = Peso;
    }
        
    public String PegarNipe() {
        return this.Nipe;
    }


    public String PegarFace() {
        return this.Face;
    }

    public int PegarPeso() {
        return this.Peso;
    }

    public Jogador PegarIdJogador(){
        return this.jogador;
    }


    @Override
    public String toString(){
        return "Nipe:"+this.Nipe+" Face:"+this.Face+" Peso: "+this.Peso+" Jogador:"+this.jogador+"\n";
    }

    
}
