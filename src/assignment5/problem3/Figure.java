package assignment5.problem3;

public interface Figure {
    void getFigure();

}

 class UpwardHat implements Figure{
    @Override
    public void getFigure() {
        System.out.print("/\\");
    }

}
class DownwardHat implements Figure{
    @Override
    public void getFigure() {
        System.out.print("\\"+"/");
    }
}
class FaceMaker implements Figure{
    @Override
    public void getFigure() {
        System.out.print(":)");
    }
}
class Vertical implements Figure{
    @Override
    public void getFigure() {
        System.out.print("||");
    }
}

class Driver {
    public static void main(String[] args) {
        Figure[] figures = {new UpwardHat(),new UpwardHat(),new DownwardHat(),new FaceMaker(),new Vertical()};
        for (Figure figure: figures){
            figure.getFigure();
        }
    }
}