package MiReto1;

/**
 * Clase que representa un Proyecto.
 */
public class Proyecto {
    // ---------------------------------------------
    // Atributos
    // ---------------------------------------------
    int pTiempo;
    double pMonto;
    double pInteres;

    // ---------------------------------------------
    // Métodos
    // ---------------------------------------------
    public static void main(String[] args) {
        Proyecto resultadoInversion = new Proyecto();
        System.out.println(resultadoInversion.compararPresupuestos(24, 2000000, 5));
        Proyecto resultadoInversion2 = new Proyecto();
        System.out.println(resultadoInversion2.compararPresupuestos(1, 1000000, 1));
    }

    public void proyecto() {
    }

    public double calcularInteresCompuesto(int pTiempo, double pMonto, double pInteres) {
        double interesCompuesto;
        double calc_potencia = 1;

        for (int i = 1; i <= pTiempo; i++) {
            calc_potencia = calc_potencia * (1 + pInteres);
        }
        interesCompuesto = pMonto * (calc_potencia - 1);
        return interesCompuesto;
    }

    public double calcularInteresSimple(int pTiempo, double pMonto, double pInteres) {
        double interesSimple;
        interesSimple = (pMonto) * (pInteres) * pTiempo;
        return interesSimple;
    }

/**
 * Método para comparar la diferencia en el total de
* intereses generados para el proyecto.

* @return Respuesta al Reto.
 */
public String compararPresupuestos (int pTiempo, double pMonto, double pInteres)
     {
     /* Cálculo de la diferencia entre tipos de tasas */
     double respuesta = calcularInteresCompuesto(pTiempo, pMonto, pInteres) - calcularInteresSimple(pTiempo, pMonto, pInteres);
    
    if(respuesta)
    {
     return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta);
     }else
    {
     return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
     }
}
}
