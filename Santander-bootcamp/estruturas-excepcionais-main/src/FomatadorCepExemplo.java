public class FomatadorCepExemplo {
    public static void main(String[] args) {
        String meuCep = formatarCep(**)
    }
        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();
            
              //simulando um cep formatado
              return "23.765-064";
    
    }
}
