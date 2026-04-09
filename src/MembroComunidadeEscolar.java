public class MembroComunidadeEscolar extends persona {
    private int codigoCentro;
    private String nomeCentro;

    public MembroComunidadeEscolar (String nom, String dni, int edade, int codCentro, String nomCentro){
        super(nom, dni, edade);
        codigoCentro = codCentro;
        nomeCentro = nomCentro;
    }

    public int getCodigoCentro(){
        return codigoCentro;
    }

    public void setCodigoCentro(int novoCodCentro){
        if (novoCodCentro>0) codigoCentro = novoCodCentro;
        else codigoCentro = 0;
    }

    public String getNomeCentro() {
        return nomeCentro;
    }

    public void setNomeCentro(String nomeCentro) {
        this.nomeCentro = nomeCentro;
    }
}
