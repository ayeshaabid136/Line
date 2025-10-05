public class Main{
    public static void main(String[] args) {
        point p1 = new point (0.0 , 0.0);
        point p2 =  new point (3.0 , 5.0);
        Line line = new Line (p1 ,p2);

        line.display();      //display initial line (o.o , 0.0) to (3.0 , 5.0)
        System.out.println("Lenght ="  +line.CalculateLenght());

        //use setters to modify point
        p1.setX(1.0);
        p1.setY(2.0);
        p2.setX(4.0);
        p2.setY(9.0);

        line.setp1(p1);
        line.setp2(p2);
        line.display();

    System.out.println("New Lenght="  +line.CalculateLenght());     //for new lenght
    }setter
    public void setp1(point p1){
        this.p1 = p1;
    }

    public void setp2(point p2){
        this.p2 = p2;
    }
}
