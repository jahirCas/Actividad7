package PktActividad7;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class ClsProblema1 {

	public static void main(String[] args) {
		UIManager UI=new UIManager();
		// TODO Auto-generated method stub
		int x,mayor = 0,mayor2=0,posicion=0,posicion2=0,posicion3=0,x2=0,menor = 9999;
		int num[]=new int [5];
		int direc[]=new int [5];
		int vec[]=new int [5];
		int mult[]=new int [5];
		String mostrar="",mostrar2="";
		String mostrar3="";
		
		UI.put("OptionPane.background",new Color(139, 211, 240));UI.put("Panel.background",new Color(139, 211, 240));
		for(x=0;x<5;x++){
			num[x] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Numero "+x+" del vector NUM\n"));
			
		}
		for(x=0;x<5;x++){
			vec[x] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Numero "+x+" del vector VEC\n"));
		}
		for(x=0;x<5;x++){
			mult[x]=num[x]*vec[x];
		}
		for(x=0;x<5;x++){
			if (mult[x]<menor) {
				menor=mult[x];
			}
		}
		for(x=0;x<5;x++){
			if(num[x]>mayor) {
				mayor=num[x];
			}
		}
		imprimirArray(num, vec, mult);
		JOptionPane.showMessageDialog(null,"\nEl numero menor del vector mult es: "+menor+"\nEl mayor numero del vector num es: "+mayor);
		
	}
	public static void imprimirArray(int num[], int vec[], int mult[])
	{
		UIManager UI=new UIManager();
		UI.put("OptionPane.background",new Color(139, 211, 240));UI.put("Panel.background",new Color(139, 211, 240));
		JTextArea areaTextoSalida = new JTextArea();
		
		//ESTABLECER LA PRIMERA LINEA DE TEXTO EN AREATEXTOSALIDA
		areaTextoSalida.setText("Direccion\tNUM\tVEC\tMultiplicacion\n");

		for (int x = 0; x<5; x++)
		{
			//ANEXAR UNA LINEA DE TEXTO A AREATEXTOSALIDA
			areaTextoSalida.append(x+ "\t" + num[x] + "\t" + vec[x] + "\t" + mult[x] + "\n");
		}
		//MOSTRAR RESULTADOS
		JOptionPane.showMessageDialog(null, areaTextoSalida, "Impresion",JOptionPane.INFORMATION_MESSAGE);
	}

}

