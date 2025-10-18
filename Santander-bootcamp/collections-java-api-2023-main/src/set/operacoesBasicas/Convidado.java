package set.operacoesBasicas;

public class Convidado {

    private String nome;
    private int condigoConvite;
    
    public Convidado(String nome, int condigoConvite) {
        this.nome = nome;
        this.condigoConvite = condigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCondigoConvite() {
        return condigoConvite;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + condigoConvite;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (condigoConvite != other.condigoConvite)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", condigoConvite=" + condigoConvite + "]";
    }
    
}
