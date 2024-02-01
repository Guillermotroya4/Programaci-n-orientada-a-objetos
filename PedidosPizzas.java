public class PedidosPizzas {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana", 35);
        Pizza p2 = new Pizza("funghi", "familiar", 50);
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "mediana", 35);
        Pizza p4 = new Pizza("Aguacate", "grandisima", 100);
        p4.sirve();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        p3.sirve();
        p1.sirve();
        
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
        System.out.println("Cuenta total a pagar: " + Pizza.getTotalprecio());
        
    }

}
