public class ProblemThree {
    public static void main(String[] args) {
        ComparableCircle simpleCircleOne = new ComparableCircle(10);
        ComparableCircle simpleCircleTwo = new ComparableCircle(10);

        if (simpleCircleOne.compareTo(simpleCircleTwo) > 0)
            System.out.println(String.format("The cirle with radius %.2f is greater than the circle with radius %.2f",
                    simpleCircleOne.getRadius(), simpleCircleTwo.getRadius()));
        else if (simpleCircleOne.compareTo(simpleCircleTwo) < 0)
            System.out.println(String.format("The cirle with radius %.2f is less than the circle with radius %.2f",
                    simpleCircleOne.getRadius(), simpleCircleTwo.getRadius()));
        else
            System.out.println(String.format("The cirle with radius %.2f is equals to the circle with radius %.2f",
                    simpleCircleOne.getRadius(), simpleCircleTwo.getRadius()));

        Rectangle simpleRectangle = new Rectangle(10, 12);
        if (simpleCircleOne.compareTo(simpleRectangle) > 0)
            System.out.println(String.format(
                    "The cirle with radius %.2f is greater than the rectangle with width %.2f and hieght %.2f",
                    simpleCircleOne.getRadius(), simpleRectangle.getWidth(), simpleRectangle.getHeight()));
        else if (simpleCircleOne.compareTo(simpleRectangle) < 0)
            System.out.println(String.format(
                    "The cirle with radius %.2f is less than the rectangle with width %.2f and hieght %.2f",
                    simpleCircleOne.getRadius(), simpleRectangle.getWidth(), simpleRectangle.getHeight()));
        else
            System.out.println(String.format(
                    "The cirle with radius %.2f is equals the rectangle with width %.2f and hieght %.2f",
                    simpleCircleOne.getRadius(), simpleRectangle.getWidth(), simpleRectangle.getHeight()));
    }
}
