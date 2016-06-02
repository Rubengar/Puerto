import java.util.*;
public class Puerto
{
   private ArrayList<Alquiler> alquileres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<>();
    }
    
    /**
     * Add a rent 
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco)
    {   
      int posicionEnLaQueQuedaElBarco = -1;
      int contador = 0;
      while(contador<=alquileres.size() && posicionEnLaQueQuedaElBarco==-1) {
        if(alquileres.get(contador)==null){
             posicionEnLaQueQuedaElBarco = contador;
             Alquiler alquiler= new Alquiler(numeroDias,cliente,barco);
             alquileres.add(contador,alquiler);
        }
        contador++;
      }
      return posicionEnLaQueQuedaElBarco;
    }
    
    /**
     * Show state of port
     */
    public void verEstadoAmarres()
    {
      for(int i = 0;i <alquileres.size();i++) {
         System.out.println("Amarre nº" + i);
         if(alquileres.get(i) == null) {
            System.out.println("Libre");
         }
         else{
                System.out.println("ocupado");
            System.out.println(alquileres.get(i));
        }      
     }
  }
    
    /**
     * Liberate moorage. Returns -1 if posicion is not valid
     */
    public float liquidarAlquiler(int posicion)
    {
      float valor = -1;
      if(posicion >= 0){
        if(alquileres.get(posicion) !=   null){
          valor = alquileres.get(posicion).getCosteAlquiler();
          Alquiler alquiler= new Alquiler(0,null,null);
          alquileres.add(posicion,alquiler);
        }
      }
      return valor;
    }

}
