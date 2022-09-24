public class TestException {
    public void f1(){throw new Exc1(); }
    public void f2() throws Exc2 {throw new Exc2(); }

    //Ajouter Exc2 dans la throw list de la méthode f2()
}
