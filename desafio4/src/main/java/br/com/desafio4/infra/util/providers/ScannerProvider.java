package br.com.desafio4.infra.util.providers;


import java.util.Scanner;

import java.util.Objects;

public class ScannerProvider {
    private static Scanner scanner;

    public static Scanner getScanner() {
        ScannerProvider.createInstance();
        return ScannerProvider.scanner;
    }

    private static void createInstance() {
        if (Objects.isNull(ScannerProvider.scanner)){
            ScannerProvider.scanner = new Scanner(System.in);
        }
    }

    public static void closeScanner() {
        ScannerProvider.scanner.close();
    }
}
