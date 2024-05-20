package com.example;

import java.util.Scanner;

public class ConvertidorDeUnidades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido a la calculadora de  conversiones de unidades.");

        do {
            System.out.println("Seleccione el tipo de conversión:");
            System.out.println("1. Longitud");
            System.out.println("2. Masa");
            System.out.println("3. Temperatura");
            System.out.println("4. Volumen");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirLongitud(scanner);
                    break;
                case 2:
                    convertirMasa(scanner);
                    break;
                case 3:
                    convertirTemperatura(scanner);
                    break;
                case 4:
                    convertirVolumen(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void convertirLongitud(Scanner scanner) {
        System.out.println("Seleccione las unidades de longitud:");
        System.out.println("1. Metros a Kilómetros");
        System.out.println("2. Kilómetros a Metros");
        System.out.println("3. Metros a Centímetros");
        System.out.println("4. Centímetros a Metros");
        System.out.println("5. Metros a Pulgadas");
        System.out.println("6. Pulgadas a Metros");
        System.out.println("7. Metros a Pies");
        System.out.println("8. Pies a Metros");

        int opcionLongitud = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        double resultado = 0;

        switch (opcionLongitud) {
            case 1:
                resultado = valor / 1000;
                System.out.println(valor + " metros son " + resultado + " kilómetros.");
                break;
            case 2:
                resultado = valor * 1000;
                System.out.println(valor + " kilómetros son " + resultado + " metros.");
                break;
            case 3:
                resultado = valor * 100;
                System.out.println(valor + " metros son " + resultado + " centímetros.");
                break;
            case 4:
                resultado = valor / 100;
                System.out.println(valor + " centímetros son " + resultado + " metros.");
                break;
            case 5:
                resultado = valor * 39.3701;
                System.out.println(valor + " metros son " + resultado + " pulgadas.");
                break;
            case 6:
                resultado = valor / 39.3701;
                System.out.println(valor + " pulgadas son " + resultado + " metros.");
                break;
            case 7:
                resultado = valor * 3.28084;
                System.out.println(valor + " metros son " + resultado + " pies.");
                break;
            case 8:
                resultado = valor / 3.28084;
                System.out.println(valor + " pies son " + resultado + " metros.");
                break;
            default:
                System.out.println("Opción inválida, intente de nuevo");
        }
    }

    private static void convertirMasa(Scanner scanner) {
        System.out.println("Seleccione las unidades de masa:");
        System.out.println("1. Gramos a Kilogramos");
        System.out.println("2. Kilogramos a Gramos");
        System.out.println("3. Gramos a Libras");
        System.out.println("4. Libras a Gramos");
        System.out.println("5. Kilogramos a Libras");
        System.out.println("6. Libras a Kilogramos");

        int opcionMasa = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        double resultado = 0;

        switch (opcionMasa) {
            case 1:
                resultado = valor / 1000;
                System.out.println(valor + " gramos son " + resultado + " kilogramos.");
                break;
            case 2:
                resultado = valor * 1000;
                System.out.println(valor + " kilogramos son " + resultado + " gramos.");
                break;
            case 3:
                resultado = valor * 0.00220462;
                System.out.println(valor + " gramos son " + resultado + " libras.");
                break;
            case 4:
                resultado = valor / 0.00220462;
                System.out.println(valor + " libras son " + resultado + " gramos.");
                break;
            case 5:
                resultado = valor * 2.20462;
                System.out.println(valor + " kilogramos son " + resultado + " libras.");
                break;
            case 6:
                resultado = valor / 2.20462;
                System.out.println(valor + " libras son " + resultado + " kilogramos.");
                break;
            default:
                System.out.println("Opción inválida, intente de nuevo");
        }
    }

    private static void convertirTemperatura(Scanner scanner) {
        System.out.println("Seleccione las unidades de temperatura:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Celsius a Kelvin");
        System.out.println("4. Kelvin a Celsius");
        System.out.println("5. Fahrenheit a Kelvin");
        System.out.println("6. Kelvin a Fahrenheit");

        int opcionTemperatura = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        double resultado = 0;

        switch (opcionTemperatura) {
            case 1:
                resultado = (valor * 9 / 5) + 32;
                System.out.println(valor + " grados Celsius son " + resultado + " grados Fahrenheit.");
                break;
            case 2:
                resultado = (valor - 32) * 5 / 9;
                System.out.println(valor + " grados Fahrenheit son " + resultado + " grados Celsius.");
                break;
            case 3:
                resultado = valor + 273.15;
                System.out.println(valor + " grados Celsius son " + resultado + " Kelvin.");
                break;
            case 4:
                resultado = valor - 273.15;
                System.out.println(valor + " Kelvin son " + resultado + " grados Celsius.");
                break;
            case 5:
                resultado = (valor - 32) * 5 / 9 + 273.15;
                System.out.println(valor + " grados Fahrenheit son " + resultado + " Kelvin.");
                break;
            case 6:
                resultado = (valor - 273.15) * 9 / 5 + 32;
                System.out.println(valor + " Kelvin son " + resultado + " grados Fahrenheit.");
                break;
            default:
                System.out.println("Opción inválida, intente de nuevo");
        }
    }

    private static void convertirVolumen(Scanner scanner) {
        System.out.println("Seleccione las unidades de volumen:");
        System.out.println("1. Litros a Mililitros");
        System.out.println("2. Mililitros a Litros");
        System.out.println("3. Litros a Galones");
        System.out.println("4. Galones a Litros");
        System.out.println("5. Litros a Onzas Líquidas");
        System.out.println("6. Onzas Líquidas a Litros");
        int opcionVolumen = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        double resultado = 0;

        switch (opcionVolumen) {
            case 1:
                resultado = valor * 1000;
                System.out.println(valor + " litros son " + resultado + " mililitros.");
                break;
            case 2:
                resultado = valor / 1000;
                System.out.println(valor + " mililitros son " + resultado + " litros.");
                break;
            case 3:
                resultado = valor * 0.264172;
                System.out.println(valor + " litros son " + resultado + " galones.");
                break;
            case 4:
                resultado = valor / 0.264172;
                System.out.println(valor + " galones son " + resultado + " litros.");
                break;
            case 5:
                resultado = valor * 33.814;
                System.out.println(valor + " litros son " + resultado + " onzas líquidas.");
                break;
            case 6:
                resultado = valor / 33.814;
                System.out.println(valor + " onzas líquidas son " + resultado + " litros.");
                break;
            default:
                System.out.println("Opción inválida, intente de nuevo");
        }
    }
}