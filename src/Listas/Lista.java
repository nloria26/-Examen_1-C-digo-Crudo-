/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Listas;

/**
 *
 * @author GIUSEPPE MANUEL BELLO (barrantes no, apelido feo), ACOMPAÑADO DE SU ESQUISOFRENIA, HAMBRE Y CEREBELO
 */
public interface Lista <T>{
    //Siento que soy un boludo aqui haciendo el estupido por olvidar que seguia aqui  ;-;
    public boolean Agregar(T t);
    
    public boolean Eliminar(T t);
    
    public void Encontrar(Object id);
    
    
    public void mostrarTodo(T t);
    //creo que solo eran estas , los metodos de comportamiento genericos, mala mia si olvide o hize algo mio maqlo XD, que hambre me tengo profe, me cocine unos trozos de cerdo pero sin marinar, asi que estan bien simples profe, pregunta, te gusta que deje este tipo de comentarios en el codigo?, siento que soy raro por ser el unico en hacerlo, nose, eso es lo que siento.
    //creo que a nico se le olvido agregar el gitignore o se le guardo como .text
}
