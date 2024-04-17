package aula7;

//parametro é apenas usado quando se precisa de retorno
// no final retornamos o valor ou variavel desejada.
//se o if só tiver uma linha, não é necessário { }
// void é um tipo sem retorno, não precisa ser int ou etc, é um metodo vazio

import java.util.Scanner;

public class Exemplo1 {

    //funcão para entrada de dados
    public static int entradaDados() {
        System.out.println("*-* Entrada de Dados *-*");
        Scanner input = new Scanner(System.in);
        System.out.println("Número: ");
        int n = input.nextInt();
        return n;
    }

    //funcão para descobrir os valores
    public static int minimo(int n1, int n2) {
        System.out.println("#--Mínimo--#");
        if (n1 < n2) {
            return n1;
        } else {
            return n2;
        }
    }
    
    public static void imprimir(int menor){
        System.out.println("¨¨¨Ïmprimir¨¨¨¨");
        System.out.println("Menor: " + menor);
    }
    
    public static void main(String[] args) {
        System.out.println("Programa principal");
        int x = entradaDados();
        int y = entradaDados();
        int menor = minimo(x, y);
        imprimir(menor);
    }
}
