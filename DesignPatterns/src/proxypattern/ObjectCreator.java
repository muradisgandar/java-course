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
public class ObjectCreator {

    public static Image creatorObj(Class clazz) {

        if (clazz == RealImage.class) {
            return new ProxyImage();
        }
        return null;
    }
}
