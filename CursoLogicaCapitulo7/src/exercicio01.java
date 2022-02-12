/* Cadastrando as tarefas do dia */

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tarefasDoDia = new String[5];

        System.out.println("Digite as suas 5 principais tarefas do dia: ");

        System.out.print("1º Tarefa: ");
        tarefasDoDia[0] = scanner.next();

        System.out.print("2º Tarefa: ");
        tarefasDoDia[1] = scanner.next();

        System.out.print("3º Tarefa: ");
        tarefasDoDia[2] = scanner.next();

        System.out.print("4º Tarefa: ");
        tarefasDoDia[3] = scanner.next();

        System.out.println("5º Tarefa: ");
        tarefasDoDia[4] = scanner.next();

        for (int i = 0; i < tarefasDoDia.length; i++) {
            System.out.println(tarefasDoDia[i]);
        }




    }
}
