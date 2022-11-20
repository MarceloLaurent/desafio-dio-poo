import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Orientação a Objetos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso ANGULAR");
        curso2.setDescricao("Angular Material");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Primeiros passos com a Lingueagem JAVA");
        mentoria.setData(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Formação Java Developer");
        bootcamp.setDescricao("Aprendendo a Linguagem Java do nível básico ao avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        devMarcelo.progredir();
        devMarcelo.progredir();
        System.out.println("Conteúdos Inscritos Marcelo: " + devMarcelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcelo: " + devMarcelo.getConteudosConcluidos());
        System.out.println("XP: " + devMarcelo.calcularTotalXp());

        Dev devLaurentino = new Dev();
        devLaurentino.setNome("Laurentino");
        devLaurentino.inscreverBootcamp(bootcamp);
        devLaurentino.progredir();
        System.out.println("Conteúdos Inscritos Laurentino: " + devLaurentino.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Laurentino: " + devLaurentino.getConteudosConcluidos());
        System.out.println("XP: " + devLaurentino.calcularTotalXp());
    }
}
