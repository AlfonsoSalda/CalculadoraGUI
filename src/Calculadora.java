public class Calculadora {
    private double number1;
    private double number2;
    
    //constructores
    public Calculadora(){
    
    }
    
    //setter && getter

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }
    
    
    
    //metodos
    
    public double sumar(){
        
        return number1+number2;
        
    }
    
    public double restar(){
        
        return number1-number2;
        
    }
    
    public double multiplicar(){
        
        return number1*number2;
        
    }
    
    public double dividir(){
        
        return number1/number2;
        
    }
    
    public double porciento(){
        
        return (number1*number2)/100;
                
    }
}
