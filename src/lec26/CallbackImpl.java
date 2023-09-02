package lec26;

public class CallbackImpl implements ITaskProgressCallBack {

    private final TaskFactory taskFactory;

    public CallbackImpl(TaskFactory factory) {
        this.taskFactory = factory;
    }

    @Override
    public void updateTask(Task task) {
        taskFactory.updateTask(task);
    }
}
