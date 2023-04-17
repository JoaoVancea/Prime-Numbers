import java.util.ArrayList;

public class PrimeDirective {
    // Este método recebe um número e calcula seus divisores, retornando se ele é primo ou não
    public boolean isPrime(int givedNumber) {
        int number = givedNumber;
        int divisores = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            return true;
        } else {
            return false;
        }
    }
    // Método responsável por aplicar o método isPrime em cada número de um Array, e adicionar apenas os números primos dentro de um Array próprio
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int number: numbers) {
            if(isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    /* public boolean verificaNumero(int n){
        if(n ==2){
            return true;
        } else if(n == 1){
            return false;
        }

        for(int i = 2; i < n; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    } */

    public static void main(String[] args) {
        PrimeDirective prime = new PrimeDirective();
        int[] numbers = {1, 2, 3, 6, 7, 13, 15};
        ArrayList<Integer> newNumbers = prime.onlyPrimes(numbers);
        System.out.println(newNumbers);
    }
}