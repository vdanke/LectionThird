package org.step.seventh.exampl;

public class Admin implements UserService {

    @Override
    public void talk() {
        System.out.println("Admin is talking");
    }
}
