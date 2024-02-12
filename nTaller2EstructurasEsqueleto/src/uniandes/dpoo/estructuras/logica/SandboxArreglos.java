package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
	
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return 
     * @return Una copia del arreglo de enteros
     */
    
    
   
    public int[] getCopiaEnteros( )
    {
    	
    	int[] copyArray = new int[this.arregloEnteros.length];
    	for (int i = 0; i < this.arregloEnteros.length; i++) {
            copyArray[i] = this.arregloEnteros[i];
    	}
            return copyArray;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        return Arrays.copyOf(this.arregloCadenas, this.arregloCadenas.length);
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	return this.arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	return this.arregloEnteros.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int[]nuevoArreglo=new int[this.arregloEnteros.length + 1];
    	System.arraycopy(this.arregloEnteros, 0, nuevoArreglo, 0, this.arregloEnteros.length);
    	nuevoArreglo[nuevoArreglo.length - 1] = entero;
        arregloEnteros = nuevoArreglo;

    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[]nuevoArreglo=new String[this.arregloCadenas.length + 1];
    	System.arraycopy(this.arregloCadenas, 0, nuevoArreglo, 0, this.arregloCadenas.length);
    	nuevoArreglo[nuevoArreglo.length - 1] = cadena;
        arregloCadenas = nuevoArreglo;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int count = 0;
        for (int i = 0; i < this.arregloEnteros.length; i++) {
            if (this.arregloEnteros[i] != valor) {
                count++;
            }
        }

        int[] nuevoArreglo = new int[count];
        int j = 0;
        for (int i = 0; i < this.arregloEnteros.length; i++) {
            if (this.arregloEnteros[i] != valor) {
                nuevoArreglo[j] = this.arregloEnteros[i];
                j++;
            }
        }

        arregloEnteros = nuevoArreglo;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int count = 0;
        for (int i = 0; i < this.arregloCadenas.length; i++) {
            if (!arregloCadenas[i].equals(cadena)) {
                count++;
            }
        }

        String[] nuevoArreglo = new String[count];
        int j = 0;
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (!arregloCadenas[i].equals(cadena)) {
                nuevoArreglo[j] = arregloCadenas[i];
                j++;
            }
        }

        arregloCadenas = nuevoArreglo;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int[] nuevoArreglo = new int[this.arregloEnteros.length + 1];
        System.arraycopy(this.arregloEnteros, 0, nuevoArreglo, 0, posicion);
        nuevoArreglo[posicion] = entero;
        System.arraycopy(this.arregloEnteros, posicion, nuevoArreglo, posicion + 1, this.arregloEnteros.length - posicion);
        arregloEnteros = nuevoArreglo;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if (posicion >= 0 && posicion < this.arregloEnteros.length) {
            int[] nuevoArreglo = new int[this.arregloEnteros.length - 1];
            System.arraycopy(this.arregloEnteros, 0, nuevoArreglo, 0, posicion);
            System.arraycopy(this.arregloEnteros, posicion + 1, nuevoArreglo, posicion, this.arregloEnteros.length - posicion - 1);
            arregloEnteros = nuevoArreglo;
    	}
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	if (valores.length == this.arregloEnteros.length) {
            int[] nuevoArreglo = new int[valores.length];
            for (int i = 0; i < valores.length; i++) {
                nuevoArreglo[i] = (int) Math.round(valores[i]);
            }
            arregloEnteros = nuevoArreglo;
        }

    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	if (objetos.length == arregloCadenas.length) {
            String[] nuevoArreglo = new String[objetos.length];
            for (int i = 0; i < objetos.length; i++) {
                nuevoArreglo[i] = objetos[i].toString();
            }
            arregloCadenas = nuevoArreglo;
        }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	 for (int i = 0; i < arregloEnteros.length; i++) {
             if (arregloEnteros[i] < 0) {
                 arregloEnteros[i] *= -1;
             }
         }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	 Arrays.sort(arregloEnteros);

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(arregloCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int count = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                count++;
            }
        }
        return count;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int count = 0;
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (arregloCadenas[i] == cadena) {
                count++;
            }
        }
        return count;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	List<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                posiciones.add(i);
            }
        }
        int[] resultado = new int[posiciones.size()];
        for (int i = 0; i < posiciones.size(); i++) {
            resultado[i] = posiciones.get(i);
        }
        return resultado;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	if (arregloEnteros.length == 0) {
            return new int[0];
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] < min) {
                min = arregloEnteros[i];
            }
            if (arregloEnteros[i] > max) {
                max = arregloEnteros[i];
            }
        }
        return new int[]{min, max};
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> histograma = new HashMap<>();
        for (int i = 0; i < arregloEnteros.length; i++) {
            int value = arregloEnteros[i];
            if (!histograma.containsKey(value)) {
                histograma.put(value, 1);
            } else {
                int count = histograma.get(value);
                histograma.put(value, count + 1);
            }
        }
        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	if (this.arregloEnteros.length == 0) {
            return 0;
        }
        int total = this.arregloEnteros.length;
        int count = 0;
        for (int i = 0; i < this.arregloEnteros.length; i++) {
            int value = this.arregloEnteros[i];
            int countValue = 0;
            for (int j = 0; j < this.arregloEnteros.length; j++) {
                if (this.arregloEnteros[j] == value) {
                    countValue++;
                }
            }
            if (countValue > 1 && countValue < total) {
                count++;
            }
        }
        return count;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	 if (arregloEnteros.length != otroArreglo.length) {
             return false;
         }
         for (int i = 0; i < arregloEnteros.length; i++) {
             if (arregloEnteros[i] != otroArreglo[i]) {
                 return false;
             }
         }
         return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	 Set<Integer> set1 = new HashSet<>();
         Set<Integer> set2 = new HashSet<>();
         for (int value : arregloEnteros) {
             set1.add(value);
         }
         for (int value : otroArreglo) {
             set2.add(value);
         }
         return set1.size() == set2.size() && set1.containsAll(set2);
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    }
}

