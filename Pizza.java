public class Pizza {

    public static int TotalPedidas = 0;
    public static int TotalServidas = 0;
    public static double TotalPrecio = 0;

    private String tamaño;
    private String tipo;
    private String estado;
    private double precio;

    public Pizza(String tipo, String tamaño, double precio) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        this.precio = precio;
        TotalPedidas++;
        TotalPrecio += precio;
    }

    public String toString() {
        return "Pizza " + this.tipo + " " + this.tamaño + " ," + this.estado + " y el precio de esta pizza es: " + this.precio + "€";
    }

    public void setTotalPedidas(int totalPedidas) {
        TotalPedidas = TotalPedidas;
    }

    public  static int getTotalPedidas() {
        return TotalPedidas;
    }

    public static int getTotalServidas() {
        return TotalServidas;
    }

    public static void setTotalServidas(int totalServidas) {
        TotalServidas = totalServidas;
    }

    public static void setTotalprecio(double TotalPrecio) {
        TotalPrecio = TotalPrecio;
    }

    public static double getTotalprecio() {
        return TotalPrecio;
    }

    public void sirve() {
        if (this.estado.equals("pedida")) {
            Pizza.TotalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }
    
}
