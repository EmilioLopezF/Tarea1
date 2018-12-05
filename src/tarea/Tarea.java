package tarea;


public class Tarea {

    public static void main(String[] args) {
        Expendedor expendedor = new Expendedor(6, 6, 6);
        Comprador com = new Comprador(expendedor);
        
        com.revisarMonedas();
        System.out.print("aqui intento comprar sin plata: ");       
        com.comprar("sprite");
        System.out.println(com.beber());
        com.revisarMonedas();
        com.tomarVuelto();
        com.revisarMonedas();
        System.out.println("\n" + "aqui ecuentro plata:");                
        Moneda moneda1 = new Gamba();
        Moneda moneda2 = new Gamba();
        Moneda moneda3 = new Quina();
        com.recibirPlata(moneda1);
        com.recibirPlata(moneda2);
        com.recibirPlata(moneda3);
        com.revisarMonedas();
        System.out.println("\n" + "aqui compro una sprite: ");                        
        com.comprar("sprite");
        System.out.println(com.beber());
        com.revisarMonedas();
        System.out.println("aqui recibo vuelto:");                        
        com.tomarVuelto();
        com.revisarMonedas();
        System.out.println("\n" + "aqui compro una fanta: ");                        
        com.comprar("fanta");
        System.out.println(com.beber());
        com.revisarMonedas();
        com.tomarVuelto();
        com.revisarMonedas();
        System.out.println("Como ando con 350 y la fanta vale 350 quedo sin plata y no ,e dan vuelto");                                
    }
    
}
class Expendedor {
    private DepositoBebida db;
    private DepositodeMonedas dm;
    private int total;

    public Expendedor(int ncoca, int nsprite, int nfanta) {
        db = new DepositoBebida(ncoca, nsprite, nfanta);
        dm  = new DepositodeMonedas(60);
        
    }
    public Bebida comprarBebida(Moneda m, String b) {
        total = total+m.darValor();
        dm.obtenerMonedas(m);
        if(total<350) return null;
        total = total-350;
        if(b=="cocacola"){
            return db.sacarBebida(1);
        }
        else if(b=="sprite"){
            return db.sacarBebida(2);
        }
        else if(b=="fanta"){
            return db.sacarBebida(3);
        }
        return null;
    }
    
    public Moneda vuelto(){
        if(total >= 500 && dm.obtenerCantidadMonedas(500)>0){
            total = total-500;
            return dm.sacarMoneda(500);
        }
        else if(total>=100 && dm.obtenerCantidadMonedas(100)>0){
            total = total-100;
            return dm.sacarMoneda(100);
        }
        else if(total >= 50 && dm.obtenerCantidadMonedas(50)>0){
            total = total-50;
            return dm.sacarMoneda(50);
        }
        return null;
    }
}

class DepositoBebida{
    public Bebida coca[];
    public Bebida sprite[];
    public Bebida fanta[];
    public int ncoca;
    public int nsprite;
    public int nfanta;
    public DepositoBebida(int ncoca, int nsprite, int nfanta){
        this.ncoca = ncoca;
        this.nsprite = nsprite;
        this.nfanta = nfanta;
        coca = new CocaCola[ncoca];
        sprite = new Sprite[nsprite];
        fanta = new Fanta[nfanta];
        for (int i = 0; i < ncoca; i = i + 1) {
            coca[i] = new CocaCola(i);
        }
        for (int i = 0; i < nsprite; i = i + 1) {
            sprite[i] = new Sprite(i);
        }
        for (int i = 0; i < nfanta; i = i + 1) {
            fanta[i] = new Fanta(i);
        }
    }
    
    public Bebida sacarBebida(int tipo){
        if(tipo==1 && ncoca!=0){
            ncoca=ncoca-1;
            return coca[ncoca];
        }
        else if(tipo==2 && nsprite!=0){
            nsprite=nsprite-1;
            return sprite[nsprite];
        }
        else if(tipo==3 && nfanta!=0){
            nfanta=nfanta-1;
            return fanta[nfanta];
        }
        return null;
    }
}

class DepositodeMonedas{
    private Moneda[] monQuina;
    private Moneda[] monGamba;
    private Moneda[] monCincu;
    private int nquina;
    private int ngamba;
    private int ncin;
    public DepositodeMonedas(int nmonedas){
        monCincu = new Cincu[100];
        monGamba = new Gamba[100];
        monQuina = new Quina[100];
        ncin = nmonedas;
        ngamba = nmonedas;
        nquina = nmonedas;
        int i;
        for(i=0;i<nmonedas;i=i+1){
            monCincu[i] = new Cincu();
            monGamba[i] = new Gamba();
            monQuina[i] = new Quina();
        }
    }
    public Moneda sacarMoneda(int valor){
        if(valor==50 && ncin>0){
            ncin=ncin-1;
            return monCincu[ncin];
        }
        else if(valor==100 && ngamba>0){
            ngamba=ngamba-1;
            return monGamba[ngamba];
        }
        else if(valor==500 && nquina>0){
            nquina=nquina-1;
            return monQuina[nquina];
        }
        return null;
    }
   
    public int obtenerCantidadMonedas(int valor){
        if(valor==50){
            return ncin;
        }else{ 
            if(valor==100){
                return ngamba;
            }else{ 
                if(valor==500){
                    return nquina;
                }else{
                    return 0;
                }
            }
        }                    
    }
    
    public void obtenerMonedas(Moneda mon){
        if(mon.darValor()==50){
            if(ncin==100) return;
            monCincu[ncin]=mon;
            ncin=ncin+1;
        }
        else if(mon.darValor()==100){
            if(ngamba==100) return;
            monGamba[ngamba]=mon;
            ngamba=ngamba+1;
        }
        else if(mon.darValor()==500){
            if(nquina==100) return;
            monQuina[nquina]=mon;
            nquina=nquina+1;
        }
    }
}


abstract class Bebida {
    private int s;
    public Bebida(int s) {
        this.s = s;
    }
    public abstract String beber();
}

class CocaCola extends Bebida {
    public CocaCola(int n) {
        super(n);
    }
    @Override
    public String beber() {
        String a = "cocacola";
        return a;
    }
}

class Sprite extends Bebida {
    public Sprite(int n) {
        super(n);
    }
    @Override
    public String beber() {
        String a = "sprite";
        return a;
    }
}

class Fanta extends Bebida {
    public Fanta(int n) {
        super(n);
    }
    @Override
    public String beber() {
        String a = "fanta";
        return a;
    }

}

class Comprador{
    private Expendedor m;
    private Moneda efectivo[];
    private Bebida b;
    private int nmonedas;
    public Comprador(Expendedor exp){
        efectivo = new Moneda[10];
        nmonedas = 0;
        m = exp;
        b = null;
    }
    public void recibirPlata(Moneda m){
        if(nmonedas==10) nmonedas=nmonedas-1;
        this.efectivo[nmonedas]=m;
        nmonedas=nmonedas+1;
        
    }
     public void comprar(String be){
        do{
            if(nmonedas==0) break;
            nmonedas=nmonedas-1;
            b=m.comprarBebida(efectivo[nmonedas], be);
        }while(b==null);
    }
    public String beber(){
        if(b==null) return null;
        return b.beber();
    }
    public void tomarVuelto(){
        while(true){
            if(nmonedas==10) nmonedas=nmonedas-1;
            efectivo[nmonedas]=m.vuelto();
            if(efectivo[nmonedas]==null) break;
            nmonedas=nmonedas+1;
        }
    }
    public void revisarMonedas(){
        int i;
        System.out.print("Ando con " + nmonedas + " monedas: ");
        for(i=0;i<nmonedas;i=i+1){
            System.out.print(efectivo[i].darValor()+ " ");
        }
        System.out.println();
    }
}

abstract class Moneda {
    public Moneda(){
    }
    public abstract int darValor();
}

class Quina extends Moneda{
    public Quina(){
    }
    @Override
    public int darValor() {
        return 500;
    }
}
class Gamba extends Moneda{
    public Gamba(){
    }

    @Override
    public int darValor() {
        return 100;
    }
}
class Cincu extends Moneda{
    public Cincu(){
    }

    @Override
    public int darValor() {
        return 50;
    }
}



