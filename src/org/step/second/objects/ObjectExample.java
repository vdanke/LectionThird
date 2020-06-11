package org.step.second.objects;

public class ObjectExample {

    private String objectName;
    private int objectAge;

    public ObjectExample() {
    }

    public ObjectExample(String objectName, int objectAge) {
        this.objectName = objectName;
        this.objectAge = objectAge;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public int getObjectAge() {
        return objectAge;
    }

    public void setObjectAge(int objectAge) {
        this.objectAge = objectAge;
    }

    @Override
    public int hashCode() {
        int result = 17;
        int randomNumber = 31;

        if (objectName != null) {
            result = randomNumber * result + objectName.hashCode();
        }
        result = randomNumber * result + objectAge;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!this.getClass().isAssignableFrom(obj.getClass())) {
            return false;
        }
        ObjectExample other = (ObjectExample) obj;

        boolean isObjectNameEquals = (this.objectName == null && other.objectName == null) ||
                (this.objectName != null && this.objectName.equals(other.objectName));

        boolean isObjectAgeEquals = this.objectAge == other.objectAge;

        return isObjectAgeEquals && isObjectNameEquals;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Object name is " + objectName + " and object age is " + objectAge;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'll be back");
        Thread.sleep(100);
    }
}
