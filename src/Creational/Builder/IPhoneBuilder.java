package Creational.Builder;

public class IPhoneBuilder {

    private String fieldA;
    private String fieldB;
    private String fieldC;
    private Integer fieldD;
    private Boolean fieldE;
    private Long fieldF;

    public static IPhoneBuilder startBuild() {
        return new IPhoneBuilder();
    }

    public IPhone build() {
        IPhone iPhone = new IPhone();
        iPhone.setFieldA(fieldA);
        iPhone.setFieldB(fieldB);
        iPhone.setFieldC(fieldC);
        iPhone.setFieldD(fieldD);
        iPhone.setFieldE(fieldE);
        iPhone.setFieldF(fieldF);

        return iPhone;
    }

    public IPhoneBuilder setFieldA(String fieldA) {
        this.fieldA = fieldA;
        return this;
    }

    public IPhoneBuilder setFieldB(String fieldB) {
        this.fieldB = fieldB;
        return this;
    }

    public IPhoneBuilder setFieldC(String fieldC) {
        this.fieldC = fieldC;
        return this;
    }

    public IPhoneBuilder setFieldD(Integer fieldD) {
        this.fieldD = fieldD;
        return this;
    }

    public IPhoneBuilder setFieldE(Boolean fieldE) {
        this.fieldE = fieldE;
        return this;
    }

    public IPhoneBuilder setFieldF(Long fieldF) {
        this.fieldF = fieldF;
        return this;
    }
}
