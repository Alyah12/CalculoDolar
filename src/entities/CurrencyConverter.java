package entities;

public class CurrencyConverter {

    public static double dolar;
    public static double dolarPrice;
    public static double taxa = 6.0 / 100;

    public static double conversão (){
        dolar = dolar * dolarPrice;
        double calculo = (dolar * 6) / 100;
        var resultado = calculo + dolar;
        return  resultado;
    }
}
