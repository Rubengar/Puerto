public class Puerto
{
    private static final int NUMERO_AMARRES = 4;
    private Alquiler[] alquileres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }
    
    /**
     * Add a rent 
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco)
    {   
      int posicionEnLaQueQuedaElBarco = -1;
      int contador = 0;
      while(contador<alquileres.length && posicionEnLaQueQuedaElBarco==-1) {
        if(alquileres[contador]==null){
        		posicionEnLaQueQuedaElBarco = contador;
          	alquileres[contador] = new Alquiler(numeroDias,cliente,barco);
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
      for(int i = 0;i <alquileres.length;i++) {
      	 System.out.println("Amarre nº" + i);
      	 if(alquileres[i] == null) {
            System.out.println("Libre");
         }
         else{
        		System.out.println("ocupado");
            System.out.println(alquileres[i]);
        }      
     }
  }
    
    /**
     * Liberate moorage. Returns -1 if posicion is not valid
     */
    public float liquidarAlquiler(int posicion)
    {
      float valor = -1;
      if(posicion < NUMERO_AMARRES && posicion >= 0){
        if(alquileres[posicion] != null){
        	valor = alquileres[posicion].getCosteAlquiler();
          alquileres[posicion] = null;
        }
      }
	    return valor;
    }

}
