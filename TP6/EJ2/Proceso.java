package centroComputos;

public class Proceso implements ObjetoComparable{


    private String pid;
    private double reqMemoria;
    private int reqTiempo;

    public Proceso(String pid, double reqMemoria, int reqTiempo) {
        this.pid = pid;
        this.reqMemoria = reqMemoria;
        this.reqTiempo = reqTiempo;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public double getReqMemoria() {
        return reqMemoria;
    }

    public int getReqTiempo() {
        return reqTiempo;
    }

    public void setReqTiempo(int reqTiempo) {
        this.reqTiempo = reqTiempo;
    }

    public String toString() {
        return pid + " ("+this.reqMemoria+" Mb)";
    }

    @Override
    public boolean esMayor(ObjetoComparable otro) {
        return this.getReqMemoria() > ((Proceso)otro).getReqMemoria() ;
    }
}
