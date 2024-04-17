package Funcoes;
import java.util.Scanner;

//parametro é apenas usado quando se precisa de retorno
// no final retornamos o valor ou variavel desejada.
// void é um tipo sem retorno, não precisa ser int ou etc, é um

public class Exemplo1 {
    //funcão para entrada de dados.
    public static int entradaDados() { //public static int, pois irei trabalhar em cma de um número inteiro.
        System.out.println("*-* Entrada de Dados *-*");
        Scanner input = new Scanner(System.in); //solicito a inserção de dados.
        System.out.println("Número: ");
        int n = input.nextInt(); //a variável n receberá os dados inseridos.
        return n; // quero que o retorno seja n.
    }

    //funcão para descobrir os valores
    public static int minimo(int n1, int n2) { //informo que o usuario deverá inserir dois valores, n1 e n2, no caso dois parâmetros.
        System.out.println("#--Mínimo--#");
        if (n1 < n2) { //se n1 for menor que n2.
            return n1; //me retorne n1.
        } else { //se não
            return n2; //me retorne n2.
        }
    }

    //impressão do numero menor da função acima, com apenas um parâmetro.
    public static void imprimir(int menor){ //como não precisamos de retorno, e sim apenas da impressão de dados, utilizamos o void.
        System.out.println("¨¨¨Ïmprimir¨¨¨¨");
        System.out.println("Menor: " + menor);
    }

    public static void main(String[] args) {
        System.out.println("Programa principal");
        int x = entradaDados(); //a variável n1, agora se torna x, chamando a primeira função de entrada de dados.
        int y = entradaDados(); //a variável n2, agora se torna y, chamando a primeira função de entrada de dados.
        int min = minimo(x, y); // a variavel menor, agora se torna min, chamando a função minimo com os parâmetros x e y (n1 e n2).
        imprimir(min); //solicito a impressão do número menor, chamando a variável imprimir com o parâmetro de min.
    }
}


