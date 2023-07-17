package br.com.desafio2.infra.util.provider;


import java.util.Objects;
import java.util.Scanner;

public class ScannerProvider {
    private static Scanner scanner;

    public static Scanner getScanner() {
        ScannerProvider.criaInstancia();
        return ScannerProvider.scanner;
    }

    private static void criaInstancia() {
        if (Objects.isNull(ScannerProvider.scanner)) {
            ScannerProvider.scanner = new Scanner(System.in);
        }
    }
}
