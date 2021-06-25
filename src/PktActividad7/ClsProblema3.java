package PktActividad7;

import java.awt.Color;

import javax.swing.JOptionPane;

public class ClsProblema3 {

	public static void main(String[] args) {
		ClsProblema3Metodos metodos = new ClsProblema3Metodos();
		// TODO Auto-generated method stub
		int opcion;
		int matriz[][][]= new int [3][3][3];
	
		for (int k=0;k<3;k++) {
			for (int j=0; j<3;j++) {
				for(int i=0;i<3;i++) {
					matriz[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor para la posicion [" +(i+1) + ","+(j+1) +","+(j+1)+ "] de la matriz"));
				}
			}
		}
		do {
		opcion = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "--------------------Menu Pricipal-----------------------\n"
				+ "1.Busque e imprima el menor valor en la profundidad con dirección 2\n"
				+ "2.Calcule e imprima el total de impares almacenados en la columna con dirección 0\n"
				+ "3.Calcule e imprimir el promedio de cada diagonal principal de cada profundidad\n"
				+ "4.Calcule el total de números entre 35 y 55 almacenado en la matriz.\n"
				+ "5.Salir\n"
				+ "Selecciona una opcion\n"));
		switch(opcion) {
		
		case 1:
			metodos.MtdMenor3d(matriz);
			continue;
		case 2:
			metodos.MtdPromMatriz(matriz);
			continue;
		case 3:
			metodos.MtdpromeDiagPrint(matriz);
			continue;
		case 4:
			metodos.MtdEntre(matriz);
			continue;
		case 5:
			JOptionPane.showMessageDialog(null, "Hasta la proxima!","Salida",0);
			break;
		default:
			JOptionPane.showMessageDialog(null,"Opcion Incorrecta,Intenta ingresar otro numero","Error", 0);
			continue;
		}
	}while(opcion!=5);
		
	}

}
