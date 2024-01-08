package entities;

public class CurrencyConverter {

    public static double dolar;
    public static double dolarPrice;

    public static double conversao (){
        dolar = dolar * dolarPrice;
        double calculo = (dolar * 6) / 100;
        var resultado = calculo + dolar;
        return  resultado;
    }
}
