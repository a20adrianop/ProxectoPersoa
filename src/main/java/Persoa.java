/**
 *
 * @author uadmin
 */
public class Persoa {
    
    private int idade;

    /**
     * Get the value of idade
     *
     * @return the value of idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Set the value of idade
     *
     * @param idade new value of idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean idadeValida(){
        if (this.idade>=18 && this.idade<=60){
            return true;
        }else{
            return false;
        }
    }
}