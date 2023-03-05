public class exercicio01 {
    public static void main(String[] args) {
        
       int valor01 = 10;
       int valor02 = 20;
       int resultado = valor01 + valor02;
       System.out.println(resultado);
       
       segundaParteDoExercicio();
    }
    
    public static void segundaParteDoExercicio() {
        double precoDeCusto = 100.00;
        int percentualDeLucro = 30;
        double calculoDePorcentagem = percentualDeLucro * precoDeCusto / 100;
        double precoDeVenda = precoDeCusto + calculoDePorcentagem;
        System.out.println("O preço da venda é: "+ precoDeVenda);
        
        terceiraParteDoExercicio();
    }
    public static void terceiraParteDoExercicio() {
        String nomeDoAluno = "Jonathan Cortoppassi";
        int anoDeIngresso = 2022;
        String nomeDoCurso = "Analise e Desenvolvimento de Sistemas";
        int disciplinasCursadas = 2;
        int numeroDeCreditos = disciplinasCursadas * 4;
        System.out.println("O saldo em creditos de " + nomeDoAluno + " são de: "
        + numeroDeCreditos + " Ingressou na faculdade no ano de: " + anoDeIngresso
        + " esta cursando " + nomeDoCurso);
          
    }
}