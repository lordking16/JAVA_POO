public class Manager extends Employee {
    //HERENCIA DE CLASES, MANAGER HEREDA DE CLASE PADRE EMPLOYEE, HEREDA ATRIBUTOS Y MÉTODOS, PERO NO CONSTRUCTORES
    //DEFINICIÓN DE ATRIBUTOS PARTICULARES PARA CLASE Manager
    private String depto;

    //DEFINICIÓN DE CONSTRUCTORES
    public Manager() {
    }
    //PARA USAR UN CONSTRUCTOR DE LA CLASE PADRE SE UTILIZA LA PALABRA RESERVADA SUPER
    public Manager(Integer id, String name, Integer ssn, Double salary, String depto) {
        super(id, name, ssn, salary);
        this.depto=depto;
    }
    //DEFINICIÓN DE CONSTRUCTORES
    public void setDepto(String depto) {
        this.depto=depto;
    }
    public String getDeptoName() {
        return depto;
    }
    //SOBRECARGA DE MÉTODO DE CLASE PADRE
    @Override //PALABRA RESERVADA QUE INDICA QUE SE USARÁ UN MÉTODO DEFINIDO EN CLASE PADRE
    public String toString(){
       return super.toString()+ "| Depto: "+ depto;
    }
}
