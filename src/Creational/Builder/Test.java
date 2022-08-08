package Creational.Builder;

public class Test {
    public static void main(String[] args) {
        IPhone iPhone = IPhoneBuilder.startBuild()
                .setFieldA("ege")
                .setFieldA("elif")
                .build();
    }

}
