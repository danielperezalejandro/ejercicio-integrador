
package postnet;

/**
 * clase TarjetaDeCredito
 * @author 1dam
 */
class TarjetaDeCredito {
    
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadBancaria entidadFinanciera;
    private Persona titular;
    
  /**    
   * constructor TarjetaDeCredito
   * @param entidadBancaria
   * @param nroTarjeta
   * @param saldo
   * @param titular
   * @param entidadFinanciera 
   */

    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadBancaria entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    @Override
    public String toString() {
             return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }


    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public EntidadBancaria getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public Persona getTitular() {
        return titular;
    }
    


    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setEntidadFinanciera(EntidadBancaria entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public boolean tieneSaldoDisponible(double monto) {
        return saldo>=monto;
    }

    public String nombreCompletoDelTitular() {
        return titular.nombreCompleto();
    }

    public void descontar(double monto) {
      saldo=saldo-monto;
    }
    
    
    
    
}
