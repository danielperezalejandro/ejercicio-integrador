
package postnet;
/**
 * Implementacion de un datáfono sencillo con pago a plazos.
 * Ejemplo integrador clase Principal
 * @author 1dam
 */
public class Principal {
    /**
     * Este es el metodo principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Posnet posnet=new Posnet();
        Persona titular=new Persona("45176494D","daniel","Perez","638767176","nfnfbf@hotmail.com");
        TarjetaDeCredito tarjeta=new TarjetaDeCredito("BIRZA","41547898745",15000,titular,EntidadBancaria.BIRZA);
        
        System.out.print("Tarjeta antes del pago: ");
        System.out.print(tarjeta+"\n");
                
        System.out.print("Ticket tras pago: ");
        Ticket ticketGenerado=posnet.efectuarPago(tarjeta, 10000, 5);
        System.out.print(ticketGenerado +"\n");
        
        System.out.print("Tarjeta depues del pago: ");
        System.out.print(tarjeta+"\n");                      
    }
    
}
