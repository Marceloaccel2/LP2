public class InteiroNegativo extends Exception {
    private long n;

    public InteiroNegativo(long n) {
        this.n = n;
    }

    public String toString(){
        return "Numeros negativos não são aceitos , por favor , redigite o valor ";
    }
    
}
