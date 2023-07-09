import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Thima de Oliveira");
        pessoaFisica.setEmail("thimachal@gmail.com");
        pessoaFisica.setCpf("0123456789");
        pessoaFisica.setRg("88888888888");
        List<PessoaFisica> PF = new ArrayList<PessoaFisica>();

        PF.add(pessoaFisica);

        for (PessoaFisica i: PF) {
            System.out.println("Nome: " + i.getNome() + ", E-mail: " + i.getEmail() + ", CPF: " + i.getCpf()+ ", RG: " + i.getRg());
        }


        PessoaJuridica pessoaJuridica= new PessoaJuridica();
        pessoaJuridica.setNome("CIA THIMA");
        pessoaJuridica.setEmail("ciathima@gmail.com");
        pessoaJuridica.setCnpj("01.234.567-0008-09");
        pessoaJuridica.setInscricaoEstadual(444444444);
        List<PessoaJuridica> PJ = new ArrayList<PessoaJuridica>();

        PJ.add(pessoaJuridica);

        for (PessoaJuridica i: PJ) {
            System.out.println("Razão Social: " + i.getNome() + ", E-mail: " + i.getEmail() + ", CNPJ: " + i.getCnpj()+ ", Inscrição Estadual: " + i.getInscricaoEstadual());
        }

    }
}