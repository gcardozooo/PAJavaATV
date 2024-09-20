/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturadecondicionais;
import java.util.Scanner;
/**
 *
 * @author cardo
 */
public class EstruturadeCondicionais {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        // Nome
        System.out.print("Digite seu nome: ");
        String seuNome = scanner.next();
        System.out.print("Digite o nome da outra pessoa: ");
        String outroNome = scanner.next();
        if (outroNome.equals(seuNome)) {
            System.out.println("Pessoa com o nome igual.");
        } else {
            System.out.println("Pessoa com o nome diferente.");
        }

        // Comparação de idade, peso e altura
        System.out.print("Digite sua idade: ");
        int suaIdade = scanner.nextInt();
        System.out.print("Digite sua altura: ");
        double suaAltura = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        double seuPeso = scanner.nextDouble();

        System.out.print("Digite a idade da outra pessoa: ");
        int idadeOutraPessoa = scanner.nextInt();
        System.out.print("Digite a altura da outra pessoa: ");
        double alturaOutraPessoa = scanner.nextDouble();
        System.out.print("Digite o peso da outra pessoa: ");
        double pesoOutraPessoa = scanner.nextDouble();

        if (idadeOutraPessoa == suaIdade) {
            System.out.println("Pessoa com a mesma idade.");
        } else {
            System.out.println("Pessoa com idade diferente.");
        }

        if (alturaOutraPessoa == suaAltura) {
            System.out.println("Pessoa com a mesma altura.");
        } else {
            System.out.println("Pessoa com altura diferente.");
        }

        if (pesoOutraPessoa == seuPeso) {
            System.out.println("Pessoa com o mesmo peso.");
        } else {
            System.out.println("Pessoa com peso diferente.");
        }

        // Verificação de características iguais
        int caracteristicasIguais = 0;
        if (idadeOutraPessoa == suaIdade) caracteristicasIguais++;
        if (alturaOutraPessoa == suaAltura) caracteristicasIguais++;
        if (pesoOutraPessoa == seuPeso) caracteristicasIguais++;

        if (caracteristicasIguais >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa não é muito parecida comigo.");
        }
    }
}
