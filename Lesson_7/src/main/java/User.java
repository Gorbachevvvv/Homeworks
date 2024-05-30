public class User {
    private String name;
    public enum Profession {DIRECTOR, WORKER, HR};
    private Profession profession;
    private int experience;

    public User(String name, Profession profession, int experience) {
        this.name = name;
        this.profession=profession;
        this.experience = experience;
    }
    protected double calculate (){
        int prcof;
        switch (profession){
            case DIRECTOR:{
                prcof=10;
            }
            case WORKER:{
                prcof=3;
            }
            case HR:{
                prcof=7;
            }
            default:
                prcof=1;
        }
        int salary= 1000 * this.experience * prcof;
        return salary;
    }
    protected double calculate (int dopsal){
        int prcof;
        switch (profession){
            case DIRECTOR:{
                prcof=10;
            }
            case WORKER:{
                prcof=3;
            }
            case HR:{
                prcof=7;
            }
            default:
                prcof=1;
        }
        int salary= 1000 * this.experience * prcof + dopsal;
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", profession=" + profession +
                ", experience=" + experience +
                '}';
    }
}
