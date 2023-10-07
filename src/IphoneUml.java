// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class IphoneUml {
    public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        private String modelo;
        private String cor;
        private String serial;

        public iPhone(String modelo, String cor, String serial) {
            this.modelo = modelo;
            this.cor = cor;
            this.serial = serial;
        }


        public void ligar() {
            // Implementação para ligar o iPhone
        }


        public void desligar() {
            // Implementação para desligar o iPhone
        }


        public void tocarMusica() {
            // Implementação para tocar música no iPhone
        }


        public void fazerChamada(String numero) {
            // Implementação para fazer uma chamada no iPhone
        }


        public void navegarNaInternet() {
            // Implementação para navegar na Internet no iPhone
        }
    }

    public interface ReprodutorMusical {
        void tocarMusica();
    }

    public interface AparelhoTelefonico {
        void fazerChamada(String numero);
    }

    public interface NavegadorInternet {
        void navegarNaInternet();
    }

}