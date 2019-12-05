package miage.jvol.bowling;

public class Frame {
    private int valeur1, valeur2, valeur3, numero;

    public Frame(int numero){
        this.numero = numero;
        this.valeur1 = 0;
        this.valeur2 = 0;
        this.valeur1 = 0;
    }

    public int getValeur1() {
        return valeur1;
    }

    public void setValeur1(int valeur1) {
        this.valeur1 = valeur1;
    }

    public int getValeur2() {
        return valeur2;
    }

    public void setValeur2(int valeur2) {
        this.valeur2 = valeur2;
    }

    public int getValeur3() {
        return valeur3;
    }

    public void setValeur3(int valeur3) {
        this.valeur3 = valeur3;
    }

    public boolean isValide(){
        if(this.valeur1 == 10 && this.valeur2 != 0){
            return false;
        }else if(this.valeur1 + this.valeur2 > 10){
            return false;
        }else if(this.numero != 10 && this.valeur3 != 0){
            return false;
        }else if (this.numero == 10 && this.valeur1 + this.valeur2 != 10 && this.valeur3 != 0){
            return false;
        }else
            return true;
    }

    public int getNumero(){
        return this.numero;
    }

    @Override
    public String toString() {
        return  "|" + valeur1 + "," + valeur2 + "," + valeur3 ;
    }
}
