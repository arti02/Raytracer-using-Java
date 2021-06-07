package fgk.zad1.scene;


import fgk.zad1.Lights.PointSource;
import fgk.zad1.Lights.Source;
import fgk.zad1.basics.*;
import fgk.zad1.material.Material;
import fgk.zad1.utilitis.Lightintencity;

import javax.security.auth.callback.TextInputCallback;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

import static fgk.zad1.obj.ObjReader.readFile;

public class World {
    /**Definicja swiata i wszystkich obiektów
     */
    public ViewPlane viewPlane;
    public List<GraphicsObject> objects;
    public Lightintencity background;
    public List<Source> lights;
    public World(int width,int heigth, double sizeOfPixel) throws IOException {
        viewPlane=new ViewPlane(width,heigth, sizeOfPixel);
        /**kolor tla
         *
         */
        background= new Lightintencity(0,0,0.1f);
        /**List który przechowywuje wszystkie obiekty
         *
         */
        lights = new ArrayList<>();
        objects=new ArrayList<GraphicsObject>();

        /**Wczytywanie pliku z OBJ
         *
         */
//      Mesh mesh=readFile("Sfere1.obj");
//        List<Triangle> a=mesh.getList();
////        /**Skalowanie
////         *
//////         */
//        for (Triangle n:a){
//            System.out.println(n.toString());
//            n.skale(30);
//        }
//        objects.addAll(a);
//   objects.add(new Surface(new Vector3(0,0,0),new Vector3(0,1,0),new Lightintencity(1,1,0)));
       objects.add(new Sphere(new Vector3(-100,0,200),50,new Lightintencity(0.5f,0.1f,1),
               new Material(new Vector3(1f,0.6f,0.6f),new Vector3(0.6f,01.f,0.6f))));
        objects.add(new Sphere(new Vector3(100,0,200),50,new Lightintencity(0f,0.7f,0.4f),
                new Material(new Vector3(1f,0.6f,0.6f),new Vector3(0.6f,01.f,0.6f))));
    }

}
