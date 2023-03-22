package ej4;

public class Usuario {
    private int ci;
    private String userName;
    private String pwd;

    public Usuario(int ci, String userName, String pwd) {
        this.ci = ci;
        this.userName = userName;
        this.pwd = pwd;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void showInfo() {
        System.out.println("Mostrando informacion del usuario>>>>");
        System.out.println("CI: " + ci);
        System.out.println("UserName: " + userName);
    }
}
