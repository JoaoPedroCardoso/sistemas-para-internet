import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    double raioEsfera, volumeEsfera;

        raioEsfera = s.nextDouble();

		volumeEsfera = (4/3.0)*3.14159*Math.pow(raioEsfera, 3);
		
		System.out.printf("VOLUME = %.3f\n", volumeEsfera);
        
        s.close();
	}
}
