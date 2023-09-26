package OOP2.Camera;

public class C_Practice {
    public static void main(String[] args) {





        OOP2.Camera.Lens gg1 = new OOP2.Camera.Lens(100, 1001);
        OOP2.Camera.Lens gg2 = new OOP2.Camera.Lens(100, 1002);
        OOP2.Camera.Lens gg3 = new OOP2.Camera.Lens(100, 1003);

        OOP2.Camera.Camera camera1 = new OOP2.Camera.Camera("keine Ahnung1", 155, 1010, true, gg1);
        OOP2.Camera.Camera camera2 = new OOP2.Camera.Camera("keine Ahnung3", 158, 1100, true, gg2);
        OOP2.Camera.Camera camera3 = new OOP2.Camera.Camera("keine Ahnung4", 159, 101, true, gg3);
        camera1.setBrand("keine Ahnung 2");
        System.out.println(camera1.toString());
        camera1.getBrand();

        System.out.println(gg1.toString());
        System.out.println(camera3.toString());

        camera2.getDisplaySize();
    }
}
