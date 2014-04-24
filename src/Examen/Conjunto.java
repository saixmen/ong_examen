package Examen; 
public class Conjunto {
    private int size;
    private int posicion;
    private Ong arrayO[];
    public Conjunto (int tam) {
        this.size=tam;
        this.posicion=0;
        arrayO=new Ong[size];   
    }

    
    public int getSize () {
        return size;
    } 
    public void setSize (int val) {
        this.size = val;
    } 
    public Ong[] getArrayO () {
        return arrayO;
    } 
    public void setArrayO (Ong[] val) {
        this.arrayO = val;
    } 
    public int getPosicion () {
        return posicion;
    } 
    public void setPosicion (int val) {
        this.posicion = val;
    }
    public void anadirOng(Ong ong)
    {
        this.arrayO[posicion]=ong;    
        this.posicion++;
    }
    public Ong getOng(int vista)
    {
        return this.arrayO[vista];
    }

}

