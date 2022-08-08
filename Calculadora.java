package calculadora;

import java.util.Scanner;

/**
 *
 * @author BARRIENTOS LOPEZ
 */
public class Calculadora {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        boolean salirPrograma = false;
        while (salirPrograma == false) {
            menu();
            String opcion1;
            opcion1 = entrada.nextLine();

            switch (opcion1) {
                case "1" -> {
                    boolean salirAritmeticas = false;
                    while (salirAritmeticas == false) {
                        aritmeticas();
                        String opcion2;
                        opcion2 = entrada.nextLine();

                        switch (opcion2) {

                            case "1" -> {
                                System.out.println("Ingrese el primer numero: ");
                                int sum1 = entrada.nextInt();
                                System.out.println("Ingrese el segundo numero: ");
                                int sum2 = entrada.nextInt();
                                int a = sum1 + sum2;
                                System.out.println("El resultado es: " + a);
                            }
                            case "2" -> {
                                System.out.println("Ingrese el primer numero: ");
                                int res1 = entrada.nextInt();
                                System.out.println("Ingrese el segundo numero: ");
                                int res2 = entrada.nextInt();
                                int b = res1 - res2;
                                System.out.println("El resultado es: " + b);
                            }
                            case "3" -> {
                                System.out.println("Ingrese el primer numero: ");
                                int mul1 = entrada.nextInt();
                                System.out.println("Ingrese el segundo numero: ");
                                int mul2 = entrada.nextInt();
                                int c = mul1 * mul2;
                                System.out.println("El resultado es: " + c);
                            }
                            case "4" -> {
                                System.out.println("Ingrese el primer numero: ");
                                int div1 = entrada.nextInt();
                                System.out.println("Ingrese el segundo numero: ");
                                int div2 = entrada.nextInt();
                                while (div2 == 0) {
                                    System.out.println("En el denominador se encuentra un cero,");
                                    System.out.println("para evitar errores coloca otro numero.");
                                    div2 = entrada.nextInt();
                                    int d = div1 / div2;
                                    System.out.println("El resultado es: " + d);
                                    break;
                                }
                                int d = div1 / div2;
                                System.out.println("El resultado es: " + d);
                            }

                            case "5" -> {
                                System.out.println("Ingrese el primer numero de la base: ");
                                int pot1 = entrada.nextInt();
                                System.out.println("Ingrese el segundo numero del exponente: ");
                                int pot2 = entrada.nextInt();
                                int potencia = 1;
                                for (int i = 1; i <= pot2; i++) {
                                    potencia = potencia * pot1;
                                }
                                System.out.println("El resultado es: " + potencia);
                            }
                            case "6" ->
                                salirAritmeticas = true;
                            default ->
                                System.out.println("La opción no es correcta");

                        }
                    }
                }
                case "2" -> {
                    boolean salirTrigonometricas = false;
                    while (salirTrigonometricas == false) {
                        trigonometricas();
                        String opcion3;
                        opcion3 = entrada.nextLine();

                        switch (opcion3) {

                            case "1" -> {
                                System.out.println("Ingrese un numero: ");
                                double a = entrada.nextDouble();
                                //  System.out.println(sumatoria(a));
                                //System.out.println(exponente2(a, a));
                                System.out.println(factorial(a));
                            }
                            case "2" -> {
                            }
                            case "3" -> {
                            }
                            case "4" ->
                                salirTrigonometricas = true;
                            default ->
                                System.out.println("La opción no es correcta");

                        }
                    }
                }

                case "3" -> {
                    boolean salirEstadisticas = false;
                    while (salirEstadisticas == false) {
                        estadisticas();
                        String opcion4;
                        opcion4 = entrada.nextLine();

                        switch (opcion4) {

                            case "1" -> {
                                System.out.println("Ingrese tamanio del vector: ");
                                float notas = 0;
                                float promedio = 1;
                                float l = entrada.nextFloat();
                                while (promedio <= l) {
                                    System.out.println("Ingrese sus notas: " + promedio);
                                    float m = entrada.nextFloat();
                                    notas += m;
                                    promedio++;
                                }
                                float promedio1 = notas / l;
                                System.out.println("El promedio de notas es: " + promedio1);

                            }
                            case "2" -> {
                                float media = 0;
                                float promedio3 = 1;
                                System.out.println("Ingrese tamanio del vector: ");
                                int j = (int) entrada.nextFloat();
                                int[] h = new int[j];
                                for (int i = 0; i < h.length; i++) {

                                    float m = entrada.nextFloat();
                                    System.out.print(", ");
                                    media += m;
                                    promedio3++;
                                }
                                float promedio4 = media / j;
                                System.out.println("El promedio de notas es: " + promedio4);
                            }

                            case "3" -> {
                                System.out.println("ingrese tamanio del vector: ");
                                int u = entrada.nextInt();
                                System.out.println("Ingrese sus valores: ");
                                String k = entrada.next();
                                String[] datos = k.split(",");
                                for (int i = 0; i < datos.length; i++) {
                                    System.out.print(datos[i] + ",");
                                }
                                int[] tab = new int[u];
                                for (int i = 0; i < datos.length; i++) {
                                    tab[i] = Integer.valueOf(datos[i]);
                                }
                                double respuesta = moda(tab, u);

                            }
                            case "4" -> {
                                System.out.println("ingrese tamanio del vector: ");
                                int u1 = entrada.nextInt();
                                System.out.println("Ingrese sus valores: ");
                                String k1 = entrada.next();
                                String[] datos1 = k1.split(",");
                                for (int i = 0; i < datos1.length; i++) {
                                    System.out.print(datos1[i] + ",");
                                }
                                int[] tab1 = new int[u1];
                                for (int i = 0; i < datos1.length; i++) {
                                    tab1[i] = Integer.valueOf(datos1[i]);
                                }

                            }
                            case "5" -> {
                            }
                            case "6" ->
                                salirEstadisticas = true;
                            default ->
                                System.out.println("La opción no es correcta");

                        }
                    }
                }
                case "4" -> {
                    boolean salirCalculo = false;
                    while (salirCalculo == false) {
                        calculo();
                        String opcion5;
                        opcion5 = entrada.nextLine();

                        switch (opcion5) {

                            case "1" -> {
                                int var = 0, piv = 0;
                                float matriz[][];
                                System.out.println("Solución de un sistema de ecuaciones NxN por el método Gauss_Jordan");
                                System.out.println("¿Cuantas variables tiene tu sistema?");
                                var = entrada.nextInt();
                                matriz = new float[var][var + 1];
                                for (int x = 0; x < var; x++) {
                                    for (int y = 0; y < (var + 1); y++) {
                                        System.out.println("Ingresa el valor de la posicion: A[" + (x + 1) + "][" + (y + 1) + "]");
                                        matriz[x][y] = entrada.nextFloat();
                                    }

                                }

                                for (int a = 0; a < var; a++) {
                                    pivote(matriz, piv, var);

                                    System.out.println("Renglon " + (a + 1) + " entre el pivote");
                                    muestramatriz(matriz, var);

                                    System.out.println("");

                                    System.out.println("Haciendo ceros");
                                    hacerceros(matriz, piv, var);

                                    muestramatriz(matriz, var);
                                    System.out.println("");
                                    piv++;
                                }
                                for (int x = 0; x < var; x++) {
                                    System.out.println("La variable X" + (x + 1) + " es: " + matriz[x][var]);
                                }

                            }

                            case "2" ->
                                salirCalculo = true;
                            default ->
                                System.out.println("La opción no es correcta");

                        }
                    }
                }
                case "5" ->
                    salirPrograma = true;
                default ->
                    System.out.println("La opción no es correcta");
            }

        }
    }

    public static void menu() {
        System.out.println("======================");
        System.out.println("MENU");
        System.out.println("1. Aritmeticas");
        System.out.println("2. Trigonometricas");
        System.out.println("3. Estadisticas");
        System.out.println("4. Calculo");
        System.out.println("5. Salir");
        System.out.println("======================");
        System.out.println("Ingrese una opcion: ");
    }

    public static void aritmeticas() {
        System.out.println("======================");
        System.out.println("ARITMETICAS");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Potencia");
        System.out.println("6. Salir");
        System.out.println("======================");
        System.out.println("Ingrese una opcion: ");
    }

    public static void trigonometricas() {
        System.out.println("======================");
        System.out.println("TRIGONOMETRICAS");
        System.out.println("1. Seno");
        System.out.println("2. Coseno");
        System.out.println("3. Tangente");
        System.out.println("4. Salir");
        System.out.println("======================");
        System.out.println("Ingrese una opcion: ");
    }

    public static void estadisticas() {
        System.out.println("======================");
        System.out.println("ESTADISTICAS");
        System.out.println("1. Promedio");
        System.out.println("2. Media");
        System.out.println("3. Moda");
        System.out.println("4. Varianza");
        System.out.println("5. Desviacion estandar");
        System.out.println("6. Salir");
        System.out.println("======================");
        System.out.println("Ingrese una opcion: ");
    }

    public static void calculo() {
        System.out.println("======================");
        System.out.println("CALCULO");
        System.out.println("1. Resolver sistema de ecuaciones lineales NxN con Gauss-Jordan");
        System.out.println("2. Salir");
        System.out.println("======================");
        System.out.println("Ingrese una opcion: ");
    }

    private static void pivote(float[][] matriz, int piv, int var) {
        float temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {
            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }

    private static void muestramatriz(float[][] matriz, int var) {
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
                System.out.print(" " + matriz[x][y] + " |");
            }
            System.out.println("");
        }
    }

    private static void hacerceros(float matriz[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                float c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }

    public static double moda(int[] tab, int u) {
        double[] NoRep = new double[u];
        int contador = 0;
        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < NoRep.length; j++) {
                if (NoRep[j] == tab[i]) {
                    break;
                } else {
                    if (NoRep[j] == 0) {
                        NoRep[j] = tab[i];
                        break;
                    }

                }
            }
        }

        int uNoRep = 0;
        for (int i = 0; i < NoRep.length; i++) {
            if (NoRep[i] != 0) {
                uNoRep++;
            }
        }

        double[][] tabla = new double[uNoRep][2];

        for (int i = 0; i < uNoRep; i++) {
            tabla[i][0] = NoRep[i];
        }

        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < tabla.length; j++) {
                if (tabla[j][0] == tab[i]) {
                    tabla[j][1]++;
                }
            }

        }
        System.out.println("");

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("La moda es: " + tabla[0][0]);

        return 0.0;
    }

    public static double exponente(double n) {
        double resultado = 1;
        for (int i = 0; i < n; i++) {
            resultado = resultado * (-1);
        }
        return resultado;
    }

    public static double exponente2(double n, double x) {
        double resultado = 1;
        double exponente = ((2 * n) + 1);

        for (int i = 0; i < exponente; i++) {
            resultado = resultado * x;
        }
        return resultado;
    }

    public static double factorial(double n) {
        double suma = ((2 * n) + 1);
        int factorial = 1;
        for (int i = 1; i <= suma; i++) {
            factorial = i * factorial;
        }
        return factorial;

    }

    public static double sumatoria(double x) {
        double n = 0;
        double suma = 0;
        while (n <= x) {
            double numerador = (exponente(n) * exponente2(n, x));
            double denominador = factorial(n);
            suma = suma + (numerador / denominador);
            n++;
        }
        return suma;
    }
}

/*System.out.println("Ingrese un numero: ");
                                double seno = entrada.nextDouble();
                                int potencia2 = 1;
                                for (int i = 1; i <= seno; i++) {
                                    potencia2 = potencia2 * -1;
                                }
                                int factorial = 1;
                                for (int i = 1; i <= seno; i++) {
                                    factorial = i * factorial;
                                }*/
