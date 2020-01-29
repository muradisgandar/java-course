/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;

/**
 *
 * @author murad_isgandar
 */
public class ProxyPatternDemo {
	
   public static void main(String[] args) {
      Image image = ObjectCreator.creatorObj(RealImage.class);

      //image will be loaded from disk
      image.display(); 
      System.out.println("");
      
      //image will not be loaded from disk
      image.display(); 	
   }
}
