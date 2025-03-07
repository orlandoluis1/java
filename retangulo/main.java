public class Main {
    public static void main(String[] args) {
        retangulo retanguloA = new retangulo();
        retangulo retanguloB = new retangulo();

        retanguloA.setlargura(6.0);
        retanguloA.setaltura(8.0);
        
        retanguloB.setlargura(9.0);
        retanguloB.setaltura(7.0);

        system.out.println("retangulo a:");
        retanguloA.mostrarDados();

        system.out.println("retangulo b:");
        retanguloB.mostrarDados();
    }
}
