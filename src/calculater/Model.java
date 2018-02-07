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

	    public double add(double x, double y){
	        return x+y;
	        }
	        
	    private double sub(double x, double y){
	        return x-y;
	        }
	    
	    private double mul(double x, double y){
	        return x*y;
	        }
	    
	    private double div(double x, double y){
	        double z;
	        try{
	           z=x/y;
	        }
	        catch(Exception divideonzero){
	            System.out.println(" DIVIDE ON ZERO NOT ALLWED !!!");
	        }
	        return x/y;
	        }
	    
	    private double mod(double x, double y){
	        double z = div(x,y);
	        
	        return x+y;
	        }
	    
	    private double sqrroot(double x, double y){
	        return x+y;
	        }
	}