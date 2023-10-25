package clases;

import java.util.Random;
public abstract class realizarCompra{
	private float total=0;
	private Random codigo= new Random();

	public void ticket(usuario user,int i){
		if (i<=(user.getNoProdu()-1)){
			System.out.println(user.mostrar(i));
			this.total+=user.costoTot();
			i++;
			ticket(user,i);
		}
	}

	public float getTotal(){
		return total;
	}

	public long getCodigo(){
		return codigo.nextLong()*98367497;
	}

}