
class ThrowExmp{
    public static void main(String[] args){
        int numerator = 1;
        int denominator = 0;
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            System.out.println(numerator / denominator);
        }
    }
}