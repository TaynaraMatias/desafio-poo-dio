import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devTaynara = new Dev();
        devTaynara.setNome("Taynara");
        devTaynara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devTaynara.getConteudosInscritos());

        devTaynara.progredir();
        System.out.println("Conteúdos Inscritos" + devTaynara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devTaynara.getConteudosConcluido());
        System.out.println("XP: " + devTaynara.calcularTotalXp());

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        System.out.println("Conteúdos Concluídos" + devFelipe.getConteudosConcluido());
        System.out.println("XP: " + devFelipe.calcularTotalXp());
    }
}
