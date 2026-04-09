public class Persona {

    public String nome;
    public String dni;
    public int edad;

    public Persona() {
        nome = "Andres";
        dni = "00000000A";
        edad = 19;
    }

    public Persona(String nome, String dni, int edad) {
        this.nome = nome;
        this.dni  = dni;
        this.edad = edad;
    }

    public String get_nome() {
        return this.nome;
    }

    public void set_nome(String nome) {
        this.nome = nome;
    }
}