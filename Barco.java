/**
 * Abstract class Barco - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    private String matricula;

    private float eslora;
    
    private int annoFabricacion;
    
    public Barco(String matricula,float eslora,int annoFabricacion)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.annoFabricacion = annoFabricacion;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public String getMatricula()
    {
        // put your code here
        return matricula;
    }
    public float getEslora()
    {
        return eslora;
    }
    public int getAnnoFabricacion()
    {
        return annoFabricacion;
    }
    
    public abstract int getCoeficienteBernua();

    public String toString()
    {
        String mensaje = "Datos: ";
        mensaje += "\n Matricula: "+getMatricula()+"\n";
        mensaje += "Año de fabricacion: "+getAnnoFabricacion()+"\n";
        return mensaje;
    }
}
