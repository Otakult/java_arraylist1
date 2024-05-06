import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaPessoa = new ArrayList<>();

        Pessoa pedro = new Pessoa();
        pedro.setNome("Pedro");
        pedro.setIdade(19);

        Pessoa maria = new Pessoa();
        maria.setNome("Maria Silva da Penha");
        maria.setIdade(12);

        Pessoa carlos = new Pessoa();
        carlos.setNome("Carlos Almeida Batista da Nossa Senhora Aparecida");
        carlos.setIdade(31);

        listaPessoa.add(pedro);
        listaPessoa.add(maria);
        listaPessoa.add(carlos);

        System.out.println(listaPessoa.size());
        System.out.println(listaPessoa.get(0));

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaPessoa) {
            System.out.println(pessoa);
        }

    }
}