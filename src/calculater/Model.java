package calculater;

public class Model {

	public void main(String[] args) {
        
	    /**
	     *
	     * @param x
	     * @param y
	     * @return
	     */
	    
	    }
	    public boolean flag = false;
	    public double add(double x, double y){
	    	flag= true;
	        return x+y;
	        }
	        
	    public double sub(double x, double y){
	    	flag= true;
	        return x-y;
	        }
	    
	    public double mul(double x, double y){
	    	flag= true;
	        return x*y;
	        }
	    
	    public double div(double x, double y){
	    	flag= true;
	           return x/y;
	    }
	    
	    public double mod(double x,double y){
	    	flag= true;
	        return x%y;
	        }
	    
	    public double sqrroot(double x){
	    	flag= true;
	        return Math.sqrt(x);
	        }
	}