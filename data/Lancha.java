package data;

public class Lancha extends Barco{

	public String[] partes;
        
	   
    public Lancha(){
    	super(2);
    	partes = new String[super.getTamano()];
        partes[0] = " |T| ";
        partes[1] = " |.| ";
    }

       public void dibujarBarco(){
        for(int i = 0; i < partes.length; i++){
            System.out.println(partes[i]);
        }
    }
   

}
