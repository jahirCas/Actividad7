package PktActividad7;
import javax.swing.JOptionPane;
public class ClsProblema3Metodos {
	//menor de la matriz direccion 2
	public static void MtdMenor3d (int matriz[][][]) {
		int numMenor = 9999;
		for (int i=0;i<3;i++) {
			for (int j=0; j<3;j++) {
				for(int k=0;k<3;k++) {
					for (k=0; k<3; k++)
					{
						
						if (matriz[i][j][2]<numMenor)
							numMenor=matriz[i][j][2];
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "El numero de menor valor en la profundidad con dirección 2 es: "+numMenor, "Resultados de busqueda",JOptionPane.INFORMATION_MESSAGE);
	}
//metodos total impares colunma direccion 0
	public static void MtdPromMatriz(int matriz[][][]) {
		int impares=0,cont=0;
		for (int i=0;i<3;i++) {
			for (int j=0; j<3;j++) {
				for(int k=0;k<3;k++) {	
						if (matriz[i][0][k] %2==1) {
							//impares +=matriz[i][j][2];
						    cont++;
						}
							
					
				}
			}
		}
		//int promImpar=impares/cont;
		JOptionPane.showMessageDialog(null, "El total de impares encontrados en la columna con direccion '0' es "+cont, "Resultado de busqueda",0);
	}
	
	//metodo promedios diagonal pricipal
	public static void MtdpromeDiagPrint(int matriz[][][]){
		int prom1=0,prom2=0,prom3=0,cont1=0,cont2=0,cont3=0,suma1=0,suma2=0,suma3=0;	
		for (int i=0; i<3; i++)	{
		suma1+=matriz[i][i][0];	
		suma2+=matriz[i][i][1];	
		suma3+=matriz[i][i][2];	
		}
		prom1=suma1/3;
		prom2=suma2/3;
		prom3=suma3/3;
		JOptionPane.showMessageDialog(null, "El promedio total de la diagonal principal en la dimension 1 es"+prom1+"\nEl promedio total de la diagonal principal en la dimension 2 es "+prom2+"\nEl promedio total de la diagonal principal en la dimension 3 es "+prom3, "Resultado de busqueda",-1);
	}
	//metodo total de numeros entre 35 y 55
	public static void MtdEntre (int matriz[][][]) {
		int cont=0;
		for (int i=0;i<3;i++) {
			for (int j=0; j<3;j++) {
				for(int k=0;k<3;k++) {
					for (k=0; k<3; k++)
					{
						if (matriz[i][j][k]>35 && matriz[i][j][k]<55 ) {
							cont++;
						}		
							}
						}
					}
				}
		JOptionPane.showMessageDialog(null, "El total de numeros entre 35 y 55 es: "+cont ,"Resultado de busqueda", 0);
			}
	}

