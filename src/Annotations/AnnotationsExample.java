package Annotations;

public class AnnotationsExample {

    // Annotations are used to provide metadata for Java code. Annotations don't
    // modify the execution of code; however, they can be consumed in order to
    // perform additional logic.

    // A Java annotation, in its shortest form, looks like this:

    // @Entity

    // *** The @ character signals to the compiler that this is an annotation. The
    // name following the @ character is the name of the annotation. *** \\

    // A Java annotation can also have elements for which you can set 'values'.

    // @Entity (tableName = "vehicles")

    // An annotation can contain multiple elements.
    // @Entity (tableName = "vehicles" , primaryKey = "id")

    // If an annotation contains a single element, it's convention
    // to name it 'value'.

    // @TextTransformation(value = "uppercase")

    // If an annotation contains a single element named 'value', you
    // can omit its name.

    //@TextTransformation("uppercase")


    // *** Placement *** \\

    // You can place Java annotations above:
    //  .classes.
    //  .interfaces.
    //  .fields.
    //  .local variables.

//    @Entity // annotating a class
//    public class Product {
//        @Persistent // annotating a method
//        protected String name = null;
//
//        @Getter // annotating a method
//        public String getName(){
//            return name;
//        }
//
//        // annotating a parameter
//        public void setName(@Optional name) {
//            this.name = name;
//        }
//
//        public List addToCart(List cart) {
//            @Optional // annotating a local variable
//            List localCart = cart == null ? new ArrayList() : cart;
//            localCart.add(getName());
//            return localCart;
//        }
//    }

    //  *** Built-in Annotations *** \\

    // Java annotations are classified in 2 main groups:
    //  .Compile-time annotations.
    //  .Rin-time annotations.

    // Java comes with three comile-time annotations which are used
    // to give the compiler instructions.
    //  .@Deprecated
    //  .@Override
    //  .@SuppressWarnings

    // @Deprecated

    // The @Deprecated annotation is used to indicate that a class,
    // method, or field 'should no longer be used.' If that class,
    // method, or field is used, the compiler will give you a warning
    // when the code is compiled. Most IDEs will also show a visual
    // indication of this in some form of fashion.

    @Deprecated
    public class MyComponent {
    }

    // It can also be used above method and field declarations.

    // @Override

    // The @Override annotation is used above methods that are
    // intended to override a method in a superclass. If the method
    // does not match a method in the superclass, the compiler will
    // give you an error. This annotation is not necessary in order
    // to override a method in a superclass, but it is considered good
    // practice to include it.

    // This annotation is meant to indicate intention. That way, if
    // a developer meant to override a method, but made a mistake in
    // the method definition, the mistake can be caught at compile-time;
    // that is, we can catch the mistake sooner rather than later.


}
