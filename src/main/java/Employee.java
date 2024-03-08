public class Employee {
    //DEFINICIÓN DE VARIABLES
    //COLOCAR SIEMPRE EL MODIFICADOR DE ACCESO private para encapsular los atributos
    private  Integer id;
    private  String name;
    private  Integer ssn;
    private Double salary;

    //DEFINICIÓN DE CONSTRUCTORES
//COLOCAR SIEMPRE EL MODIFICADOR DE ACCESO PUBLIC PARA CONSTRUCTORES, YA QUE SE ACCEDEN DESDE OTRAS CLASES
    public Employee() {
    }

    public Employee(Integer idEmployee, String name, Integer ssn, Double salary) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    //DEFINICIÓN DE MÉTODOS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double salary){
        this.salary+=salary;
    }
    @Override
    public String toString() {
        return "EMPLEADOS: \nId: "  + id
                + "Nombre: " + name
                + ", SSN: " + ssn
                + "Salary" + salary;
    }
}
