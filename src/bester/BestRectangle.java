package bester;


import java.util.List;

public class BestRectangle {
    public Rectangle bestRectangle(List<Rectangle> rectangleList) {
        if (rectangleList.size() == 0){
            return null;
        }
        Rectangle rectangle = rectangleList.get(0);
        for (Rectangle rectangleItem : rectangleList) {
            if(rectangleItem.isBetterThan(rectangle)){
                rectangle = rectangleItem;
            }
        }
        return rectangle;
    }
}
