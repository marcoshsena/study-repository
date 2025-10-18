public class CaixaEletronico {
    public static void main(String[] args) {
       
        // Condicionais Simple e Compostas
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }
        else
            System.out.println("Saldo Insuficiene");
        

        // Condinais Encadeadas
        int nota = 6;
       
       if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
        System.out.println("Prova de Recuperação");

        else
        System.out.println("Reprovado");

        // Condição Ternária
        String resultado = nota >= 7 ? "Aprovado" : nota >+5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        // Switch Case
        String plano = "T"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
    }
}
