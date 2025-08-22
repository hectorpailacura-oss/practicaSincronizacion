package sincronizacion;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Contador con=new Contador();
  RunnableContador hilo1=new RunnableContador(con);
  
  RunnableContador hilo2=new RunnableContador(con);
	Thread miHilo = new Thread(hilo1);
	Thread miHilo2=new Thread(hilo2);
	
	miHilo.start();
	miHilo2.start();
    System.out.println(con);
    System.out.println("en main   "+ con.getCant());
	
	}

}
