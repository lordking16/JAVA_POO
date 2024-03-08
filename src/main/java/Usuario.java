public class Usuario {
    //VARIABLES
    private Integer id;
    private String user;
    private String password;

    public Usuario() {
    }
    //CONSTRUCTORES
    public Usuario(Integer id,String user, String password) {
        this.id=id;
        this.user=user;
        this.password=password;
    }
    //MÉTODOS
    public void setId(Integer id) {
        this.id=id;
    }
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "USUARIOS: \nId: "  + id
                + "Usuario: " + user
                + ", Contraseña: " + password
                + "\n";
    }
}
