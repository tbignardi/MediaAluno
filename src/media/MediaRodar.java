package media;
import java.util.*;

public class MediaRodar {

	public static void main(String[] args) {
		
		Media media = new Media();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero:");
		int numero2 = scanner.nextInt();
	
		System.out.println("Digite o terceiro numero:");
		int numero3 = scanner.nextInt();
		
		media.somar(numero1, numero2, numero3);
		
		media.exibir();
		
		
	}
		
}	