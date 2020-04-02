package org.programa;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        int numero,organismo=0;
        MicroOrganismos arrayMicro[]=new MicroOrganismos[4];
        Organos arrayOrgano[]=new Organos[7];

        arrayMicro[0]=new MicroOrganismos("Microorganismo 1");
        arrayMicro[1]=new MicroOrganismos("Microorganismo 2");
        arrayMicro[2]=new MicroOrganismos("Microorganismo 3");
        arrayMicro[3]=new MicroOrganismos("Microorganismo 4");

        arrayOrgano[0]=new Organos("Boca");
        arrayOrgano[1]=new Organos("Corazon");
        arrayOrgano[2]=new Organos("Pulmones");
        arrayOrgano[3]=new Organos("Intestino");
        arrayOrgano[4]=new Organos("Estomago");
        arrayOrgano[5]=new Organos("Cerebro");
        arrayOrgano[6]=new Organos("Higado");

        System.out.println(arrayMicro[0].getNombre()+" Entra por la "+arrayOrgano[0].getNombre());
        System.out.println(arrayMicro[1].getNombre()+" Entra por la "+arrayOrgano[0].getNombre());
        System.out.println(arrayMicro[2].getNombre()+" Entra por la "+arrayOrgano[0].getNombre());
        System.out.println(arrayMicro[3].getNombre()+" Entra por la "+arrayOrgano[0].getNombre());
        System.out.print("\n");
        numero = (int) (Math.random() * 6)+1;

        do{
            switch (numero){
                case 1:  System.out.println(arrayMicro[organismo].getNombre()+" Esta en el "+arrayOrgano[1].getNombre());
                    System.out.println("Vidas restantes "+arrayMicro[organismo].getVidas());
                    System.out.print("\n");
                    break;

                case 2:  System.out.println(arrayMicro[organismo].getNombre()+" Esta en el "+arrayOrgano[2].getNombre());
                    System.out.println("Vidas restantes "+arrayMicro[organismo].getVidas());
                    System.out.print("\n");
                    break;

                case 3:  System.out.println(arrayMicro[organismo].getNombre()+" Esta en el "+arrayOrgano[3].getNombre());
                    System.out.println("Vidas restantes "+arrayMicro[organismo].getVidas());
                    System.out.print("\n");
                    break;

                case 4:  System.out.println(arrayMicro[organismo].getNombre()+" Esta en el "+arrayOrgano[4].getNombre());
                    System.out.println("Vidas restantes "+arrayMicro[organismo].getVidas());
                    System.out.print("\n");
                    break;

                case 5:	System.out.println(arrayMicro[organismo].getNombre()+" Esta en el "+arrayOrgano[5].getNombre());
                    System.out.println("Vidas restantes "+arrayMicro[organismo].getVidas());
                    System.out.print("\n");
                    break;

                case 6:	arrayMicro[organismo].dezplazarVidas();
                    if(arrayMicro[organismo].getVidas() == 1)
                        arrayMicro[organismo].vidaFinal();
                    System.out.println(arrayMicro[organismo].getNombre()+" Esta en el "+arrayOrgano[6].getNombre());
                    System.out.println("Vidas restantes "+arrayMicro[organismo].getVidas());
                    System.out.print("\n");
                    break;
            }

            numero = (int) (Math.random() * 6)+1;
            organismo++;
            if(organismo==4)
                organismo=0;

        }while( (arrayMicro[0].getVidas() != 0) || (arrayMicro[1].getVidas() != 0) || (arrayMicro[2].getVidas() != 0) || (arrayMicro[3].getVidas() != 0) );
    }
}