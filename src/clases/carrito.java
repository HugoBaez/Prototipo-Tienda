package clases;


public class carrito{
	producto compra[] = new producto[10];
	int noProdu;
	float total;

	public carrito(){
		this.noProdu=0;
	}

	public String mostrar(int i){
		return compra[i].mostrar();
	}

	public void anadirProdu(producto produ){
		compra[noProdu]=produ;
		noProdu++;
	}

	public void eliminarPro(int i){
		if(i<noProdu){
			compra[i-1]=compra[i];
			i++;
			eliminarPro(i);
		}
		else
			noProdu--;
	}

	public void eliminar(int i,int cant) throws Exception {
		if (cant>compra[i].getNoProdu()){
			throw(new CantFaild("Su cantidad es mayor a los productos que hay"));
		}
		else{
			if (cant==compra[i].getNoProdu()){
				eliminarPro(i);
			}
			else
				this.eliminarPro(cant);
		}
	}

	public float costoTot(){
		int i;
		for (i=0;i<=noProdu-1;i++) {
			this.total+=compra[i].getTotal();
		}
		return total;
	}

	public int getNoProdu(){
		return noProdu;
	}
}