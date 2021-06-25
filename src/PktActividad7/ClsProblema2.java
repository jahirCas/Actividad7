package PktActividad7;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;

public class ClsProblema2 {

	public static void main(String[] args) throws IOException
	{
		UIManager UI;
		UI = null;
		UI.put("OptionPane.background", new Color(65, 240, 198));
		UI.put("Panel.background", new Color(52, 216, 176));
		
		//OBJETO DE LLAMADO
		ClsProblema2Metodos callObject = new ClsProblema2Metodos();
		
		//VARIABLES
		int mat[][] = new int [4][4];
		int x=0, f, c, opcion=0, numRan=0;
		
		//INICIO DEL CODIGO
		//INTRODUCCION DE DATOS 
		//LLENADO POR FILAS
		for (f=0; f<4; f++)
		{
			for (c=0; c<4; c++)
			{
				x++;
				mat[f][c] = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa numero "+x+" para rellenar la matriz"));
			}
		}
		
		//MENU
		while (opcion!=10)
		{
			opcion = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------------------------------------Menu Pricipal-----------------------------------------\n"
					+ "1.Imprimir la matriz\n"
					+ "2.Calcular la suma de todos los numeros dentro de la matriz\n"
					+ "3.Calcular la suma de los numeros impares de la diagonal secundaria\n"
					+ "4.Imprimir numeros pares de la diagonal principal\n"
					+ "5.Buscar el valor mayor en la fila con direccion 2\n"
					+ "6.Calcular el promedio de los numeros en la columna con direccion 0\n"
					+ "7.Introducir un numero para el cual quieras saber cuantas veces se repite en la matriz\n"
					+ "8.Buscar cuantas veces se repite un valor en la matriz\n"
					+ "9.Rellenar una nueva matriz\n"
					+ "10.Salir\n"
					+ "Selecciona una opcion"));
			
			//DECISIONES
			switch (opcion)
			{
			case 2:
				callObject.sumaNumeros(mat);
				break;
				
			case 3:
				callObject.sumaDiagSec(mat);
				break;
				
			case 4:
				callObject.paresDiagPrin(mat);
				break;
				
			case 5:
				callObject.valorMayor(mat);
				break;
				
			case 6:
				callObject.promedio(mat);
				break;
			
			case 7:
				numRan=callObject.Numero();
				break;
				
			case 8:
				if (numRan==0)
					JOptionPane.showMessageDialog(null,"No puede usar esta opcion sin antes haber usado la opcion 6","Error",0);
				else
					callObject.buscarRepetido(mat, numRan);
				break;
			case 1:
					callObject.imprimirMatriz(mat);
				break;
				
			case 9:
				x=0;
				for (f=0; f<4; f++)
				{
					for (c=0; c<4; c++)
					{
						x++;
						mat[f][c] = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa numero "+x+" para rellenar la matriz"));
					}
				}
				break;
			case 10: 
				JOptionPane.showMessageDialog(null, "Hasta la proxima!", "Despedida", 2);
				break;
				
			default:
				JOptionPane.showMessageDialog(null,"Opcion Incorrecta\nVuelva a introducir una opcion valida","Error",0);
				continue;
			}
		}
	}
}
