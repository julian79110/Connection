package co.edu.sena.project4.model;

public class User {
    private Integer user_id;
    private String user_nombre;
    private String user_apellido;
    private String user_email;
    private String user_password;

public User(){

}

    public User(Integer user_id, String user_nombre, String user_apellido, String user_email, String user_password) {
        this.user_id = user_id;
        this.user_nombre = user_nombre;
        this.user_apellido = user_apellido;
        this.user_email = user_email;
        this.user_password = user_password;
    }

    public Integer getUser_id(){
            return user_id;
        }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_nombre() {
        return user_nombre;
    }

    public void setUser_nombre(String user_nombre) {
        this.user_nombre = user_nombre;
    }

    public String getUser_apellido() {
        return user_apellido;
    }

    public void setUser_apellido(String user_apellido) {
        this.user_apellido = user_apellido;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    @Override
    public String  toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_nombre='" + user_nombre + '\'' +
                ", user_apellido='" + user_apellido + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_password='" + user_password + '\'' +
                '}';
    }
}