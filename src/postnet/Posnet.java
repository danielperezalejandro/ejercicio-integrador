
package postnet;

/**
 * clase posnet
 * @author 1dam
 */
 
public class Posnet {

    public static final double RECARGO_POR_CUOTA=0.03;
    public static int MIN_CANT_CUOTAS=1;
    public static int MAX_CANT_CUOTAS=6;
    
 
    
    /**
     * Comprueba que los datos de la cuenta sean validos,  
     * que se pueda efectuar el pago, cambia el valor del monto final 
     * y genera el ticket.
     * @param tarjeta
     * @param montoAbonar
     * @param cantCuotas
     * @return ticket 
     */
    public Ticket efectuarPago(TarjetaDeCredito tarjeta,double montoAbonar, int cantCuotas){
        Ticket ticket=null;

        if(datosValidos(tarjeta, montoAbonar, cantCuotas)){     
            double montoFinal=montoAbonar+montoAbonar*recargoSegunCuotas(cantCuotas); 
            if(tarjeta.tieneSaldoDisponible(montoFinal)){
               String nomApe=tarjeta.nombreCompletoDelTitular(); 
               tarjeta.descontar(montoFinal);
               double montoPorCuota=montoFinal/cantCuotas;
               ticket =new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }
        return ticket;
    }
    
    private double recargoSegunCuotas(int cantCuotas){
        return(cantCuotas-1)*RECARGO_POR_CUOTA;
    }
        
    private boolean datosValidos(TarjetaDeCredito tarjeta,double monto, int cant){
    
        boolean esTarjetaValida = tarjeta!=null;
        boolean esMontoValido =monto>0;
        boolean cantCuotasValidas=cant >=MIN_CANT_CUOTAS && cant<= MAX_CANT_CUOTAS;
        return  esTarjetaValida && esMontoValido && cantCuotasValidas;
          
    }


    public static double getRECARGO_POR_CUOTA() {
        return RECARGO_POR_CUOTA;
    }

    public static int getMIN_CANT_CUOTAS() {
        return MIN_CANT_CUOTAS;
    }

    public static int getMAX_CANT_CUOTAS() {
        return MAX_CANT_CUOTAS;
    }
    
     
    
    public static void setMIN_CANT_CUOTAS(int MIN_CANT_CUOTAS) {
        Posnet.MIN_CANT_CUOTAS = MIN_CANT_CUOTAS;
    }

    public static void setMAX_CANT_CUOTAS(int MAX_CANT_CUOTAS) {
        Posnet.MAX_CANT_CUOTAS = MAX_CANT_CUOTAS;
    }
       
    
    
    
    
}
