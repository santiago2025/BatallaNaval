package data;

public class SubmarinoB extends Barco{
	
	public String[] partes;

	   
    public SubmarinoB(){
    	super(3);
    	partes = new String[super.getTamano()];
        partes[0] = "  A  ";
        partes[1] = " |0| ";
        partes[2] = " |0| ";
    }
    
       public void dibujarBarco(){
        for(int i = 0; i < partes.length; i++){
            System.out.println(partes[i]);
        }
    }



}
