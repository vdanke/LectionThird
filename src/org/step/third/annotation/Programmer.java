package org.step.third.annotation;

@OurPeople
@OurReallyPeople
public class Programmer<T> {

    @OurPeople
//    @OurReallyPeople
    private String someText;

    @SuppressWarnings(value = "unchecked")
    public String getSomeText() {
        T someText = (T) this.someText;
        return this.someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }
}
