
package EDL;

public class Lista<E> {
    private E        dato;
    private Lista<E> sig;
    public Lista(){
        dato = null;
        sig  = null;
    }
    
    public Lista(Lista<E> otra){
        dato = otra.dato;
        sig  = otra.sig;
    }
    
    public boolean vacia(){
        return dato == null && sig == null;
    }
    
    public void insertarFinal(E nuevo){
        if(vacia()){
            dato = nuevo;
            sig  =  new Lista<>(); 
        }else{
            sig.insertarFinal(nuevo);
        }
    }
    
    public void insertarInicio(E nuevo){
        sig = new Lista<E>(this);
        dato = nuevo;
    }
    
    public void insertarEn(E x, int k){
        if(vacia() || k==0){
            insertarInicio(x);
        }else{
            sig.insertarEn(x,k-1);
        }
    }
    
    public void eliminar(E x){
        
        if(vacia()==false){
            if(dato.equals(x)){
                dato = sig.dato;
                sig = sig.sig;
            }else{
                sig.eliminar(x);
            }
        }
        
    }
    
    public int tamaño(){
        if(vacia()) return 0;
        else        return 1 + sig.tamaño();
    }
    
    public boolean existe(E dato){
        if(vacia()) return false;
        if(this.dato.equals(dato))  return true;
        return sig.existe(dato);
    }
    
    public E obtenerPos(int pos){
        if(vacia()) return null;
        if(pos == 0)return dato;
        return sig.obtenerPos(pos-1);
    }
    
    public String toString(){
        String res = "[" + resto() + "]";
        return res;
    }
    
    private String resto(){
        String res = "";
        if(!vacia()){
            res = dato.toString();
            if(!sig.vacia()){
                res = res + ", " + sig.resto();
            }
        }
        return res;
    }
    
    public void modificarPos(int pos, E dato){
        if(vacia() || pos < 0 ) {
            return ;
        }if(pos == 0){
            this.dato = dato;
        }else{
            sig.modificarPos(pos-1, dato);
        }
    }
    
    public E eliminarPos(int pos){
        if (vacia()) return null;
        if (pos == 0 ){
            E res = dato;
            this.dato = sig.dato;
            this.sig = sig;
            return res;
        }else{
            return sig.eliminarPos(pos-1);
        }
    }
}
