package Chapter13;

public class Polymorphism {
    public static void main(String[] args) {


        SuperClass superclass = new SubClass();

        new SuperClass().invokeInstanceMethod();

        superclass.invokeInstanceMethod();
        ((SubClass) superclass).invokeInstanceMethod("s");

        Pet cat = new Cat();

        Animal a = new Animal();


//        File img = new Image("/path/to/file/img.png", 480, 640, 343);

//        img.printFileInfo();

    }
}

    class File {

        protected String fullName;

        // constructor with a single parameter

        // getters and setters

        public void printFileInfo() {
            String info = this.getFileInfo(); // here is polymorphic behavior!!!
            System.out.println(info);
        }

        protected String getFileInfo() {
            return "File: " + fullName;
        }
    }

    class ImageFile extends File {

        protected int width;
        protected int height;
        protected byte[] content;

        // constructor

        // getters and setters

        @Override
        protected String getFileInfo() {
            return String.format("Image: %s, width: %d, height: %d", fullName, width, height);
        }
    }


    class SuperClass {

        public int a;

        public SuperClass() {
            System.out.println("inside superclass constructor");
        }

        public void invokeInstanceMethod() {
            System.out.println("SuperClass: invokeInstanceMethod");
        }
    }

    class SubClass extends SuperClass {

        public int b;

        public SubClass() {
            super();

            System.out.println("inside subclass constructor");
        }

        public void invokeInstanceMethod() {
            System.out.println("SubClass: invokeInstanceMethod is overridden");
        }

        // @Override -- method doesn't override anything
        public void invokeInstanceMethod(String s) {
            System.out.println("SubClass: overloaded invokeInstanceMethod(String)");
        }
    }


    class Animal {

        protected int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    class Pet extends Animal {

        protected String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class Cat extends Pet {

        protected String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
