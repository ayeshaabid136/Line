public class Line{
    private point p1;
    private point p2;
    private float lenght;

    //Null constructor
    Line(){
        this.p1 = new point();
        this.p2 = new point();
        this.lenght = 0.0f;
    }

    //parametrized constructor
    public Line (point p1 , point p2){
        this.p1 = p1;
        this.p2 = p2;
        this.lenght = lenght;
    }

    //setter
  public void setp1(point p1){
    this.p1 = p1;

    public void setp2(point p2){
      this.p2 = p2;
  }
  
    //getter
    public point getp1(){
        return p1;
    }

    public point getp2(){
        return p2;
    }

    //Calculate lenght of Line
    public float CalculateLenght(){
        float dx = p2.getX() - p1.getX();   //Its like x2 - x1 and y2 - y1   
        float dy = p2.getY() - p1.getY();
        return(float) Math.sqrt(dx*dx + dy*dy); 
    }

    public void display(){
        System.out.println(p1 +"," + p2);
    }
}
  
