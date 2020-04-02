package org.programa;

public class MicroOrganismos {
    String nombre;
    int vidas;

    public MicroOrganismos(String nombre){        //se crea un constructor para inicializar vidas en 256
        this.nombre = nombre;
        this.vidas=256;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void irLugar(String lugar){
        switch (lugar){
            case "higado":
                this.vidas=this.vidas>>1;
                System.out.println("e1"+this.nombre+"esta en "+lugar+"con"+this.vidas);
                break;
            default:
                System.out.println("e1"+this.nombre+"esta en "+lugar+"con"+this.vidas);
                break;
        }
    }

    public boolean estaVivo(){return (this.vidas>0);}

    public int dezplazarVidas() {
        vidas = vidas >> 1;
        return vidas;
    }

    public int vidaFinal() {
        vidas=0;
        return vidas;
    }

}
