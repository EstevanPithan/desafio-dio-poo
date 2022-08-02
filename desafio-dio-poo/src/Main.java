import classes.abstracoes.Bootcamp;
import classes.abstracoes.Curso;
import classes.abstracoes.Dev;
import classes.abstracoes.Mentoria;

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
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEstevan = new Dev();
        devEstevan.setNome("Estevan");
        devEstevan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Estevan:" + devEstevan.getConteudosInscritos());
        devEstevan.progredir();
        devEstevan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Estevan:" + devEstevan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Estevan:" + devEstevan.getConteudosConcluidos());
        System.out.println("XP:" + devEstevan.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
