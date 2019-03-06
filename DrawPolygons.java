

import polygon.*;

public class DrawPolygons {

    public static PolygonModel initPolygons(){
        PolygonModel polygons = new PolygonModel();

        polygons.addPolygon(PolygonFactory.createSquare(50,50));
        polygons.addPolygon(PolygonFactory.createTriangle(100,100));
        polygons.addPolygon(PolygonFactory.createRectangle(50,150));

        return polygons;

    }//initializer

    public static void main(String[] args) {
        PolygonModel polygons = initPolygons();
        PolygonViewer view = new PolygonViewer();
        view.add(polygons);
        polygons.addListener(view);
        PolygonController controller = new PolygonController(polygons, view);

        polygons.animate();

    }//main

}//DIT952.DrawPolygons