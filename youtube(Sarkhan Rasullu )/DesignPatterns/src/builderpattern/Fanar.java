/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author murad_isgandar
 */
public class Fanar {

    private String name = null;
    private Lampa l = null;

    private Fanar() {

    }

    public Fanar(String name, Lampa l) {
        this.name = name;
        this.l = l;
    }

    public String getName() {
        return name;
    }

    public Lampa getL() {
        return l;
    }

    //set methodlarini umumiyyetle silmek olar , onda ashagida set zamani f.name = name; olacaq,
    //ya daki private edirik ve FanarBulder den bashqa hech kim chagira bilmir
    private void setName(String name) {
        this.name = name;
    }

    private void setL(Lampa l) {
        this.l = l;
    }

    public static FanarBuilder builder() {
        return new FanarBuilder();
    }

    public static class FanarBuilder {

        private Fanar f = null;

        public FanarBuilder() {
            f = new Fanar();
        }

        public FanarBuilder setName(String name) {
            this.f.setName(name);

            return this;
        }

        public FanarBuilder setL(Lampa l) {
            this.f.setL(l);

            return this;
        }

        public Fanar build() {
            return new Fanar(f.name, f.l);
//asahgidaki halda eger bulder.build() chagirildigdan sonra
//builder.setName() deyilib teze name verilse bu zaman nullPointerExc atacaq
//            Fanar ff = f;
//            f = null;
//            return ff;
        }
    }
}
