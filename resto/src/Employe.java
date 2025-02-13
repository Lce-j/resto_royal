public class Employe {
    public int idEmploye;
    public String name;
    public String firstName;
    public String role;
    public String dateEmploye;
    public Double salaire;

    public Employe(int idEmploye, String name, String firstName, String role, String dateEmploye, Double salaire){
        this.idEmploye = idEmploye;
        this.name = name;
        this.firstName = firstName;
        this.role = role;
        this.dateEmploye = dateEmploye;
        this.salaire = salaire;
    }

    public int getIdEmployee(){
        return idEmploye;
    }
    public void setIdEmployee(int idEmploye){
        this.idEmploye = idEmploye;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }

    public String getDateEmployee(){
        return dateEmploye;
    }
    public void setDateEmployee(String dateEmploye){
        this.dateEmploye = dateEmploye;
    }

    public Double getSalaire(){
        return salaire;
    }
    public void setSalaire(Double salaire){
        this.salaire = salaire;
    }
}
