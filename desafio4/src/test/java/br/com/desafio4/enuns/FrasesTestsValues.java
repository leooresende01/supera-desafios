package br.com.desafio4.enuns;

import java.util.ArrayList;
import java.util.Arrays;

public enum FrasesTestsValues {
    FRASE1("I ENIL SIHTHSIREBBIG S", "THIS LINE IS GIBBERISH"),
    FRASE2("LEVELKAYAK", "LEVELKAYAK"),
    FRASE3("KAYAKLEVEL", "KAYAKLEVEL"),
    FRASE4("H YPPAHSYADILO", "HAPPY HOLIDAYS"),
    FRASE5("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "MLKJIHGFEDCBAZYXWVUTSRQPON"),
    FRASE6("MNOPQRSTUVWXYZABCDEFGHIJKL", "YXWVUTSRQPONMLKJIHGFEDCBAZ"),
    FRASE7("VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE", "FRENCH HENS TWO DOVES AND A PARTRIDGE ");

    private final String fraseEmbaralhada;
    private final String fraseDesembaralhada;

    FrasesTestsValues(String fraseEmbaralhada, String fraseDesemaralhada) {
        this.fraseEmbaralhada = fraseEmbaralhada;
        this.fraseDesembaralhada = fraseDesemaralhada;
    }

    public static ArrayList<FrasesTestsValues> valores() {
        return new ArrayList<>(Arrays.asList(FrasesTestsValues.values()));
    }

    public String getFraseEmbaralhada() {
        return this.fraseEmbaralhada;
    }

    public String getFraseDesembaralhada() {
        return this.fraseDesembaralhada;
    }
}
