package pl.exercise.lukas.main;

import pl.exercise.lukas.model.Rekurencja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("podaj liczbę: " + " ");
        Scanner scanner = new Scanner(System.in);

        double w = scanner.nextDouble();

        Rekurencja rekurencja = new Rekurencja();
        double silnia = rekurencja.wykonajSilnie(w);


        System.out.println("podana silnia wynosi: " + " " + silnia );
    }
}
