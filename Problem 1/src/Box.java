public class Box {
    double height,width,depth;

    Box(double h,double w,double d){
        height = h;
        width = w;
        depth = d;
    }
    void displayVol(){
        double volume= height*width*depth;
        System.out.println("The volume of the box is: "+volume);

    }


}
