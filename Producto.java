public class Producto {
    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        }

        public double calcularPrecioFinal() {
            return precioBase * 1.18; // Impuesto IGV (18%)
            }

        public static void main(String[] args) {
            Producto p = new Producto("Laptop", 1000.0);
            System.out.println("Precio final: " + p.calcularPrecioFinal());
            }
        }