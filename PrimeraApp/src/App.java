public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, JAAA");

        //VARIABLES
        //sino colocas la impresion se marcara con una señal de error, pero es porque no se usa la variable

        /*
         * TIPOS DE VARIABLES
         * Variables primitivas : almacenana valores basicos
         * variables de referencia : almacenana direcciones de memoria que apuntan a objetos
         * 
         * TIPO DE DATOS
         * Enteros: byte (-128 al 127)
         *        short (-32,768 al 32,767)
         *       int (-2,147,483,648 al 2,147,483,647)
         *      long (-9,223,372,036,854,775,808 al 9,223,372,036,854,775,807)
         * por lo gneral se usa ing long para numeros grandes
         * 
         */
        int n = 5; // Entero
        //TIPOS DE DATOS REALES

        double decimal =5.123123345345;
        float decimal2 = 5.1231f; // Decimal con punto flotante (menos preciso que double)
        
        System.out.println(n);
        System.out.println(decimal);
        System.out.println(decimal2);
    }
}
