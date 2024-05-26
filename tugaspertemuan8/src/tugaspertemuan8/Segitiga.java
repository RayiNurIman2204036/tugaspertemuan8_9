package tugaspertemuan8;

public class Segitiga {
    double side1 ;
    double side3 ;
    double side2 ;
    
    Segitiga(){
    this.side1 = 1;
    this.side2 = 1;
    this.side3 = 1;
    }

    Segitiga(double side1, double side2, double side3){
        
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    }
    
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }

    public double getPerimeter(){
    return (this.side1 + this.side2 + this.side3)/2;
    }
    public double getArea(){
        double area;
         
         area = Math.sqrt(getPerimeter()*(getPerimeter()- this.side1)*(getPerimeter()- this.side2)*(getPerimeter() - this.side3));
        
        return area;
    }
    
    public double getKeliling(){
        return this.side1+this.side2+this.side3;
    }
    
    @Override
    public String toString(){
        return "Segitiga: sisi1 = " + this.side1 + " sisi2 = " + this.side2 + " sisi3 = " + this.side3;
    }
}
