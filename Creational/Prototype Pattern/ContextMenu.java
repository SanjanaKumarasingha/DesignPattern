interface Component {
    void render();
    Component clone(); // Component acting like a prototype
}

class Circle implements Component {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void render(){
        System.out.println("Rendering a circle");
    }

    @Override 
    public Component clone(){
        Circle newCircle = new Circle();
        newCircle.setRadius(radius);
        return newCircle; 
    }
}

public class ContextMenu {
    public void dublicate(Component component) {
        Component newComponent = component.clone();
        // Add target to our document
    }    
}
  