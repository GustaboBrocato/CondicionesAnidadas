import java.util.Scanner;

public class condicionesAnidadas
{

	public static void main(String[] args)
	{
		Scanner r = new Scanner(System.in);
		
		//if(condicion)
		//{
		//	sentencias verdaderas;
		//}else if(condicion)
		//{
		//	sentencias verdaderas;
		//}else{
		//	condicion falsas;
		//}

	//Dos equipos, usuario ingreasa cantidad de goles y vamos a revisas si gano el primer eequipo o segundo o si empataron.

		int platense, olimpia;

		System.out.println("Bienvenido, porfavor ingrese el numero de goles que anoto Platense: ");
		platense = r.nextInt();
		System.out.println("Bienvenido, porfavor ingrese el numero de goles que anoto Olimpia: ");
		olimpia = r.nextInt();
		if(platense>olimpia)
		{
			System.out.println("El equipo Platense gano el partido! El marcador es: "+platense+" - "+olimpia);
		}else if(olimpia>platense)
		{
			System.out.println("El equipo Olimpia gano el partido! El marcador es: "+olimpia+" - "+platense);
		}else{
			System.out.println("El partido quedo en empate! El marcador es: "+olimpia+" - "+platense);
		}
	}
}