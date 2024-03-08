public class Main {
    public static void main(String[] args) {

        //CREACIÓN DE UN OBJETO TIPO Sucursal
        Sucursal sucursal=new Sucursal();
        sucursal.setId(1);
        sucursal.setName("CHEDRAUI TIENDAS");
        sucursal.setAddres("TEOLOYUCAN, EDO, MX");
        sucursal.setFormat("CEDIS");
        System.out.println(sucursal);

        //CREACIÓN DE UN OBJETO TIPO Usuario
        Usuario usuario=new Usuario(1,"mendezlorenzo1234@gmail.com","lord_king");
        System.out.println(usuario);

        //CREACIÓN DE UN OBJETO TIPO Calculadora
        Calculadora sumaNumeros= new Calculadora();
        System.out.println("La sumatoria es " + sumaNumeros.suma(4,5));

        //CREAR INSTANCIAS DE Employee Y Manager PARA VERIFICAR USO DE MÉTODO PADRE Y MÉTODO SOBRECARGADO EN CLASE HEREDAD
        Employee empleado=new Employee(1, "Lorenzo", 3456,25000.00); //Instancia e de clase Employee
        Manager manager=new Manager(22,"David Contreras",3457,32000.00,"Desarrollo");

        //IMPRIMIR LOS VALORES DE AMBOS OBJETOS
        System.out.println(empleado);//imprimir valor de objeto Employee: toString()
        System.out.println(manager); //imprimir valor de objeto Manager: toString()
    }
}