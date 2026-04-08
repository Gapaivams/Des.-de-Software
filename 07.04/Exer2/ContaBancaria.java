public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        if (saldo >= 0) {
            this.saldo = saldo;
        } else{
            System.out.println("saldo deve ser maior que zero");
        }
    }
}
