/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 *
 * @author w
 */
public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao curso java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descricao curso JS");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de JS");
        mentoria1.setDescricao("Descricao mentoria de JS");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos de Victor: " + devVictor.getConteudosInscritos());
        devVictor.progredir();
        System.out.println("Conteudos Incritos de Victor: " + devVictor.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Victor: " + devVictor.getConteudosConcluidos());
        System.out.println("XP: "+devVictor.calcularTotalXp());
        
        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos de Marcos: " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        System.out.println("Conteudos Incritos de Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Marcos: " + devMarcos.getConteudosConcluidos());
        System.out.println("XP: "+devMarcos.calcularTotalXp());
    }

}
