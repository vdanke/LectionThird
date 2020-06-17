package org.step.six.thread.group;

public class ThreadGroupExample {

    public static void main(String[] args) throws Exception {
        ThreadGroup first = new ThreadGroup("The main thread group");
        ThreadGroup second = new ThreadGroup(first, "The child thread group");

        int i = first.activeCount();
        int i1 = first.activeGroupCount();
        first.checkAccess();
        first.destroy();
        int enumerate = first.enumerate(new Thread[]{});
        int enumerate1 = first.enumerate(new ThreadGroup[]{});
        int maxPriority = first.getMaxPriority();
        String name = first.getName();
        ThreadGroup new_group = first.getParent() != null ? first.getParent() : new ThreadGroup("new Group");
        first.interrupt();
        first.isDaemon();
        first.isDestroyed();
        first.list();
        boolean b = first.parentOf(second);
        first.setDaemon(true);
        first.setMaxPriority(7);
    }
}
