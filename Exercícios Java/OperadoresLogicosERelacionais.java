/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoreslogicoserelacionais;
import java.util.Scanner;
/**
 *
 * @author cardo
 */
public class OperadoresLogicosERelacionais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade > 21) {
            System.out.println("A pessoa tem mais de 21 anos.");
        } else {
            System.out.println("A pessoa tem 21 anos ou menos.");
        }

        // Salário
        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();
        double salarioMinimo = 1212.00; // Valor atual do salário mínimo
        if (salario > 5 * salarioMinimo) {
            System.out.println("O salário é maior que 5 vezes o salário mínimo.");
        } else {
            System.out.println("O salário não é maior que 5 vezes o salário mínimo.");
        }

        // Altura
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        if (altura > 1.75) {
            System.out.println("A pessoa tem mais de 1,75m.");
        } else {
            System.out.println("A pessoa tem 1,75m ou menos.");
        }

        // Peso
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();
        if (peso > 70) {
            System.out.println("O peso é maior que 70kg.");
        } else {
            System.out.println("O peso não é maior que 70kg.");
        }

        // Sobrenome
        System.out.print("Digite seu sobrenome: ");
        String seuSobrenome = scanner.next();
        System.out.print("Digite o sobrenome da outra pessoa: ");
        String outroSobrenome = scanner.next();
        if (!outroSobrenome.equals(seuSobrenome)) {
            System.out.println("O sobrenome é diferente do seu.");
        } else {
            System.out.println("O sobrenome é igual ao seu.");
        }

        // Gênero
        System.out.print("Digite o gênero (m/f): ");
        char genero = scanner.next().charAt(0);
        if (genero == 'f') {
            System.out.println("A pessoa é do gênero feminino.");
        } else {
            System.out.println("A pessoa não é do gênero feminino.");
        }
    }
}
