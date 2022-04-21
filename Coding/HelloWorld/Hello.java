package HelloWorld;


class Hai{
    public void Holla(){
        System.out.println("Hola");
    }
}

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Hai h=new Hai();

        h.Holla();
    }
}
