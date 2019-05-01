package ArrayekinJolasten;

import java.util.ArrayList;
import java.util.List;

public class ZenbakienArrayBat {

	
	private ArrayList<Integer> lista;
	//Constructor
	
	public ZenbakienArrayBat(){
		
		this.lista	= new ArrayList<Integer>();
	}
	
	
	public void inprimatuNikNahiDitudanak(int howMany, int zenbatAldiz){
		
		int konta = 0;
		
		while(konta < zenbatAldiz && howMany <= this.lista.size()){
			
			for (int i=0; i < howMany; i++){
				
				System.out.print(this.lista.get(i));
			}
			
			System.out.println(" ");
			System.out.println(" ");
			konta = konta + 1;
		}
		
		
	}
	
	public void gehituZenbakia(int zenb){
		
		this.lista.add(zenb);
	}
}
