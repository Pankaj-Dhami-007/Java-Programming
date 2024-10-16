class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int subtract(int a, int b){
        return a-b;

    }
    int multiply(int a, int b){
        return a*b;
    }
}

class AdvancedCalculator extends Calculator{

    @Override
    int add(int a, int b) {
        // TODO Auto-generated method stub
        return super.add(a, b);
    }

    @Override
    int multiply(int a, int b) {
        // TODO Auto-generated method stub
        return super.multiply(a, b);
    }

    @Override
    int subtract(int a, int b) {
        // TODO Auto-generated method stub
        return super.subtract(a, b);
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class Overriding {
    public static void main(String[] args) {
        AdvancedCalculator calculator = new AdvancedCalculator();
        int sumTwo = calculator.add(10, 20);
        System.out.println("Two nums sum is: "+sumTwo);

        System.out.println("Three nums sum is: "+calculator.add(sumTwo, sumTwo, sumTwo));
    }
}
