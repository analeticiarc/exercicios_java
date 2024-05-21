import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		//declaração de variáveis
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		//saída de dados
		 System.out.printf("Products:\n%s, which price is R$%.2f\n%s, which price is R$%.2f\n", product1, price1, product2, price2);
		 System.out.printf("\n");
		 System.out.println("Record: " + age + " years old, code " + code + " and gender: " + 'F');
		 System.out.printf("\n");
		 System.out.printf("Mesuare with eight decimal places: %.8f\nRuded (three decimal places): %.3f\nUS decimal point: ", measure, measure);
		 Locale.setDefault(Locale.US);
		 System.out.println(measure);
		
	}
}
