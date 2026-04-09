public class persona {

    public String nome;
    public int edad;


    public persona(){
        nome = "toti";
        edad = 23;
    }
    public persona(String nome,int edad){
        this.nome = nome;
        this.edad = edad;
    }

    public String get_nome(){
        return this.nome;
    }
    public void set_nome(String nome){
        this.nome = nome;
    }
}
void main(){

    persona p1 = new persona();
    p1.set_nome("pedrito");
    persona p2 = new persona("alan",24);
    System.out.println(p1.nome);
    System.out.println(p2.edad);


}