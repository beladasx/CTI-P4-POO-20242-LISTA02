package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int anoAtual;
        double salario, percentual, novoSalario;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        salario = 1000.0;
        percentual = 1.5 / 100;
        novoSalario = salario + percentual * salario;

        for (int i = 2007; i <= anoAtual; i++) {
            percentual *= 2;
            novoSalario += novoSalario * percentual;
        }

        System.out.println("O salário atual é: R$ " + novoSalario);
    }
}
