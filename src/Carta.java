
public class Carta {
    public String Nipe;
    public String Face;
    public int Peso;
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



    @Override
    public String toString(){
        return "Nipe:"+this.Nipe+" Face:"+this.Face+" Peso: "+this.Peso+"\n";
    }

    
}
