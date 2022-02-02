public class Calculation {
    private int gcd;
    private int smallerNumber, biggerNumber, diff;

    public Calculation(int num1, int num2) {
		smallerNumber = num1 < num2 ? num1 : num2; //Ternary Operator 
		biggerNumber = num1 > num2 ? num1 : num2; //Ternary Operator 
		if (biggerNumber % smallerNumber == 0) {
			gcd = smallerNumber;
		}
		while(biggerNumber != smallerNumber) {
			diff = biggerNumber - smallerNumber;
			if(diff > smallerNumber) {
				biggerNumber = diff;
			}
			else {
				biggerNumber = smallerNumber;
				smallerNumber = diff;
			}
		}
		gcd = smallerNumber;
    }
    public int getGcd() {
        return gcd;
    }
}
