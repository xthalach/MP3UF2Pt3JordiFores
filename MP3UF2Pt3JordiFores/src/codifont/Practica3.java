/**
 * Aquesta practica consisteix en aplica els diseny modular que hem vist a classe. Es tracta de dividir en problemes
 * petits un problema grant. Tenim dos tipus de diseny modular els que busquen i els que recoren, anem a vere quin
 * dels dos és el que ens va millor.
 */
package codifont;

import java.util.*;

/**
 * El programa fa que amb dues cordenades introduides per una camara sabem la jugada de escacs que ha fet.
 * Ja que tots els metodes fan referencia a les variables no he vist que pugi utilitzar cap metode a la bilbioteca.
 * De totes maneres es podria crear modificant una mica l'estructura del diseny, un metode que estes d'intre la 
 * biblioteca.
 * @author xThalach
 */
public class Practica3 {
    
    // Declaració de variables
    static Scanner scan = new Scanner(System.in);
    static char[] lletres = {'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
    static int num1;
    static int num2;
    static String resultat;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * He deduit que tenim que canviar lo que vindria a ser la part de baix
         * del tablero, es a dir, tenim que sustituir les lletres pels numeros
         * {'h','g','f','e','d','c','b','a'} {'8','7','6','5','4','3','2','1}
         * llavors el que fara el meu programa sera canviar el primer numero per
         * l'array que tenim d'alt. Per aixo el primer numero sera el que
         * buscara dins l'array la lletra corresponent pero aixo trio el diseny
         * modular de busqueda.
         *
         * Ara tenim que decidir entre while o do while, jo que crec que aquest
         * cas s'asimila millor amb un while perque mentre que l'entrada no sigi
         * 0,0 tenim que seguir demanan a l'usuari, una vegada ens entren 0,0
         * parem.                    
         * 
         * ---Observacions---
         *
         * -He tingut que eliminar el metode inisialitzarVariables(); ja que no
         * podria accedir-hi als altres metodes llavors he inicialitzat les
         * variables com a static per a que tots els metodes tinguin acces.
         * 
         * - He arribat un moment que he tingut que eliminar uns quant metodes del model
         * aixo m'ha indicat de podria ser que no fosa el correcte.
         * Quant he acabat m'ha quedat una estructura com la del diseny de recoregut amb
         * esquema 2. Ja que he tingut que eliminar molts metodes del anterior.
         */

        
        /**
         * - El programa fa que amb dues cordenades introduides per una camara sabem la jugada de escacs que ha fet.
         * @param tractarPrimerElement fa referencia al metode que tractara el programa, es on esta tota la xixa.
         * @param elementFinal És el que defineix quant parara el bucle.
         * @return El resultat de la cordenada equivalen a la d'escacs.
         */
        do {
            tractarPrimerElement();
        } while (!elementFinal());

    }

     /**
      * @param num1 Primer valor de la cordenada(que es el que tractarem).
      * @param num2 Segon valor de la cordenada (aquest d'aqui sera el que concatenarem).
      * @param resultat Si el metode elementfinal és false, idiquem el numero que ha introduit a l'array
      * per donar-li el valor {'h','g','f','e','d','c','b','a'}.
      * @return El resultat de la cordenada equivalen a la d'escacs.
      */
    private static void tractarPrimerElement() {

        System.out.println("Introdueix un numero entro 0 i 8");
      
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        if (!elementFinal()) {
            resultat = lletres[num1 - 1] + Integer.toString(num2);
            System.out.println(resultat);
        }

    }
    
    /**
     * - No he posat mes casos exepcionals com si introdueixen negatius o altres exepcions ja 
     * que la que entrar la desdes és una maquina i ha d'esta bén porgramada per a que no introdueixi
     * dades errones.
     * @return Retorna true si la condicio és certa, si el valor de les codenades és
     * igual a 0 el programa acaba.
     */
    private static boolean elementFinal() {
        return num1 == 0 && num2 == 0;
    }

}
