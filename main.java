package Desafios.intermed6;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        LinkedList<Ninja> listDeNinja = new LinkedList();
        int busca;

        while (true) {
            System.out.print("\nMenu:\n" +
                    "1 - Registar\n" +
                    "2 - Mostrar registrador\n" +
                    "3 - Mostrar primeiro na lista\n" +
                    "4 - Mostrar ultimo da lista\n" +
                    "5 - Remover por posicao\n" +
                    "6 - Buscar ninja\n" +
                    "7 - Sair\n" +
                    "Acesso: ");
            int numeroMenu = menu.nextInt();
            System.out.println();
            switch (numeroMenu){
                case 1:
                    listDeNinja.addFirst(new Ninja());
                    break;

                case 2:
                    if(listDeNinja.isEmpty()) {
                        System.out.println("a lista esta vazia!");
                    } else {
                        for (Ninja ninja : listDeNinja) {
                            System.out.println(ninja);
                        }
                    }
                    break;

                case 3:
                    if (listDeNinja.isEmpty()){
                        System.out.println("a lista esta vazia!");
                    } else {
                        System.out.println("O Primeiro da lista: " + listDeNinja.getFirst());
                    }
                    break;
                case 4:
                    if (listDeNinja.isEmpty()){
                    System.out.println("a lista esta vazia!");
                } else {
                    System.out.println("O Ultimo da Lista: " + listDeNinja.getLast());
                }
                    break;
                case 5:
                    if (listDeNinja.isEmpty()){
                        System.out.println("a lista esta vazia!");
                    } else {
                        System.out.println("Qual deseja remover? ");
                        busca = menu.nextInt();
                        busca = busca - 1;
                        System.out.println("Ninja removido: " + listDeNinja.get(busca));
                        listDeNinja.remove(busca);
                    }
                    break;
                case 6:
                    if (listDeNinja.isEmpty()){
                    System.out.println("a lista esta vazia!");
                    } else {
                        System.out.println("Qual deseja buscar? ");
                        busca = menu.nextInt();
                        busca = busca - 1;
                        System.out.println("Ninja Buscado: " + listDeNinja.get(busca));
                        break;
                    }
                case 7:
                    System.out.println("Saindo...");
                    menu.close();
                    return;
                default:
                    System.out.println("Opção inválida.");

            }
        }
    }
}