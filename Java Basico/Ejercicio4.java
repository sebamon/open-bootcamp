public class Ejercicio4 {
    
    public static void main(String[] args) {
        SmartDevice xiaomi = new SmartPhone();
        SmartDevice miband = new SmartWatch("Xiaomi","miBand 5","arn0001","12:00","Goma");

        System.out.println(miband);
        System.out.println(xiaomi);
        
    }

    public static class SmartDevice{

        private String marca;
        private String modelo;
        private String chipset;


        public SmartDevice(){
            this.marca="";
            this.modelo="";
            this.chipset="";
        }

        public SmartDevice(String marca, String modelo, String chipset){
            this.marca = marca;
            this.modelo = modelo;
            this.chipset = chipset;
        }
        @Override
        public String toString() {
            String respuesta = "Marca: " + this.marca +
                        "\nModelo: " + this.modelo +
                        "\nChipset: " +this.chipset;
            return respuesta;
        }
    }

    public static class SmartPhone extends SmartDevice{
        private Integer almacenamiento;
        
        public SmartPhone(){
            super();
            this.almacenamiento = 0;
        }
        public SmartPhone(String marca, String modelo, String chipset, Integer almacenamiento){
            super(marca,modelo,chipset);
            this.almacenamiento = almacenamiento;
        }
        @Override
        public String toString() {
            String respuesta = "---SmartPhone--- : \n";
            respuesta+= super.toString();
            respuesta+="\nAlmacenamiento: "+ this.almacenamiento;

            return respuesta;
        }
    }
    public static class SmartWatch extends SmartDevice{
        private String hora;
        private String pulsera;

        public SmartWatch(){
            super();
            this.hora = "00:00";
            this.pulsera = "Pulsera Económica";
        }
        public SmartWatch(String marca, String modelo, String chipset, String hora, String pulsera){
            super(marca,modelo,chipset);
            this.hora = hora;
            this.pulsera = pulsera;
        }

        @Override
        public String toString() {
            String respuesta = "---SmartWatch--- : \n";
            respuesta+= super.toString();
            respuesta+="\nHora: "+ this.hora + 
                       "\nPulsera: " + this.pulsera;

            return respuesta;
        }
    }

    
}
