import java.util.Scanner;

class exercicio11 {
  public static void main(String[] args) {
    int numero1, numero2;
    double numero3, letraa, letrab, letrac,cubo;

    try (Scanner teclado = new Scanner(System.in)) {
        System.out.println("Me informe o primeiro numero inteiro");
        numero1 = teclado.nextInt();
   System.out.println(" Informe o segundo numero inteiro");
        numero2 = teclado.nextInt();
        System.out.println(" Informe o terceiro numero real");
        numero3 = teclado.nextDouble();
    }
    letraa = (numero1*2)+(numero2/2);
    letrab = (numero1*3)+numero3;
    cubo = 3;
    letrac = (Math.pow(numero3,cubo));

    System.out.println("letra a: O produto do dobro do primeiro com metade do segundo é " + letraa);
    System.out.println("letra b: A soma do triplo do primeiro com o terceiro é " + letrab);
    System.out.println("letra c: O terceiro elevado ao cubo é " + letrac);
  }
}