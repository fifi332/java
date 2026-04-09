public class MembroComunidadeEscolar extends Persona {
    private int codigoCentro;
    private String nomeCentro;

    public MembroComunidadeEscolar() {
        super();
        codigoCentro = 525;
        nomeCentro   = "perp";
    }

    public MembroComunidadeEscolar(String nom, String dni, int edad, int codCentro, String nomCentro) {
        super(nom, dni, edad);
        codigoCentro = codCentro;
        nomeCentro   = nomCentro;
    }

    public int getCodigoCentro() {
        return codigoCentro;
    }

    public void setCodigoCentro(int novoCodCentro) {
        if (novoCodCentro > 0) codigoCentro = novoCodCentro;
        else codigoCentro = 0;
    }

    public String getNomeCentro() {
        return nomeCentro;
    }

    public void setNomeCentro(String nomeCentro) {
        this.nomeCentro = nomeCentro;
    }
}