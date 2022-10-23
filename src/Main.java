import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("descricao do java");
        curso1.setCargaHoraria(50);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("poo");
        mentoria.setDescricao("descricaco mentoria");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }

    
    
}
