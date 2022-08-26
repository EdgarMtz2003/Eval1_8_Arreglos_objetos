/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_8_Arreglos_objetos {
    public static void main(String[]args){
        prueba[] arregloPrueba = new prueba[20];
        //crear los objetos       
        for (int i = 0; i < arregloPrueba.length; i++) {
            //clase identificador=new clase();
            arregloPrueba[i]=new prueba();     
        }
        //leer x
        for (prueba x : arregloPrueba) {
            System.out.println(x.x);         
        }

    }
}

class prueba{
    int x=100;
}