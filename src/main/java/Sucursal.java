public class Sucursal {
    private Integer id;
    private String name;
    private String addres;
    private String format;
//DEFINICION DE CONSTRUCTORS

    public Sucursal() {
    }
    public Sucursal(Integer id, String nameS, String addres, String format) {
        this.id = id;
        this.name = name;
        this.addres = addres;
        this.format = format;
    }
//DEFINICION DE METODOS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "SUCURSALES: \nId: "  + id
                + "Name: " + name
                + ", dirección: " + addres
                + "Formato" + format;
    }
}
