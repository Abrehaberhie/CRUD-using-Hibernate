package hibernatMainmethod;

public class Students {
    private int sno;
    private String sname;
    private double smark;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getSmark() {
        return smark;
    }

    public void setSmark(double smark) {
        this.smark = smark;
    }

    @Override

    public String toString() {
        return "Students{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", smark=" + smark +
                '}';
    }


}
