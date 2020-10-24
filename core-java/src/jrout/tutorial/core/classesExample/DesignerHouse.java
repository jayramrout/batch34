package jrout.tutorial.core.classesExample;

public class DesignerHouse {
    // DesignerKitchen
    private LivingRoom livingRoom;
    private DesignerKitchen designerKitchen;

     class DesignerKitchen {
        public void lights(){
            System.out.println(livingRoom);
        }
    }
}

