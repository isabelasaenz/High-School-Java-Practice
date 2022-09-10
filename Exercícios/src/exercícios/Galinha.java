package exercícios;

public class Galinha {
    public static int ovosDaGranja; //variável global
    public int ovos; // total de ovos do obj galinha
    
    public Galinha botar(){ //método
        this.ovos++;
        Galinha.ovosDaGranja++;
        return this;
    }
    
    public static double mediaDeOvos (int galinhas){ //método estático
        return Galinha.ovosDaGranja / galinhas;
    }
        
}
