package HW8.Task2.University;
public class Aspirant extends Student {
    private String scienceWork;
    public Aspirant(String firstName,String lastName,int group,double averageMark,String scienceWork){
        super(firstName,lastName,group,averageMark);
        this.scienceWork=scienceWork;
    }
    @Override
    public int getScholarship() {
        if (getAverageMark() == 5)
            return 200;
        else return 180;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+", Science work: "+scienceWork;
    }
}
