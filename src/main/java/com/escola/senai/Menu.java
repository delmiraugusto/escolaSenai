package com.escola.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu{

   public static List<Aluno> listaAluno  = new ArrayList<>();
   public static List<Professor> listaProfessor  = new ArrayList<>();

    public static void menuAluno(){
        
        int opcao;
    
        do {
            Scanner sc = new Scanner(System.in);
    
                System.out.println("\n----- MENU -----");
                System.out.println("O que deseja fazer?");
                System.out.println("1- Cadastrar novo aluno");
                System.out.println("2- Atualizar aluno");
                System.out.println("3- Deletar aluno");
                System.out.println("4- Listar alunos");
                System.out.println("0- Sair\n");
                System.out.print("Digite uma opção: ");
                opcao = sc.nextInt();
    
                switch (opcao) {
                    case 1:
                        cadastrarAluno();
                        break;
                    case 2:
                        atualizarAluno();
                        break;
                    case 3:
                        removerAluno();
                        break;
                    case 4:
                        listarAlunos();
                        break;
                    case 0:
                        System.out.println("Programa Finalizado!\n");
                        break;
                    default:
                        System.out.println("Número Inválido\n");
                        break;
                }
            }while(opcao != 0);
        }
    
        public static void cadastrarAluno(){
            System.out.println("	Cadastre o Novo Aluno	");
            Scanner sc = new Scanner(System.in);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            listaAluno.add(aluno);
            System.out.println("ALUNO CADASTRADO");
        }
    
        public static void atualizarAluno(){
            if(listaAluno.isEmpty()){
                System.out.println("A lista está vazia");
            }else{
                System.out.print("Nome do Aluno que deseja atualizar: ");
                Scanner sc = new Scanner(System.in);
                String nomeAtualizar = sc.nextLine();
                int contador = 0;
                for (Aluno aluno : listaAluno) {
                    if(aluno.getNome().equals(nomeAtualizar)){
                        System.out.print("Qual o novo nome do Aluno: ");
                        String nome = sc.nextLine();
                        aluno.setNome(nome);
                        System.out.println("Aluno modificado com sucesso");
                        contador = 0;
                    }else{
                        contador++;
                    }
                }
                if(contador == listaAluno.size()){
                    System.out.println("Aluno nao encontrado");
                }
            }      
        }
    
        public static void removerAluno(){
            if(listaAluno.isEmpty()){
                System.out.println("Lista de Alunos está Vazia");
            }else{
                System.out.print("Nome do Aluno que deseja remover: ");
                Scanner sc = new Scanner(System.in);
                String remover = sc.nextLine();
                int contador = 0;
                for (int i = 0; i < listaAluno.size(); i++) {
                    if (listaAluno.get(i).getNome().equals(remover)) {
                        listaAluno.remove(i);
                        System.out.println("Aluno removido com sucesso");
                        contador = 0;
                    }else{
                        contador++;
                    }
                }
                if(contador == listaAluno.size()){
                    System.out.println("Aluno nao encontrado");
                }
            }
        }
    
        public static void listarAlunos(){
            if(listaAluno.isEmpty()){
                System.out.println("  A Lista está Vazia   ");
            }else{
                System.out.println("   Lista dos Alunos   ");
                for (int i = 0; i < listaAluno.size(); i++) {
                    Aluno aluno = listaAluno.get(i);
                    System.out.println((i + 1) + "- " + aluno.getNome());
                }
            }
        }

        public static void menuProfessor(){
        
            int opcao;
        
            do {
                Scanner sc = new Scanner(System.in);
        
                    System.out.println("\n----- MENU -----");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1- Cadastrar novo Professor");
                    System.out.println("2- Atualizar Professor");
                    System.out.println("3- Deletar Professor");
                    System.out.println("4- Listar Professor");
                    System.out.println("0- Sair\n");
                    System.out.print("Digite uma opção: ");
                    opcao = sc.nextInt();
        
                    switch (opcao) {
                        case 1:
                            cadastrarProfessor();
                            break;
                        case 2:
                            atualizarProfessor();
                            break;
                        case 3:
                            removerProfessor();
                            break;
                        case 4:
                            listarProfessores();
                            break;
                        case 0:
                            System.out.println("Programa Finalizado!\n");
                            break;
                        default:
                            System.out.println("Número Inválido\n");
                            break;
                    }
                }while(opcao != 0);
            }
        
            public static void cadastrarProfessor(){
                System.out.println("	Cadastre o Novo Professor	");
                Scanner sc = new Scanner(System.in);
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                Professor professor = new Professor();
                professor.setNome(nome);
                listaProfessor.add(professor);
                System.out.println("PROFESSOR CADASTRADO");
            }
        
            public static void atualizarProfessor(){
                if(listaProfessor.isEmpty()){
                    System.out.println("A lista está vazia");
                }else{
                    System.out.println("	Atualizar o Professor   ");
                    System.out.print("Professor do Aluno que deseja atualizar: ");
                    Scanner sc = new Scanner(System.in);
                    String nomeAtualizar = sc.nextLine();
                    int contador = 0;
                    for (Professor professor : listaProfessor) {
                        if(professor.getNome().equals(nomeAtualizar)){
                            System.out.print("Qual o novo nome do Professor: ");
                            String nome = sc.nextLine();
                            professor.setNome(nome);
                            System.out.println("Professor modificado com sucesso");
                            contador = 0;
                        }else{
                            contador++;
                        }
                    }
                    if(contador == listaProfessor.size()){
                        System.out.println("Professor nao encontrado");
                    } 
                }     
            }
        
            public static void removerProfessor(){
                if(listaProfessor.isEmpty()){
                    System.out.println("Não há professor para remover");
                }else{
                    System.out.print("Nome do Professor que deseja remover: ");
                    Scanner sc = new Scanner(System.in);
                    String remover = sc.nextLine();
                    int contador = 0;
                    for (int i = 0; i < listaProfessor.size(); i++) {
                        if (listaProfessor.get(i).getNome().equals(remover)) {
                            listaProfessor.remove(i);
                            System.out.println("Professor removido com sucesso");
                            contador = 0;
                        }else{
                            contador++;
                        }
                    }
                    if(contador == listaProfessor.size()){
                        System.out.println("Professor nao encontrado");
                    }
                }
            }
        
            public static void listarProfessores(){
                if(listaAluno.isEmpty()){
                    System.out.println("   A Lista está Vazia   ");
                }else{
                    System.out.println("   Lista dos Professores   ");
                    for (int i = 0; i < listaProfessor.size(); i++) {
                        Professor professor = listaProfessor.get(i);
                        System.out.println((i + 1) + "- " + professor.getNome());
                    }
                }
            }
}
