import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Bootcamp");
        bootcamp.setDescricao("Descrição Santander Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcos: " + devMarcos.getConteudosConcluidos());
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcos: " + devMarcos.getConteudosConcluidos());

        System.out.println("XP: " + devMarcos.calcularTotalXp());

        System.out.println("______________________________________");

        Dev devLeticia = new Dev();
        devLeticia.setNome("Letícia");
        devLeticia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Letícia: " + devLeticia.getConteudosInscritos());
        devLeticia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Letícia: " + devLeticia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Letícia: " + devLeticia.getConteudosConcluidos());
        System.out.println("XP: " + devLeticia.calcularTotalXp());
    }
}
