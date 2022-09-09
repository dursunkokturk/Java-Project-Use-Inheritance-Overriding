package day3_homework_13;

public class StudentCreditManager extends BaseCreditManager{
	
	// BaseCreditManamger Class Icindeki Fonksiyonu 
	// Burakili Class Icinde Kullanilmasý Islemine 
	// Override denir
	public double Calculate(double amount) {
		return amount * 1.10;
	}
}