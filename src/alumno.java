public class alumno {
    public String nome;
    public String dni;
    public int edade;
    public String nomeCentro;
    public String ciclo;

    public alumno() {
        nome = "Pedro";
        dni = "00000000A";
        edade = 22;
        nomeCentro = "escola";
        ciclo = "ASIR";
    }

    public alumno(String nome, String dni, int edade, String nomeCentro, String ciclo) {
        this.nome = nome;
        this.dni = dni;
        this.edade = edade;
        this.nomeCentro = nomeCentro;
        this.ciclo = ciclo;
    }
}