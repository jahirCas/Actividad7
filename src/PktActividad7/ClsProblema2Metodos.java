package PktActividad7;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.Color;

public class ClsProblema2Metodos {
	//VARIABLES GLOBALES 
		static int f, c, sumMat=0, sumImpSec=0, x, numMayor=0, sumCol0=0, num, contador=0;
		static float promCol0;
		
		//IMPRIMIR MATRIZ
		public void imprimirMatriz(int mat[][]) {
			String impresion="";
			for (f=0; f<4; f++)
			{
				for (c=0; c<4; c++)
				{
					impresion +=mat[f][c];
					impresion +="      ";
				}
				impresion+="\n";
			}
			JOptionPane.showMessageDialog(null,impresion);
		}
		//SUMA NUMEROS MATRIZ
		public void sumaNumeros(int mat[][])
		{
			for (f=0; f<4; f++)
			{
				for (c=0; c<4; c++)
				{
					sumMat=sumMat+mat[f][c];
				}
			}
			JOptionPane.showMessageDialog(null, "La suma de todos los numeros de la matriz es: "+sumMat, "Resultados de suma",JOptionPane.INFORMATION_MESSAGE);
		}
			
		//SUMA DIAGONAL SECUNDARIA
		public void sumaDiagSec(int mat[][])
		{
			for (f=0; f<4; f++)
			{
				if (mat[f][3-f]%2==1)
					sumImpSec=sumImpSec+mat[f][3-f];
			}
			JOptionPane.showMessageDialog(null, "La suma de todos los numeros impares de la diagonal secundaria es: "+sumImpSec, "Resultados de suma",JOptionPane.INFORMATION_MESSAGE);
		}
		
		//NUM PARES DIAGONAL PRINCIPAL
		public void paresDiagPrin(int mat[][])
		{
			JTextArea areaTextoSalida = new JTextArea();
			
			areaTextoSalida.setText("Los numeros pares de la diagonal principal son\n");
					
			for (f=0; f<4; f++)	
			{
				if (mat[f][f]%2==0)
				{
					areaTextoSalida.append(mat[f][f] + "\n");	
				}
			}
			JOptionPane.showMessageDialog(null, areaTextoSalida, "Impresion numeros pares", JOptionPane.INFORMATION_MESSAGE);
		}
		
		//MAYOR VALOR FILA 2
		public void valorMayor(int mat[][])
		{
			for (c=0; c<4; c++)
			{
				if (mat[2][c]>numMayor)
					numMayor=mat[2][c];
			}
			JOptionPane.showMessageDialog(null, "El numero mayor en la fila con direccion 2 es: "+numMayor, "Resultados de busqueda",JOptionPane.INFORMATION_MESSAGE);
		}
		
		//PROMEDIO COLUMNA 0
		public void promedio(int mat[][])
		{
			for (f=0; f<4; f++)
			{
				sumCol0=sumCol0+mat[f][0];
			}
			promCol0=sumCol0/4;
			JOptionPane.showMessageDialog(null, "El promedio de los numeros de la columna con direccion 0 es: "+promCol0, "Resultados de promedio",JOptionPane.INFORMATION_MESSAGE);
		}
		//PEDIR UN NUMERO ALEATORIO
		public int Numero()
		{
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero cualquiera, de el cual quieras saber cuantas veces se repite en la matriz"));
			return num;
		}
		
		//BUSCAR NUMERO REPETIDO
		public void buscarRepetido(int mat[][], int Numero)
		{
			
			for (f=0; f<4; f++)
			{
				for (c=0; c<4; c++)
				{
					if (mat[f][c]==Numero)
						contador++;
				}
			}
			if (contador!=0) {
				JOptionPane.showMessageDialog(null, "El numero "+Numero+" se encuentra "+contador+" veces", "Resultados de busqueda",1);
			}
			else
				JOptionPane.showMessageDialog(null, "El numero "+Numero+ " no se encontró ninguna vez", "Resultados de busqueda",1);
		}	
}
