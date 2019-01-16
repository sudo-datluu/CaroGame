package Board.EventHandle;


public class EventHandle implements EventMouseClick{

    @Override
    //Event mouse click
    public void eventMouseClick(double x, double y) {
        System.out.println(String.format("click on %.2f, %.2f", x , y));
    }
}
