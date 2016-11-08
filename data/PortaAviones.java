package data;

public class PortaAviones extends Barco{
	
	

    public String[] partes;
	   
    public PortaAviones(){
    	super(5);
    	partes = new String[super.getTamano()];
        partes[0] = " |-| ";
        partes[1] = " |O| ";
        partes[2] = " |O| ";
        partes[3] = " |O| ";
        partes[4] = " |_| ";
    }

       public void dibujarBarco(){
        for(int i = 0; i < partes.length; i++){
            System.out.println(partes[i]);
        }
    }
}
