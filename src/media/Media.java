package media;

public class Media {
		
	public double numero1; 
	public double numero2;
	public double numero3;
	public double resultado;
	
	
	
	public void somar() {
		
		resultado = (numero1 + numero2 + numero3)/3;
		
		System.out.println("Sua media eh:" + resultado);
		
	}
		
    public double somar(double numero1, double numero2, double numero3){
    	
    	resultado = (numero1 + numero2 + numero3)/3;
    	if (resultado >= 7) {
    		System.out.println("Aprovado!");
       	}
    	else {
    		System.out.println("Tomou na jabiraca!");
    	}
    	
    	return resultado;
      
    }
    
    public void exibir() {
    	System.out.println("Sua media eh:" + resultado);
    }
  }
