
package modelo;
        
public class Division {
    private float d1, d2;
    
    public void setD1(float d1) {
        this.d1 = d1;
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }

    public float getD1() {
        return d1;
    }

    public float getD2() {
        return d2;
    }

    public Division(float d1,float d2){
        this.d1 = d1;
        this.d2 = d2;
    }
    
    public float dividir(){
        return d1/d2;
    }
    
}
