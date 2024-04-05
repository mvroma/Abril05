package com.softtek.presentacion;
import com.softtek.modelo.Bateria;
import com.softtek.modelo.Guitarra;
import com.softtek.modelo.Instrumentos;
import com.softtek.modelo.Flauta;
public class InstrumentosMusicales {
    public static void main(String[] args) {
        Instrumentos guido = new Guitarra("Fender", "Acero");
        Instrumentos bataca = new Bateria("Yamaha", 27);
        Instrumentos ham = new Flauta("Horner", "Material del que se forjan los sueños");


        Instrumentos[] instrumentos = new Instrumentos[3];
        instrumentos[0] = guido;
        instrumentos[1] = bataca;
        instrumentos[2] = ham;



        for (Instrumentos instrumento : instrumentos) {
            if (instrumento instanceof Guitarra) {
                System.out.println(instrumento.emitirSonido("Sonido de la Guitarra raaaaaaaaas"));
            }else if (instrumento instanceof Bateria) {
                System.out.println(instrumento.emitirSonido("Sonido de la Bateria puuuuuuumm"));
            }else if (instrumento instanceof Flauta) {
                System.out.println(instrumento.emitirSonido("Sonido de la Flauta piiiiiiiiii"));
            }
        }
    }
}

