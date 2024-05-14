package edu.kaua.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "kauã";
        String segundoNome = "ferro";
        int dataNascimento = 28;
        boolean verdadeiro = false;

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
       
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método" + " " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
