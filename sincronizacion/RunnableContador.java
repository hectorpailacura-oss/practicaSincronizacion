package sincronizacion;

public class RunnableContador implements Runnable {

  Contador elCon;
  public RunnableContador(Contador con) {
	  this.elCon=con;
  }
  
  public void run() {
		  
		  for(int x=0; x<1000;++x) 
			  this.elCon.incrementar();
		  
	  }
	  
  
	
}
	


