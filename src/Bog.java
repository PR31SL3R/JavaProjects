public class Bog {

    private int ISBN;
    private String titellog;
    private int udgivelsesår;


    public Bog(int ISBN, String titellog, int udgivelsesår){
        this.ISBN = ISBN;
        this.titellog = titellog;
        this.udgivelsesår = udgivelsesår;
    }

    public String toString(){

        return (this.ISBN + this.titellog + this.udgivelsesår);
    }

    public Bog(){

    }
    @Override
    public boolean equals(Object o){
        Bog bog2 = (Bog)o;
        if (this.getISBN() == bog2.getISBN()){
            return true;
        }
        return false;
    }

    public int getISBN(){

        return this.ISBN;
    }

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

    public String getTitellog() {
        return titellog;
    }

    public void setTitellog(String titellog) {
        this.titellog = titellog;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    public static void main(String[] args) {
        Bog eventyr = new Bog(12345,"tud",1765);
        Bog harrypotter1 = new Bog(1234,"test",1965);
        Bog harrypotter2 = new Bog(1234,"test",1966);
        Bog harrypotter3 = new Bog(123456,"test",1967);
        Bog harrypotter4 = new Bog(1234567,"test",1968);
        System.out.println(harrypotter1.equals(harrypotter2));

    }

}
