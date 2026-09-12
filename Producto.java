public class Producto {
    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        }

        public double calcularPrecioFinal() {
// Conflicto 1 resuelto: se aplica descuento del 10% y luego IGV del 18%
double conDescuento = precioBase * 0.90;
return conDescuento * 1.18;
}

        public static void main(String[] args) {
            Producto p = new Producto("Laptop", 1000.0);
            System.out.println("Precio final: " + p.calcularPrecioFinal());
            }
        }