
public class Principal {
    public static void main(String[] args) {
        BuracoRedondo buracoRedondo = new BuracoRedondo(5);

        PinoRedondo pinoRedondo = new PinoRedondoConcreto(5);
        System.out.println("Pino redondo encaixa: " + buracoRedondo.encaixa(pinoRedondo));

        PinoQuadrado pinoQuadradoGrande = new PinoQuadrado(10);
        AdaptadorPinoQuadrado adaptadorGrande = new AdaptadorPinoQuadrado(pinoQuadradoGrande);
        System.out.println("Pino quadrado grande encaixa: " + buracoRedondo.encaixa(adaptadorGrande));

        PinoQuadrado pinoQuadradoPequeno = new PinoQuadrado(5);
        AdaptadorPinoQuadrado adaptadorPequeno = new AdaptadorPinoQuadrado(pinoQuadradoPequeno);
        System.out.println("Pino quadrado pequeno encaixa: " + buracoRedondo.encaixa(adaptadorPequeno));
    }
}